
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MedicoTerran here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MedicoTerran extends Terran
{
    private int curacion;

    /**
     * Act - do whatever the MedicoTerran wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        lastimarCurarGuerrero();
        lastimarCurarConstructor();
        curacionDeposito();
        ataqueGuerreroProto();
        ataqueConstructorProto();
        ataqueMedicoProto();
    }    

    public MedicoTerran(){
        setEnergia( 20);

    }

    public void lastimarCurarConstructor(){
        Actor a = this.getOneIntersectingObject(ConstructorProto.class);

        if (a != null){
            int restaCura = (-20);
            if(getEnergia() <= 0){
               setLocation(0 ,0);
            }
            setEnergia(restaCura);
        }
    }
    
    public void lastimarCurarGuerrero(){
        
         Actor a = this.getOneIntersectingObject(GuerreroProto.class);

        if (a != null){
            int restaCura = (-20);
            if(getEnergia() <= 0){
               setLocation(0 ,0);
            }
            setEnergia(restaCura);
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
        Actor a = this.getOneIntersectingObject(MedicoProto.class);
       if (a != null){
            int x = Greenfoot.getRandomNumber(100);
            int daño = (50*x)/100;
            setEnergia(-daño);
        }
    }

}

