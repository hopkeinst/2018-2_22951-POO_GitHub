import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MinaDeOro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MinaDeOro extends Construcciones
{
    private int unidadesDeMinaOro;
  
    /**
     * Act - do whatever the MinaDeOro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        oroTerran();
        oroProto();
    }    

    public MinaDeOro(){
        unidadesDeMinaOro = (100 + Greenfoot.getRandomNumber(300));
    }

    //oro que tiene las minas de oro
    public void oroProto(){
        Actor a = this.getOneIntersectingObject(ConstructorProto.class);

        if (a != null){
            int x = 35;
            if(getUnidadesDeMinaOro()>0){
                if(getUnidadesDeMinaOro()-35<0){
                    int b = ( getUnidadesDeMinaOro()-35 );
                    x = 35 + (b); 
                }
                setUnidadesDeMinaOro(x);
            }
        }
    }

    public void oroTerran(){
        Actor a = this.getOneIntersectingObject(ConstructorTerran.class);

        if (a != null){
            int x = 40;
            if(getUnidadesDeMinaOro()>0){
                if(getUnidadesDeMinaOro()-40<0){
                    int b = ( getUnidadesDeMinaOro()-40 );
                    x = 40 + (b); 
                }
                setUnidadesDeMinaOro(x);
            }
        }
    }

    public int getUnidadesDeMinaOro(){
        return unidadesDeMinaOro;
    }

    public void setUnidadesDeMinaOro( int unidadesDeMinaOro ){
        this.unidadesDeMinaOro -=  unidadesDeMinaOro;
    }
}
