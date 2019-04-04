
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ConstructorProto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConstructorProto extends Protos
{
    private int unidadesOroProto;
    private int unidadesGasProto;

    /**
     * Act - do whatever the ConstructorProto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        curacionMedico();
        curacionDeposito();
        entregarRecurso();
        recogerGas();
        recogerOro();
        ataqueGuerreroTerran();
        ataqueConstructorTerran();
        ataqueMedicoTerran();
    }    

    public ConstructorProto(){
        unidadesOroProto = 0;
        unidadesGasProto = 0;
    }

    public void curacionMedico(){
        Actor a = this.getOneIntersectingObject(MedicoProto.class);
        if (a != null){
            int aumentoCura = 15;
            if(getEnergia() < 160){
                if(getEnergia()+15 > 160){
                    int x = (getEnergia()+15) - 160;
                    aumentoCura = 15-x;
                }
                setEnergia(aumentoCura);
            }
        }
    }

    public void curacionDeposito(){
        Actor a = this.getOneIntersectingObject(Deposito.class);
        if (a != null){
            int aumentoCura = 25;
            if(getEnergia() < 160){
                if(getEnergia()+25 > 160){
                    int x = (getEnergia()+25) - 160;
                    aumentoCura = 25-x;
                }
                setEnergia(aumentoCura);
            }

        }
    }

    public void entregarRecurso(){
        Actor a = this.getOneIntersectingObject(Deposito.class);
        if (a != null){
            setUnidadesGasProto(0);
            setUnidadesOroProto(0);
        }
    }

    public void recogerGas(){
        Actor a = this.getOneIntersectingObject(MinaDeGas.class);
        if (a != null){
            setUnidadesGasProto(50);            
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
                //if(getUnidadesOro() )

                if(mo.getUnidadesDeMinaOro()-30 <0){
                    int b = x-(mo.getUnidadesDeMinaOro()-30);
                }
                setUnidadesOroProto(x);
            }            
            if(mo.getUnidadesDeMinaOro() == 0){
                setUnidadesOroProto(getUnidadesOroProto());       
            }
        }
    }

    public void ataqueGuerreroTerran(){
        Actor a = this.getOneIntersectingObject(GuerreroTerran.class);
        if (a != null){
            int x = Greenfoot.getRandomNumber(100);
            int daño = (70*x)/100;
            setEnergia(-daño);
        }
    }

    public void ataqueConstructorTerran(){
        Actor a = this.getOneIntersectingObject(ConstructorTerran.class);
        if (a != null){
            int x = Greenfoot.getRandomNumber(100);
            int daño = (50*x)/100;
            setEnergia(-daño);
        }
    }

    public void ataqueMedicoTerran(){
        Actor a = this.getOneIntersectingObject(MedicoTerran.class);
        if (a != null){
            int x = Greenfoot.getRandomNumber(100);
            int daño = (50*x)/100;
            setEnergia(-daño);
        }
    }

    public int getUnidadesOroProto(){
        return unidadesOroProto;
    }

    public void setUnidadesOroProto(int unidadesOroProto){
        this.unidadesOroProto = unidadesOroProto;
    }

    public int getUnidadesGasProto(){
        return unidadesGasProto;
    }

    public void setUnidadesGasProto(int unidadesGasProto){
        this.unidadesGasProto = unidadesGasProto;
    }

}
