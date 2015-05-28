import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Letrero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Letrero extends Actor
{
    /**
     * Act - do whatever the Letrero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private static final Color transparent = new Color(0,0,0,0);
    
    
    public Letrero(String cadena)
    {
        GreenfootImage letrero;
        letrero= new GreenfootImage(cadena,100, java.awt.Color.WHITE, transparent);
        setImage(letrero);
    }
}
