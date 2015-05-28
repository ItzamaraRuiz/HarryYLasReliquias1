import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Voldemort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Voldemort extends Enemigos
{
   public Voldemort()
   {

    }
    
    /**
     * Act - do whatever the Voldemort wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.moverVertical();
        move(1);
        Harry h=((MundoHarry)getWorld()).getHarry();
        this.turnTowards(h.getX(),h.getY());
        // Add your action code here.
    }    
    
    
}
