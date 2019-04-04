import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GuerreroTerran here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GuerreroTerran extends Terran
{
    /**
     * Act - do whatever the GuerreroTerran wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        curacionMedico();
        curacionDeposito();
        ataqueGuerreroProto();
        ataqueConstructorProto();
        ataqueMedicoProto();
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
    
    public void ataqueGuerreroProto(){
        Actor a = this.getOneIntersectingObject(GuerreroTerran.class);

        if (a != null){
        int x = Greenfoot.getRandomNumber(100);
        int daño = (55*x)/100;
        setEnergia(-daño);
        }
    }
    
    public void ataqueConstructorProto(){
        Actor a = this.getOneIntersectingObject(ConstructorProto.class);

        if (a != null){
        int x = Greenfoot.getRandomNumber(100);
        int daño = (30*x)/100;
        setEnergia(-daño);
        }
    }
    
    public void ataqueMedicoProto(){
        Actor a = this.getOneIntersectingObject(MedicoProto.class);

        if (a != null){
        int x = Greenfoot.getRandomNumber(100);
        int daño = (30*x)/100;
        setEnergia(-daño);
        }
    }

}

