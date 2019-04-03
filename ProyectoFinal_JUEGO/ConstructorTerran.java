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
    private int recurso;
    
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
        recurso = 0;
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
            setRecurso(0);
        }
    }
public void recogerGas(){
         Actor a = this.getOneIntersectingObject(MinaDeGas.class);
        if (a != null){
            setRecurso(35);
        }
    }
    
    public void recogerOro(){
         Actor a = this.getOneIntersectingObject(MinaDeOro.class);
        if (a != null){
            setRecurso(35);
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
    
    public int getRecurso(){
        return recurso;
    }

    public void setRecurso(int recurso){
        this.recurso = recurso;
    }
    
}