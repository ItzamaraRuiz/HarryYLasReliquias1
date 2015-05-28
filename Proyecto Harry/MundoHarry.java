
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import javax.management.timer.*;
import java.util.Random;

/**
 * Write a description of class MundoHarry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

//public static final long ONE_MINUTE;

public class MundoHarry extends World
{

    private Harry harry;
    private Counter mensajePuntos;
    private Counter mensajeVidas;
    private Counter mensajeTiempo;
    private Counter mensajeNivel;
    private Counter mensajeLlaves;
    //private Counter tiempo;
    private int score;
    private int vidas;
    private int puntos = 0;
    private int nivel;
    private int llaves=0;
    private SimpleTimer tiempo;
    private int contador;
    
    
    
    /**
     * Constructor for objects of class MundoHarry.
     * 
     */
       public void setLlaves(int newLlave)
    {
        llaves=llaves+newLlave;
    }
    public int getLlaves()
    {
        return llaves;
    }
   
    
    
    public void muerte()
    
    {
        this.removeObjects(this.getObjects(null));
        Letrero l= new Letrero("PERDISTE");
        addObject(l,400,100);
       
        Greenfoot.stop();
        //creaMenu();

    }
     public int getNivel()
    {
        return nivel;
    }
    public void setNivel(int nuevoNivel)
    {
        nivel=nuevoNivel;
    }
    public MundoHarry()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 460, 1);
        
        vidas = 5;
        score = 0;
        nivel = 1;
        
        mensajePuntos = new Counter("Puntos: ");
        mensajePuntos.setValue(score);
        
        mensajeVidas = new Counter("Vidas: ");
        mensajeVidas.setValue(score);
        
        mensajeTiempo = new Counter("Tiempo: ");
        mensajeTiempo.setValue(score);
        
        mensajeNivel = new Counter("Nivel: ");
        mensajeNivel.setValue(nivel);
        
        mensajeLlaves = new Counter("LLAVES: ");
        mensajeLlaves.setValue(llaves);
        
        
        tiempo =new SimpleTimer();
        tiempo.mark();
        
        
        this.setPaintOrder(Counter.class);
        creaMenu();
        
        
    }
   
    
     public Harry getHarry()
    {
        return harry;
    }
    
     public void setScore(int nuevo)
    {
        score=score+nuevo;
    }
    
    
    public void act()
    {
        mensajePuntos.setValue(score);
        mensajeVidas.setValue(vidas);
        //mensajeLlaves.setValue(llaves);
        // mensajeTiempo.setValue(tiempo);
        mensajeNivel.setValue(nivel);
       if(tiempo.millisElapsed()>=1000)
            {             
                tiempo.mark();
                mensajeTiempo.add(1);
                contador++;
            }
           
            
       checaTiempo();
       
    }
    
    public void setVidas(int nuevo)
    {
        vidas=vidas+nuevo;
    }
    
    public int getVidas()
    {
        return vidas;
    }
    public int getScore()
    {
        return score;
    }
    
    
    
    public void creaAyuda()
    {
     
        removeObjects( getObjects(Actor.class) );
        setBackground("Ayuda.png");
        addObject(new Jugar(),650, 420);
    
    }
    
    public void creaCreditos()
    {
        removeObjects(getObjects(Actor.class));
        setBackground("Creditos.png");
        addObject(new Jugar(),650, 400);
        
    }
    
     public void creaMenu()
    {
    
        vidas = 4;
        nivel = 1;
        
        removeObjects(getObjects(Actor.class));
        setBackground("Menu.jpg");
        addObject(new Jugar(),200,50);
        addObject(new Ayuda(),400,200);
        addObject(new Creditos(),600,50);
        //addObject(new Records(),710,52220);*/
    }
    
    public void checaTiempo()
    {
        if(contador >= 60)
        {
            this.removeObjects(this.getObjects(null));
            Letrero l= new Letrero("SE ACABO TU\n TIEMPO");
            addObject(l,400,100);
            Greenfoot.stop();
            
            
            addObject(new Jugar(), 650, 420);
            
        }
    }
    
    void gana()
        {
               Letrero lose;
               lose=new Letrero("FELICIDADES GANASTE");
               addObject(lose,350,280);
               //musica.stop();
               creaMenu();
               //creaRecords();  
        }
    
   
    
    
    public void Llenar()
    {
        nivel = 1;
        
        removeObjects(getObjects(null));
        
        addObject(mensajePuntos, 600, 450);
        addObject(mensajeVidas, 500, 450);
        addObject(mensajeTiempo, 700, 450);
       
        
        this.setBackground("Nivel1.jpg");
   
        harry =new Harry();
        addObject (harry, 15, 45);
        
        Bloque b = new Bloque();
        addObject(b, 20, 15);
        
        Bloque b1 = new Bloque();
        addObject(b1, 55, 15);
        
        Bloque b2 = new Bloque();
        addObject(b2, 90, 15);
        
        Bloque b3 = new Bloque();
        addObject(b3, 125, 15);
        
        Bloque b4 = new Bloque();
        addObject(b4, 160, 15);
        
        Bloque b5 = new Bloque();
        addObject(b5, 195, 15);
        
        Bloque b6 = new Bloque();
        addObject(b6, 55, 80);
        
        Bloque b7 = new Bloque();
        addObject(b7, 90, 80);
        
        Bloque b8 = new Bloque();
        addObject(b8, 125, 80);
        
        Bloque b9 = new Bloque();
        addObject(b9, 160, 80);
        
        Bloque b11 = new Bloque();
        addObject(b11, 195, 80);
        
        Bloque b12 = new Bloque();
        addObject(b12, 230, 80);
        
        Bloque b13 = new Bloque();
        addObject(b13, 265, 80);
        
        Bloque b14 = new Bloque();
        addObject(b14, 300, 80);
        
        Bloque b15 = new Bloque();
        addObject(b15, 90, 145);
        
        Bloque b16 = new Bloque();
        addObject(b16, 125, 145);
        
        Bloque b17 = new Bloque();
        addObject(b17, 160, 145);
        
        Bloque b18 = new Bloque();
        addObject(b18, 195, 145);
        
        Bloque b19 = new Bloque();
        addObject(b19, 20, 210);
        
        Bloque b20 = new Bloque();
        addObject(b20, 55, 210);
        
        Bloque b21 = new Bloque();
        addObject(b21, 90, 210);
        
        Bloque b22 = new Bloque();
        addObject(b22, 195, 210);
        
        Bloque b23 = new Bloque();
        addObject(b23, 230, 210);
        
        Bloque b24 = new Bloque();
        addObject(b24, 265, 210);
        
        Bloque b25 = new Bloque();
        addObject(b25, 300, 210);
        
        Bloque b26 = new Bloque();
        addObject(b26, 335, 210);
        
        Bloque b27 = new Bloque();
        addObject(b27, 370, 210);
        
        Bloque b28 = new Bloque();
        addObject(b28, 330, 15);
        
        Bloque b29 = new Bloque();
        addObject(b29, 365, 15);
        
        Bloque b30 = new Bloque();
        addObject(b30, 400, 15);
        
        Bloque b31 = new Bloque();
        addObject(b31, 435, 15);
        
        Bloque b32 = new Bloque();
        addObject(b32, 470, 15);
        
        Bloque b33 = new Bloque();
        addObject(b33, 505, 15);
        
        Bloque b34 = new Bloque();
        addObject(b34, 335, 145);
        
        Bloque b35 = new Bloque();
        addObject(b35, 370, 145);
        
        Bloque b36 = new Bloque();
        addObject(b36, 405, 145);
        
        Bloque b37 = new Bloque();
        addObject(b37, 440, 145);
        
        Bloque b38 = new Bloque();
        addObject(b38, 475, 145);
        
        Bloque b39 = new Bloque();
        addObject(b39, 510, 145);
        
        Bloque b40 = new Bloque();
        addObject(b40, 465, 80);
        
        Bloque b41 = new Bloque();
        addObject(b41, 500, 80);
        
        Bloque b42 = new Bloque();
        addObject(b42, 535, 80);
        
        Bloque b43 = new Bloque();
        addObject(b43, 570, 80);
        
        Bloque b44 = new Bloque();
        addObject(b44, 605, 80);
        
        Bloque b45 = new Bloque();
        addObject(b45, 640, 80);
        
        Bloque b47 = new Bloque();
        addObject(b47, 605, 15);
        
        Bloque b48 = new Bloque();
        addObject(b48, 640, 15);
        
        Bloque b49 = new Bloque();
        addObject(b49, 675, 15);
        
        Bloque b50 = new Bloque();
        addObject(b50, 710, 15);
        
        Bloque b51 = new Bloque();
        addObject(b51, 745, 15);
        
        Bloque b52 = new Bloque();
        addObject(b52, 780, 15);
        
        Bloque b53 = new Bloque();
        addObject(b53, 745, 80);
        
        Bloque b54 = new Bloque();
        addObject(b54, 780, 80);
        
        Bloque b55 = new Bloque();
        addObject(b55, 640, 145);
        
        Bloque b56 = new Bloque();
        addObject(b56, 675, 145);
        
        Bloque b57 = new Bloque();
        addObject(b57, 710, 145);
        
        Bloque b58 = new Bloque();
        addObject(b58, 510, 210);
        
        Bloque b59 = new Bloque();
        addObject(b59, 545, 210);
        
        Bloque b60 = new Bloque();
        addObject(b60, 580, 210);
        
        Bloque b61 = new Bloque();
        addObject(b61, 615, 210);
        
        Bloque b62 = new Bloque();
        addObject(b62, 710, 210);
        
        Bloque b63 = new Bloque();
        addObject(b63, 745, 210);
        
        Bloque b64 = new Bloque();
        addObject(b64, 780, 210);
        
        Bloque b65 = new Bloque();
        addObject(b65, 55, 275);
        
        Bloque b66 = new Bloque();
        addObject(b66, 90, 275);
        
        Bloque b67 = new Bloque();
        addObject(b67, 125, 275);
        
        Bloque b68 = new Bloque();
        addObject(b68, 160, 275);
        
        Bloque b69 = new Bloque();
        addObject(b69, 195, 275);
        
        Bloque b70 = new Bloque();
        addObject(b70, 230, 275);
        
        Bloque b71 = new Bloque();
        addObject(b71, 370, 275);
        
        Bloque b72 = new Bloque();
        addObject(b72, 405, 275);
        
        Bloque b73 = new Bloque();
        addObject(b73 , 440, 275);
        
        Bloque b74 = new Bloque();
        addObject(b74, 475, 275);
        
        Bloque b75 = new Bloque();
        addObject(b75, 510, 275);
        
        Bloque b76 = new Bloque();
        addObject(b76, 615, 275);
        
        Bloque b77 = new Bloque();
        addObject(b77, 650, 275);
        
        Bloque b78 = new Bloque();
        addObject(b78, 685, 275);
        
        Bloque b79 = new Bloque();
        addObject(b79, 720, 275);
        
        Bloque b80 = new Bloque();
        addObject(b80, 20, 340);
        
        Bloque b81 = new Bloque();
        addObject(b81, 55, 340);
        
        Bloque b82 = new Bloque();
        addObject(b82, 160, 340);
        
        Bloque b83 = new Bloque();
        addObject(b83, 195, 340);
        
        Bloque b84 = new Bloque();
        addObject(b84, 230, 340);
        
        Bloque b85 = new Bloque();
        addObject(b85, 265, 340);
        
        Bloque b86 = new Bloque();
        addObject(b86, 300, 340);
        
        Bloque b87 = new Bloque();
        addObject(b87, 335, 340);
        
        Bloque b88 = new Bloque();
        addObject(b88, 475, 340);
        
        Bloque b89 = new Bloque();
        addObject(b89, 510, 340);
        
        Bloque b90 = new Bloque();
        addObject(b90, 545, 340);
        
        Bloque b91 = new Bloque();
        addObject(b91, 580, 340);
        
        Bloque b92 = new Bloque();
        addObject(b92, 685, 340);
        
        Bloque b93 = new Bloque();
        addObject(b93, 720, 340);
        
        Bloque b94 = new Bloque();
        addObject(b94, 755, 340);
        
        Bloque b95 = new Bloque();
        addObject(b95, 790, 340);
        
        Bloque b96 = new Bloque();
        addObject(b96, 90, 405);
        
        Bloque b97 = new Bloque();
        addObject(b97, 125, 405);
        
        Bloque b98 = new Bloque();
        addObject(b98, 160, 405);
        
        Bloque b99 = new Bloque();
        addObject(b99, 195, 405);
        
        Bloque b100 = new Bloque();
        addObject(b100, 300, 420);
        
        Bloque b101 = new Bloque();
        addObject(b101, 335, 420);
        
        Bloque b102 = new Bloque();
        addObject(b102, 370, 420);
        
        Bloque b103 = new Bloque();
        addObject(b103, 475, 405);
        
        Bloque b104 = new Bloque();
        addObject(b104, 510, 405);
        
        Bloque b105 = new Bloque();
        addObject(b105, 545, 405);
        
        Bloque b106 = new Bloque();
        addObject(b106, 580, 405);
        
        Bloque b107 = new Bloque();
        addObject(b107, 615, 405);
        
        Bloque b108 = new Bloque();
        addObject(b108, 650, 405);
        
        Dementor d1 = new Dementor();
        addObject(d1, 400, 80);
        
        Varita v = new Varita();
        addObject(v, 440, 210);
        
        Dementor d3 = new Dementor();
        addObject(d3, 300, 280);
        
        Dementor d2 = new Dementor();
        addObject(d2, 260, 150);
        
        Capa c = new Capa();
        addObject(c, 700, 70);
        
        Piedra p = new Piedra();
        addObject(p, 750, 420);
        
        Amarilla a = new Amarilla();
        addObject(a, 50, 110);
        
        Azul a0 = new Azul();
        addObject(a0, 150, 220);
        
        Azul a1 = new Azul();
        addObject(a1, 100, 350);

        Amarilla a2 = new Amarilla();
        addObject(a2, 400, 320);
        
        Amarilla a3 = new Amarilla();
        addObject(a3, 580, 150);
        
        Azul a4 = new Azul();
        addObject(a4, 630, 350);
        
        Amarilla a5 = new Amarilla();
        addObject(a5, 550, 40);
        
    }

    private boolean ban=false;
    public void Llenar2()
    {
        //nivel = 2;
        
        removeObjects(getObjects(null));
        
        addObject(mensajePuntos, 600, 450);
        addObject(mensajeVidas, 500, 450);
        addObject(mensajeTiempo, 700, 450);
        
        
        this.setBackground("Nivel2.jpg");
        
        mensajeTiempo.setValue(0);
        
        //checaTiempo();
        
        addObject(harry, 15, 430);
        
        Bloque b = new Bloque();
        addObject(b, 20, 15);
        
        Bloque b1 = new Bloque();
        addObject(b1, 55, 15);
        
        Bloque b2 = new Bloque();
        addObject(b2, 90, 15);
        
        Bloque b3 = new Bloque();
        addObject(b3, 125, 15);
        
        Bloque b4 = new Bloque();
        addObject(b4, 160, 15);
        
        Bloque b5 = new Bloque();
        addObject(b5, 195, 15);
        
        Bloque b6 = new Bloque();
        addObject(b6, 55, 80);
        
        Bloque b7 = new Bloque();
        addObject(b7, 90, 80);
        
        Bloque b8 = new Bloque();
        addObject(b8, 125, 80);
        
        Bloque b9 = new Bloque();
        addObject(b9, 160, 80);
        
        Bloque b11 = new Bloque();
        addObject(b11, 195, 80);
        
        Bloque b12 = new Bloque();
        addObject(b12, 230, 80);
        
        Bloque b13 = new Bloque();
        addObject(b13, 265, 80);
        
        Bloque b14 = new Bloque();
        addObject(b14, 300, 80);
        
        Bloque b15 = new Bloque();
        addObject(b15, 90, 145);
        
        Bloque b16 = new Bloque();
        addObject(b16, 125, 145);
        
        Bloque b17 = new Bloque();
        addObject(b17, 160, 145);
        
        Bloque b18 = new Bloque();
        addObject(b18, 195, 145);
        
        Bloque b19 = new Bloque();
        addObject(b19, 20, 210);
        
        Bloque b20 = new Bloque();
        addObject(b20, 55, 210);
        
        Bloque b21 = new Bloque();
        addObject(b21, 90, 210);
        
        Bloque b22 = new Bloque();
        addObject(b22, 195, 210);
        
        Bloque b23 = new Bloque();
        addObject(b23, 230, 210);
        
        Bloque b24 = new Bloque();
        addObject(b24, 265, 210);
        
        Bloque b25 = new Bloque();
        addObject(b25, 300, 210);
        
        Bloque b26 = new Bloque();
        addObject(b26, 335, 210);
        
        Bloque b27 = new Bloque();
        addObject(b27, 370, 210);
        
        Bloque b28 = new Bloque();
        addObject(b28, 330, 15);
        
        Bloque b29 = new Bloque();
        addObject(b29, 365, 15);
        
        Bloque b30 = new Bloque();
        addObject(b30, 400, 15);
        
        Bloque b31 = new Bloque();
        addObject(b31, 435, 15);
        
        Bloque b32 = new Bloque();
        addObject(b32, 470, 15);
        
        Bloque b33 = new Bloque();
        addObject(b33, 505, 15);
        
        Bloque b34 = new Bloque();
        addObject(b34, 335, 145);
        
        Bloque b35 = new Bloque();
        addObject(b35, 370, 145);
        
        Bloque b36 = new Bloque();
        addObject(b36, 405, 145);
        
        Bloque b37 = new Bloque();
        addObject(b37, 440, 145);
        
        Bloque b38 = new Bloque();
        addObject(b38, 475, 145);
        
        Bloque b39 = new Bloque();
        addObject(b39, 510, 145);
        
        Bloque b40 = new Bloque();
        addObject(b40, 465, 80);
        
        Bloque b41 = new Bloque();
        addObject(b41, 500, 80);
        
        Bloque b42 = new Bloque();
        addObject(b42, 535, 80);
        
        Bloque b43 = new Bloque();
        addObject(b43, 570, 80);
        
        Bloque b44 = new Bloque();
        addObject(b44, 605, 80);
        
        Bloque b45 = new Bloque();
        addObject(b45, 640, 80);
        
        Bloque b47 = new Bloque();
        addObject(b47, 605, 15);
        
        Bloque b48 = new Bloque();
        addObject(b48, 640, 15);
        
        Bloque b49 = new Bloque();
        addObject(b49, 675, 15);
        
        Bloque b50 = new Bloque();
        addObject(b50, 710, 15);
        
        Bloque b51 = new Bloque();
        addObject(b51, 745, 15);
        
        Bloque b52 = new Bloque();
        addObject(b52, 780, 15);
        
        Bloque b53 = new Bloque();
        addObject(b53, 745, 80);
        
        Bloque b54 = new Bloque();
        addObject(b54, 780, 80);
        
        Bloque b55 = new Bloque();
        addObject(b55, 640, 145);
        
        Bloque b56 = new Bloque();
        addObject(b56, 675, 145);
        
        Bloque b57 = new Bloque();
        addObject(b57, 710, 145);
        
        Bloque b58 = new Bloque();
        addObject(b58, 510, 210);
        
        Bloque b59 = new Bloque();
        addObject(b59, 545, 210);
        
        Bloque b60 = new Bloque();
        addObject(b60, 580, 210);
        
        Bloque b61 = new Bloque();
        addObject(b61, 615, 210);
        
        Bloque b62 = new Bloque();
        addObject(b62, 710, 210);
        
        Bloque b63 = new Bloque();
        addObject(b63, 745, 210);
        
        Bloque b64 = new Bloque();
        addObject(b64, 780, 210);
        
        Bloque b65 = new Bloque();
        addObject(b65, 55, 275);
        
        Bloque b66 = new Bloque();
        addObject(b66, 90, 275);
        
        Bloque b67 = new Bloque();
        addObject(b67, 125, 275);
        
        Bloque b68 = new Bloque();
        addObject(b68, 160, 275);
        
        Bloque b69 = new Bloque();
        addObject(b69, 195, 275);
        
        Bloque b70 = new Bloque();
        addObject(b70, 230, 275);
        
        Bloque b71 = new Bloque();
        addObject(b71, 370, 275);
        
        Bloque b72 = new Bloque();
        addObject(b72, 405, 275);
        
        Bloque b73 = new Bloque();
        addObject(b73 , 440, 275);
        
        Bloque b74 = new Bloque();
        addObject(b74, 475, 275);
        
        Bloque b75 = new Bloque();
        addObject(b75, 510, 275);
        
        Bloque b76 = new Bloque();
        addObject(b76, 615, 275);
        
        Bloque b77 = new Bloque();
        addObject(b77, 650, 275);
        
        Bloque b78 = new Bloque();
        addObject(b78, 685, 275);
        
        Bloque b79 = new Bloque();
        addObject(b79, 720, 275);
        
        Bloque b80 = new Bloque();
        addObject(b80, 20, 340);
        
        Bloque b81 = new Bloque();
        addObject(b81, 55, 340);
        
        Bloque b82 = new Bloque();
        addObject(b82, 160, 340);
        
        Bloque b83 = new Bloque();
        addObject(b83, 195, 340);
        
        Bloque b84 = new Bloque();
        addObject(b84, 230, 340);
        
        Bloque b85 = new Bloque();
        addObject(b85, 265, 340);
        
        Bloque b86 = new Bloque();
        addObject(b86, 300, 340);
        
        Bloque b87 = new Bloque();
        addObject(b87, 335, 340);
        
        Bloque b88 = new Bloque();
        addObject(b88, 475, 340);
        
        Bloque b89 = new Bloque();
        addObject(b89, 510, 340);
        
        Bloque b90 = new Bloque();
        addObject(b90, 545, 340);
        
        Bloque b91 = new Bloque();
        addObject(b91, 580, 340);
        
        Bloque b92 = new Bloque();
        addObject(b92, 685, 340);
        
        Bloque b93 = new Bloque();
        addObject(b93, 720, 340);
        
        Bloque b94 = new Bloque();
        addObject(b94, 755, 340);
        
        Bloque b95 = new Bloque();
        addObject(b95, 790, 340);
        
        Bloque b96 = new Bloque();
        addObject(b96, 90, 405);
        
        Bloque b97 = new Bloque();
        addObject(b97, 125, 405);
        
        Bloque b98 = new Bloque();
        addObject(b98, 160, 405);
        
        Bloque b99 = new Bloque();
        addObject(b99, 195, 405);
        
        Bloque b100 = new Bloque();
        addObject(b100, 300, 420);
        
        Bloque b101 = new Bloque();
        addObject(b101, 335, 420);
        
        Bloque b102 = new Bloque();
        addObject(b102, 370, 420);
        
        Bloque b103 = new Bloque();
        addObject(b103, 475, 405);
        
        Bloque b104 = new Bloque();
        addObject(b104, 510, 405);
        
        Bloque b105 = new Bloque();
        addObject(b105, 545, 405);
        
        Bloque b106 = new Bloque();
        addObject(b106, 580, 405);
        
        Bloque b107 = new Bloque();
        addObject(b107, 615, 405);
        
        Bloque b108 = new Bloque();
        addObject(b108, 650, 405);
        
        Bruja br1 = new Bruja();
        addObject(br1, 400, 80);
       
        Varita v = new Varita();
        addObject(v, 440, 210);
    
        //Dementor d2 = new Dementor();
        //addObject(d2, 260, 150);
        
        Capa c = new Capa();
        addObject(c, 700, 70);
        
        Piedra p = new Piedra();
        addObject(p, 750, 420);
        
        Amarilla a = new Amarilla();
        addObject(a, 50, 110);
        
        Azul a0 = new Azul();
        addObject(a0, 150, 220);
        
        Azul a1 = new Azul();
        addObject(a1, 100, 350);

        Amarilla a2 = new Amarilla();
        addObject(a2, 400, 320);
        
        Amarilla a3 = new Amarilla();
        addObject(a3, 580, 150);
        
        Azul a4 = new Azul();
        addObject(a4, 630, 350);
        
        Amarilla a5 = new Amarilla();
        addObject(a5, 550, 40);
        
    }
    
    
    public void Llenar3()
    {
        
        removeObjects(getObjects(null));
        
        addObject(mensajePuntos, 600, 450);
        addObject(mensajeVidas, 500, 450);
        addObject(mensajeTiempo, 700, 450);
        addObject(mensajeNivel, 400, 450);
        
        
        this.setBackground("Nivel3.jpg");
        
        mensajeTiempo.setValue(0);
   
        
        addObject(harry, 15, 430);
        
        Bloque b = new Bloque();
        addObject(b, 20, 15);
        
        Bloque b1 = new Bloque();
        addObject(b1, 55, 15);
        
        Bloque b2 = new Bloque();
        addObject(b2, 90, 15);
        
        Bloque b3 = new Bloque();
        addObject(b3, 125, 15);
        
        Bloque b4 = new Bloque();
        addObject(b4, 160, 15);
        
        Bloque b5 = new Bloque();
        addObject(b5, 195, 15);
        
        Bloque b6 = new Bloque();
        addObject(b6, 55, 80);
        
        Bloque b7 = new Bloque();
        addObject(b7, 90, 80);
        
        Bloque b8 = new Bloque();
        addObject(b8, 125, 80);
        
        Bloque b9 = new Bloque();
        addObject(b9, 160, 80);
        
        Bloque b11 = new Bloque();
        addObject(b11, 195, 80);
        
        Bloque b12 = new Bloque();
        addObject(b12, 230, 80);
        
        Bloque b13 = new Bloque();
        addObject(b13, 265, 80);
        
        Bloque b14 = new Bloque();
        addObject(b14, 300, 80);
        
        Bloque b15 = new Bloque();
        addObject(b15, 90, 145);
        
        Bloque b16 = new Bloque();
        addObject(b16, 125, 145);
        
        Bloque b17 = new Bloque();
        addObject(b17, 160, 145);
        
        Bloque b18 = new Bloque();
        addObject(b18, 195, 145);
        
        Bloque b19 = new Bloque();
        addObject(b19, 20, 210);
        
        Bloque b20 = new Bloque();
        addObject(b20, 55, 210);
        
        Bloque b21 = new Bloque();
        addObject(b21, 90, 210);
        
        Bloque b22 = new Bloque();
        addObject(b22, 195, 210);
        
        Bloque b23 = new Bloque();
        addObject(b23, 230, 210);
        
        Bloque b24 = new Bloque();
        addObject(b24, 265, 210);
        
        Bloque b25 = new Bloque();
        addObject(b25, 300, 210);
        
        Bloque b26 = new Bloque();
        addObject(b26, 335, 210);
        
        Bloque b27 = new Bloque();
        addObject(b27, 370, 210);
        
        Bloque b28 = new Bloque();
        addObject(b28, 330, 15);
        
        Bloque b29 = new Bloque();
        addObject(b29, 365, 15);
        
        Bloque b30 = new Bloque();
        addObject(b30, 400, 15);
        
        Bloque b31 = new Bloque();
        addObject(b31, 435, 15);
        
        Bloque b32 = new Bloque();
        addObject(b32, 470, 15);
        
        Bloque b33 = new Bloque();
        addObject(b33, 505, 15);
        
        Bloque b34 = new Bloque();
        addObject(b34, 335, 145);
        
        Bloque b35 = new Bloque();
        addObject(b35, 370, 145);
        
        Bloque b36 = new Bloque();
        addObject(b36, 405, 145);
        
        Bloque b37 = new Bloque();
        addObject(b37, 440, 145);
        
        Bloque b38 = new Bloque();
        addObject(b38, 475, 145);
        
        Bloque b39 = new Bloque();
        addObject(b39, 510, 145);
        
        Bloque b40 = new Bloque();
        addObject(b40, 465, 80);
        
        Bloque b41 = new Bloque();
        addObject(b41, 500, 80);
        
        Bloque b42 = new Bloque();
        addObject(b42, 535, 80);
        
        Bloque b43 = new Bloque();
        addObject(b43, 570, 80);
        
        Bloque b44 = new Bloque();
        addObject(b44, 605, 80);
        
        Bloque b45 = new Bloque();
        addObject(b45, 640, 80);
        
        Bloque b47 = new Bloque();
        addObject(b47, 605, 15);
        
        Bloque b48 = new Bloque();
        addObject(b48, 640, 15);
        
        Bloque b49 = new Bloque();
        addObject(b49, 675, 15);
        
        Bloque b50 = new Bloque();
        addObject(b50, 710, 15);
        
        Bloque b51 = new Bloque();
        addObject(b51, 745, 15);
        
        Bloque b52 = new Bloque();
        addObject(b52, 780, 15);
        
        Bloque b53 = new Bloque();
        addObject(b53, 745, 80);
        
        Bloque b54 = new Bloque();
        addObject(b54, 780, 80);
        
        Bloque b55 = new Bloque();
        addObject(b55, 640, 145);
        
        Bloque b56 = new Bloque();
        addObject(b56, 675, 145);
        
        Bloque b57 = new Bloque();
        addObject(b57, 710, 145);
        
        Bloque b58 = new Bloque();
        addObject(b58, 510, 210);
        
        Bloque b59 = new Bloque();
        addObject(b59, 545, 210);
        
        Bloque b60 = new Bloque();
        addObject(b60, 580, 210);
        
        Bloque b61 = new Bloque();
        addObject(b61, 615, 210);
        
        Bloque b62 = new Bloque();
        addObject(b62, 710, 210);
        
        Bloque b63 = new Bloque();
        addObject(b63, 745, 210);
        
        Bloque b64 = new Bloque();
        addObject(b64, 780, 210);
        
        Bloque b65 = new Bloque();
        addObject(b65, 55, 275);
        
        Bloque b66 = new Bloque();
        addObject(b66, 90, 275);
        
        Bloque b67 = new Bloque();
        addObject(b67, 125, 275);
        
        Bloque b68 = new Bloque();
        addObject(b68, 160, 275);
        
        Bloque b69 = new Bloque();
        addObject(b69, 195, 275);
        
        Bloque b70 = new Bloque();
        addObject(b70, 230, 275);
        
        Bloque b71 = new Bloque();
        addObject(b71, 370, 275);
        
        Bloque b72 = new Bloque();
        addObject(b72, 405, 275);
        
        Bloque b73 = new Bloque();
        addObject(b73 , 440, 275);
        
        Bloque b74 = new Bloque();
        addObject(b74, 475, 275);
        
        Bloque b75 = new Bloque();
        addObject(b75, 510, 275);
        
        Bloque b76 = new Bloque();
        addObject(b76, 615, 275);
        
        Bloque b77 = new Bloque();
        addObject(b77, 650, 275);
        
        Bloque b78 = new Bloque();
        addObject(b78, 685, 275);
        
        Bloque b79 = new Bloque();
        addObject(b79, 720, 275);
        
        Bloque b80 = new Bloque();
        addObject(b80, 20, 340);
        
        Bloque b81 = new Bloque();
        addObject(b81, 55, 340);
        
        Bloque b82 = new Bloque();
        addObject(b82, 160, 340);
        
        Bloque b83 = new Bloque();
        addObject(b83, 195, 340);
        
        Bloque b84 = new Bloque();
        addObject(b84, 230, 340);
        
        Bloque b85 = new Bloque();
        addObject(b85, 265, 340);
        
        Bloque b86 = new Bloque();
        addObject(b86, 300, 340);
        
        Bloque b87 = new Bloque();
        addObject(b87, 335, 340);
        
        Bloque b88 = new Bloque();
        addObject(b88, 475, 340);
        
        Bloque b89 = new Bloque();
        addObject(b89, 510, 340);
        
        Bloque b90 = new Bloque();
        addObject(b90, 545, 340);
        
        Bloque b91 = new Bloque();
        addObject(b91, 580, 340);
        
        Bloque b92 = new Bloque();
        addObject(b92, 685, 340);
        
        Bloque b93 = new Bloque();
        addObject(b93, 720, 340);
        
        Bloque b94 = new Bloque();
        addObject(b94, 755, 340);
        
        Bloque b95 = new Bloque();
        addObject(b95, 790, 340);
        
        Bloque b96 = new Bloque();
        addObject(b96, 90, 405);
        
        Bloque b97 = new Bloque();
        addObject(b97, 125, 405);
        
        Bloque b98 = new Bloque();
        addObject(b98, 160, 405);
        
        Bloque b99 = new Bloque();
        addObject(b99, 195, 405);
        
        Bloque b100 = new Bloque();
        addObject(b100, 300, 420);
        
        Bloque b101 = new Bloque();
        addObject(b101, 335, 420);
        
        Bloque b102 = new Bloque();
        addObject(b102, 370, 420);
        
        Bloque b103 = new Bloque();
        addObject(b103, 475, 405);
        
        Bloque b104 = new Bloque();
        addObject(b104, 510, 405);
        
        Bloque b105 = new Bloque();
        addObject(b105, 545, 405);
        
        Bloque b106 = new Bloque();
        addObject(b106, 580, 405);
        
        Bloque b107 = new Bloque();
        addObject(b107, 615, 405);
        
        Bloque b108 = new Bloque();
        addObject(b108, 650, 405);
 
        Varita v = new Varita();
        addObject(v, 440, 210);
        
        Amarilla aa = new Amarilla();
        addObject(aa, 300, 280);
        
        Capa c = new Capa();
        addObject(c, 750, 420);
        
        Voldemort vl = new Voldemort();
        addObject(vl, 700, 70);
        
        Piedra p = new Piedra();
        addObject(p, 630, 350);
        
        Amarilla a = new Amarilla();
        addObject(a, 50, 110);
        
        Azul a0 = new Azul();
        addObject(a0, 150, 220);
        
        Azul a1 = new Azul();
        addObject(a1, 100, 350);

        Amarilla a2 = new Amarilla();
        addObject(a2, 400, 320);
        
        Amarilla a3 = new Amarilla();
        addObject(a3, 580, 150);
        
        Amarilla a5 = new Amarilla();
        addObject(a5, 550, 40);
        
        Azul az = new Azul();
        addObject(az, 400, 80);
    }
}
    
