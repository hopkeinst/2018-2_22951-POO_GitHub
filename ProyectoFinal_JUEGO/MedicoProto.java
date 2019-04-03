import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MedicoProto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MedicoProto extends Protos
{
    /**
     * Act - do whatever the MedicoProto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        lastimarCurarConstructor();
        lastimarCurarGuerrero();
        curacionDeposito();
        ataqueGuerreroTerran();
        ataqueConstructorTerran();
        ataqueMedicoTerran();
    } 

    public MedicoProto(){
        setEnergia(20);
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
            int daño = (70*x)/100;
            setEnergia(-daño);
        }
    }

    public void ataqueMedicoTerran(){
        Actor a = this.getOneIntersectingObject(MedicoTerran.class);
       if (a != null){
            int x = Greenfoot.getRandomNumber(100);
            int daño = (70*x)/100;
            setEnergia(-daño);
        }
    }
    

}
