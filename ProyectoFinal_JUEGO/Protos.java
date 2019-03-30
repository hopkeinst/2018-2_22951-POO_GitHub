import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Protos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Protos extends Actor
{
    public final int poblacion = 100;
    private int energia;
    public int nPoblacion;
    public int direccion;
    public int probabilidad;

    /**
     * Act - do whatever the Protos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        noTocarBaseCuraion();
        noTocarBarrera();
        noTocarDeposito();
        noTocarMinaDeGas();
        noTocarMinaDeOro();
        mover();

        this.energia += energia;
    }

    public void mover(){
        probabilidad = Greenfoot.getRandomNumber(100);
        World m = getWorld();
        move(5);

        if( probabilidad ==75){
            turn(Greenfoot.getRandomNumber(360));
        }

        if(getX() >= m.getWidth()-5 || getX()<=5)
        {
            turn(180);
            if(Greenfoot.getRandomNumber(100)<90)
            {
                turn(Greenfoot.getRandomNumber(90-45));
            }
        }

        if(getY() >= m.getHeight()-5 || getY()<=5)
        {
            turn(180);
            if(Greenfoot.getRandomNumber(100)<90)
            {
                turn(Greenfoot.getRandomNumber(90-45));
            }
        }

    }

    public Protos(){
        energia = 100;
    }

    public int getEnergia(){
        return energia;
    }

    public void setEnergia( int energia ){
    }

    public int getPoblacion(){
        return poblacion;
    }

    public void noTocarBaseCuraion(){
        Actor a = this.getOneIntersectingObject(BaseDeCuracion.class);
        if (a != null){
            turn(180);
            move(5);
        }
    }
    public void noTocarBarrera(){
        Actor a = this.getOneIntersectingObject(Barrera.class);
        if (a != null){
            turn(180);
            move(5);
        }
    }
    public void noTocarDeposito(){
        Actor a = this.getOneIntersectingObject(Deposito.class);
        if (a != null){
            turn(180);
            move(5);
        }
    }
    public void noTocarMinaDeGas(){
        Actor a = this.getOneIntersectingObject(MinaDeGas.class);
        if (a != null){
            turn(180);
            move(5);
        }
    }
    public void noTocarMinaDeOro(){
        Actor a = this.getOneIntersectingObject(MinaDeOro.class);
        if (a != null){
            turn(180);
            move(5);
        }
    }
    
}