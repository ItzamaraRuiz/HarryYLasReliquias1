import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bruja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Bruja extends Enemigos
{
    
    private int cont;
    
    /**
     * Act - do whatever the Bruja wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Bruja()
    {
        cont=0;
    }
    
    public void act() 
    {
       lanzar();
       super.moverHorizontal();
        
       //super.moverVertical();
        // Add your action code here.
    }    
    
    
    public void lanzar()
    {
        cont++;
        if(cont==5)
        {
            getWorld().addObject(new Fuego(), this.getX(),this.getY());
            //cont=0;
        }
    }
}
