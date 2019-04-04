import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Deposito here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deposito extends Construcciones
{
    private int cantidadDeOroProto;
    private int cantidadDeGasProto;
    private int cantidadDeOroTerran;
    private int cantidadDeGasTerran;
    /**
     * Act - do whatever the Deposito wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        guardadoProto();
        guardadoTerran();
    }   

    public Deposito(){
        cantidadDeOroProto = 0;
        cantidadDeGasProto = 0;
        cantidadDeOroTerran = 0;
        cantidadDeGasTerran = 0;
    }

    // mejorarara
    
    ///
    
    ////
    public void guardadoProto(){
        Actor a = this.getOneIntersectingObject(ConstructorProto.class);
        ConstructorProto a1 = (ConstructorProto)a;
                    

        
        if (a != null){
            if(a1.getUnidadesOroProto() > 0){   
                a1.setLocation(10, 1000);
                setCantidadDeOroProto(a1.getUnidadesOroProto());
            }

            if(a1.getUnidadesGasProto() > 0){
                setCantidadDeGasProto(a1.getUnidadesGasProto());
            }
        }
    }

    public void guardadoTerran(){
        Actor a = this.getOneIntersectingObject(ConstructorTerran.class);
        if(a != null){
            ConstructorTerran ct = new ConstructorTerran();
            if(ct.getunidadesOroTerran() > 0){   
                setCantidadDeOroTerran(ct.getunidadesOroTerran());
            }

            if(ct.getUnidadesGasTerran() > 0){
                setCantidadDeGasTerran(ct.getUnidadesGasTerran());
            }
        }
    }

    public int getCantidadDeOroProto(){
        return cantidadDeOroProto;
    }

    public void setCantidadDeOroProto( int cantidadDeOroProto ){
        this.cantidadDeOroProto +=  cantidadDeOroProto;
    }

    public int getCantidadDeGasProto(){
        return cantidadDeGasProto;
    }

    public void setCantidadDeGasProto( int cantidadDeGasProto ){
        this.cantidadDeGasProto +=  cantidadDeGasProto;
    }

    public int getCantidadDeOroTerran(){
        return cantidadDeOroTerran;
    }

    public void setCantidadDeOroTerran( int cantidadDeOroTerran ){
        this.cantidadDeOroTerran +=  cantidadDeOroTerran;
    }

    public int cantidadDeGasTerran(){
        return cantidadDeGasTerran;
    }

    public void setCantidadDeGasTerran( int cantidadDeGasTerran ){
        this.cantidadDeGasProto +=  cantidadDeGasProto;
    }
}
