import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Creditos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creditos extends Botones
{
    /**
     * Act - do whatever the Creditos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
          MouseInfo mouse = Greenfoot.getMouseInfo();        
        if(mouse!=null)
        {
            if(Greenfoot.mouseClicked(this))
                ((MundoHarry)getWorld()).creaCreditos();   
            
            }
    }   
        // Add your action code here.  
}
