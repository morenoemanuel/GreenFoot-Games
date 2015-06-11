import greenfoot.*;

/**
 * Write a description of class Piedra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Piedra extends Jugadores
{
    /**
     * Act - do whatever the Piedra wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        ChoosePiedra();
    }   
    public void ChoosePiedra(){
        if (Greenfoot.isKeyDown("0")){
            x = 0;
            System.out.println("Jugador escoge piedra");
        }
    }
}
