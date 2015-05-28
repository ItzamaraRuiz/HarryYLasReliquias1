import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ayuda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ayuda extends Botones
{
    /**
     * Act - do whatever the Ayuda wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
          MouseInfo mouse = Greenfoot.getMouseInfo();        
        if(mouse!=null)
        {
            if(Greenfoot.mouseClicked(this))
                ((MundoHarry)getWorld()).creaAyuda();   
            
            }
        // Add your action code here.
    }    
}
