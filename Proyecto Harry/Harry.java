import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Harry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Harry extends Actor
{
    public static final int ARRIBA = 0; //variable estatica para definir la direccion
    public static final int ABAJO = 1; //variable estatica para definir la direccion
    public static final int IZQUIERDA = 2; //variable estatica para definir la direccion
    public static final int DERECHA = 3; //variable estatica para definir la direccion
    private int speed;//velocidad en la que se mueve el jugador
    private int score;
    
    
    private boolean nivel1;
    private boolean nivel2;
    
    private boolean nivel;
    //private boolean fuego;
    private final int NUM_IMAG = 2;
    
    private int animacion;
    private boolean estaPresTec; 
    //private final GreenfootImage harryDerecha = new GreenfootImage("hc1.png");
    
    private final GreenfootImage[] ImagensWR = new GreenfootImage[NUM_IMAG];//Arreglo de la imagenes de caminar Derecha de el jugador
    private final GreenfootImage[] ImagensWL = new GreenfootImage[NUM_IMAG];
    
    private final GreenfootImage imagenPrin = new GreenfootImage("h1.png");
    
    public  Harry()
    {
        animacion = 0;
        
        score=0;
        speed = 4;
        estaPresTec = false;
        nivel = false;
        nivel1=false;
        nivel2=false;
        
        //fuego=false;
        for(int i = 0; i<NUM_IMAG; i++)
          ImagensWR[i] = new GreenfootImage("hc"+i+".png");
          
          for(int i = 0; i<NUM_IMAG; i++){
             ImagensWL[i] = new GreenfootImage(ImagensWR[i]);
             ImagensWL[i].mirrorHorizontally();
            }
       
        
    }
    
         public void checaLlaves()
        {
            if(this.isTouching(Capa.class)||this.isTouching(Varita.class)||this.isTouching(Piedras.class))
            {
                ((MundoHarry)getWorld()).setLlaves(1);
                if(this.isTouching(Capa.class)) 
                    removeTouching(Capa.class);
                if(this.isTouching(Varita.class)) 
                    removeTouching(Varita.class);
                if(this.isTouching(Capa.class)) 
                    removeTouching(Capa.class);
            
            }
        }
    /**
     * Act - do whatever the Harry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    { 
        mover();
        checaReliquias();
        checaPuntos();
        checaEnemigos();
        checaScroll();
        checaVidas();
        checaMuerte();
        
        
        if(estaPresTec == false)
            this.setImage(imagenPrin);
        
        
    }
    
    
    public void checaScroll()
        {
             if(((MundoHarry)getWorld()).getLlaves()==3&&nivel1==false)
             {
                      ((MundoHarry)getWorld()).Llenar2();
                      nivel1=true;
             }
             if(((MundoHarry)getWorld()).getLlaves()==6&&nivel2==false)
             {
                      ((MundoHarry)getWorld()).Llenar3();
                      nivel2=true;
             }
             if(((MundoHarry)getWorld()).getLlaves()==9)
             {
                ((MundoHarry)getWorld()).gana();
            }
             //checaMuerte();
             
        }
       

    public void mover()
    {
        estaPresTec = false;
        if(Greenfoot.isKeyDown("up"))
                { 
                    estaPresTec = true;
                    
                    setLocation(this.getX(),this.getY()-4);
                    
                    if(!encuentraBloque())
                     setLocation(this.getX(),this.getY()+4);
                    
                }
         if(Greenfoot.isKeyDown("down"))
                {                      
                    estaPresTec = true;
                    
                    setLocation(this.getX(),this.getY()+4);
                    
                    if(!encuentraBloque())
                     setLocation(this.getX(),this.getY()-4);
                     
                }
         if(Greenfoot.isKeyDown("left"))
                {                    
                     
                    estaPresTec = true;
                    switch(animacion)
                    {
                        case 5: setImage(ImagensWL[0]);
                        break;
                        case 10: setImage(ImagensWL[1]);
                        break;
                        case 15: animacion = 0;
                    }
                    animacion ++;
                    
                    setLocation(this.getX()-2,this.getY());
                    
                    if(!encuentraBloque())
                     setLocation(this.getX()+2,this.getY());
                    
                }
         if(Greenfoot.isKeyDown("right"))
                {   
                    estaPresTec = true;
                    switch(animacion)
                    {
                    case 5: setImage(ImagensWR[0]);
                    break;
                    case 10: setImage(ImagensWR[1]);
                    break;
                    case 15: animacion = 0;
                }
                animacion ++;
                setLocation(this.getX()+2,this.getY());
                                 
                    if(!encuentraBloque())
                     setLocation(this.getX()-2,this.getY());
                     
                }    
            
        }
      
    
        public boolean encuentraReliquias()
        {
            Actor p = getOneObjectAtOffset(0, 0, Piedra.class);
            Actor c = getOneObjectAtOffset(0, 0, Capa.class);
            Actor v = getOneObjectAtOffset(0, 0, Varita.class);
            
            if(p != null && c != null && v != null)
            {
                return true;
            }
            else
            {
                return false;
            }
            

        }
        
        
        public void checaReliquias()
      {
        if(this.isTouching(Varita.class) || this.isTouching(Capa.class) ||this.isTouching(Piedra.class))
        {
           this.removeTouching(Varita.class);
           this.removeTouching(Capa.class);
           this.removeTouching(Piedra.class);
           ((MundoHarry)getWorld()).setLlaves(1);
           
        }
        
        
     }
           
    public void checaPuntos()
    {
       if(this.isTouching(Amarilla.class))
          {
            ((MundoHarry)getWorld()).setScore(50);
            }
       if(this.isTouching(Azul.class))
          {
            ((MundoHarry)getWorld()).setScore(100);
            }
      
       this.removeTouching(Piedras.class);
       
    }
    
    public void checaEnemigos()
    {
        if(this.isTouching(Dementor.class))
        {
            ((MundoHarry)getWorld()).setScore(-20); 
            this.setLocation(15,45);
            
        }
        
    }
 
    public boolean encuentraBloque()
    {
        Actor blk = getOneObjectAtOffset(0, 0, Bloque.class);
        if(blk != null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
     public void checaBloque()
    {
        Actor blk = getOneObjectAtOffset(0, 0, Bloque.class);
        if(blk != null)
        {
             setLocation(getX(),getY());
        }
        else{
            mover();
        }
        
    }
    
     public void checaMuerte()
    {
        if(((MundoHarry)getWorld()).getVidas() == 0 || this.isTouching(Voldemort.class)) 
        {
            ((MundoHarry)getWorld()).muerte();
        }
    }
 
    
    public void checaVidas()
    {
        if(this.isTouching(Fuego.class))
        {
            ((MundoHarry)getWorld()).setVidas(-1); 
            //this.setLocation(15,15);
        
        }
    }
   
}
        
            
    





