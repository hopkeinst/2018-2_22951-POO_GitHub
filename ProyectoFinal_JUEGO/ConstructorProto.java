
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ConstructorProto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConstructorProto extends Protos
{
    private int recurso;

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
        recurso = 0;
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
    
    
    
    
    public int getRecurso(){
        return recurso;
    }

    public void setRecurso(int recurso){
        this.recurso = recurso;
    }

}
