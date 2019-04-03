import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class world here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class world extends World
{

    /**
     * Constructor for objects of class world.
     * 
     */
    public world()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 700, 1);
        BaseDeCuracion bc = new BaseDeCuracion();
        addObject(bc, 580, 280);
        Cementerio c = new Cementerio();
        addObject(c, 0, 0);
        generarTerran();
        generarProtos();

    }

    public void generarProtos(){

        int rmp = Greenfoot.getRandomNumber(10);
        int rcp = Greenfoot.getRandomNumber(5);
        int rgp = ( 100- (35 +rcp + rmp) );
        int i,j,k;

        for(  i=1; i<=(rcp); i++){
            ConstructorProto cp = new ConstructorProto();
            int x = Greenfoot.getRandomNumber(100);
            int y = Greenfoot.getRandomNumber(100);
            addObject( cp, 1000 + x , 100 + y );
        }

        for( j=1; j<=(rmp); j++){
            MedicoProto mp = new MedicoProto();
            int x = Greenfoot.getRandomNumber(100);
            int y = Greenfoot.getRandomNumber(100);
            addObject( mp, 1000 + x , 300 + y );
        }

        for( k=1; k<=5; k++){
            GuerreroProto gp = new GuerreroProto();
            int x = Greenfoot.getRandomNumber(100);
            int y = Greenfoot.getRandomNumber(100);
            addObject( gp, 1000 + x , 500 + y );

        }

    }

    public void generarTerran(){

        int rmt = Greenfoot.getRandomNumber(10);
        int rct = Greenfoot.getRandomNumber(5);
        int rgt = ( 100- (35 + rct + rmt) );
        int i,j,k;

        for( i=1; i<=(rct); i++){
            ConstructorTerran ct = new ConstructorTerran();
            int x = Greenfoot.getRandomNumber(100);
            int y = Greenfoot.getRandomNumber(100);
            addObject( ct, 100 + x , 100 + y );   
        }

        for( j=1; j<=(rmt); j++){
            MedicoTerran mt = new MedicoTerran();
            int x = Greenfoot.getRandomNumber(100);
            int y = Greenfoot.getRandomNumber(100);
            addObject( mt, 100 + x , 300 + y );
        }

        for( k=1; k<=3; k++){
            GuerreroTerran gt = new GuerreroTerran();
            int x = Greenfoot.getRandomNumber(100);
            int y = Greenfoot.getRandomNumber(100);
            addObject( gt, 100 + x , 500 + y );
        }

    }

}
