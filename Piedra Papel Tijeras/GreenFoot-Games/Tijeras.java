import greenfoot.*;

/**
 * Write a description of class Tijeras here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tijeras extends Jugadores
{
    /**
     * Act - do whatever the Tijeras wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        chooseTijeras();
    }   
    public void chooseTijeras(){
        if(Greenfoot.isKeyDown("2")){
            x = 1;
            System.out.println("Jugador escoge tijeras");
        }
    }
}   
    
