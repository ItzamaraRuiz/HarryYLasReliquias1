import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fuego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fuego extends Actor
{
    /**
     * Act - do whatever the Fuego wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Fuego()
    {
        
    }
    
    public void act() 
    {
        move(1);
        Harry h=((MundoHarry)getWorld()).getHarry();
        this.turnTowards(h.getX(),h.getY());
        // Add your action code here.
    }    
}
