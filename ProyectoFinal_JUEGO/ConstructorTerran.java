import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ConstructorTerran here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConstructorTerran extends Terran
{
    /**
     * Act - do whatever the ConstructorTerran wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int unidadesOroTerran;
    private int unidadesGasTerran;
    public void act() 
    {
        super.act();
        curacionMedico();
        curacionDeposito();
        entregarRecurso();
        recogerGas();
        recogerOro();
        ataqueGuerreroProto();
        ataqueConstructorProto();
        ataqueMedicoProto();
    }   

    public ConstructorTerran(){
        unidadesOroTerran = 0;
        unidadesGasTerran = 0;
    }

    public void curacionMedico(){
        Actor a = this.getOneIntersectingObject(MedicoTerran.class);
        if (a != null){
            int aumentoCura = 20;
            if(getEnergia() < 160){
                if(getEnergia()+20 > 160){
                    int x = (getEnergia()+20) - 160;
                    aumentoCura = 20-x;
                }
                setEnergia(aumentoCura);
            }
        }
    }

    public void curacionDeposito(){
        Actor a = this.getOneIntersectingObject(Deposito.class);
        if (a != null){
            int aumentoCura = 20;
            if(getEnergia() < 160){
                if(getEnergia()+20 > 160){
                    int x = (getEnergia()+20) - 160;
                    aumentoCura = 20-x;
                }
                setEnergia(aumentoCura);
            }
        }
    }

    public void entregarRecurso(){
        Actor a = this.getOneIntersectingObject(Deposito.class);
        if (a != null){
            SetUnidadesOroTerran(0);
        }
    }

    public void recogerGas(){
        Actor a = this.getOneIntersectingObject(MinaDeGas.class);
        if (a != null){
            SetUnidadesGasTerran(50);
        }
    }

    public void recogerOro(){
        Actor a = this.getOneIntersectingObject(MinaDeOro.class);
        if (a != null){
            int x = 30;
            MinaDeOro mo = new MinaDeOro();
            // si la mina de oro no tiene las 30 unidades de oro solo dara las que tenga 
            //si no tiene  no entregara nada al constructor
            if(mo.getUnidadesDeMinaOro()>0){ 

                if(mo.getUnidadesDeMinaOro()-30 <0){
                    int b = x-(mo.getUnidadesDeMinaOro()-30);
                }
                SetUnidadesOroTerran(x);
            }

            if(mo.getUnidadesDeMinaOro() == 0){
                SetUnidadesOroTerran(getunidadesOroTerran());       
            }
        }
    }

    public void ataqueGuerreroProto(){
        Actor a = this.getOneIntersectingObject(GuerreroProto.class);
        if (a != null){
            int x = Greenfoot.getRandomNumber(100);
            int daño = (70*x)/100;
            setEnergia(-daño);
        }
    }

    public void ataqueConstructorProto(){
        Actor a = this.getOneIntersectingObject(ConstructorProto.class);
        if (a != null){
            int x = Greenfoot.getRandomNumber(100);
            int daño = (50*x)/100;
            setEnergia(-daño);
        }
    }

    public void ataqueMedicoProto(){
        Actor a = this.getOneIntersectingObject(MedicoTerran.class);
        if (a != null){
            int x = Greenfoot.getRandomNumber(100);
            int daño = (50*x)/100;
            setEnergia(-daño);
        }
    }

    public int getunidadesOroTerran(){
        return unidadesOroTerran;
    }

    public void SetUnidadesOroTerran(int unidadesOroTerran){
        this.unidadesOroTerran = unidadesOroTerran;
    }

    public int getUnidadesGasTerran(){
        return unidadesGasTerran;
    }

    public void SetUnidadesGasTerran(int unidadesGasTerran){
        this.unidadesGasTerran = unidadesGasTerran;
    }

}