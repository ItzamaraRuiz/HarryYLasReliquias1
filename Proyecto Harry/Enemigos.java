import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemigos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemigos extends Actor
{
    private int velX; //Velocidad horizontal a la que se mueve el enemigo
    private int velY;
    
    /**
     * Act - do whatever the Enemigos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Enemigos()
    {
        velX=1;
        velY=1;
    }
    
    public void act() 
    {

        // Add your action code here.
    }  
    
    public void moverHorizontal()
    {
        
        if(this.isTouching(Bloque.class))
            velX=-velX;
            setLocation(getX()+velX,getY());
    }
     public void moverVertical()
    {
        
        if(this.isTouching(Bloque.class))
            velY=-velY;
            setLocation(getX(),getY()+velY);
    }
}
