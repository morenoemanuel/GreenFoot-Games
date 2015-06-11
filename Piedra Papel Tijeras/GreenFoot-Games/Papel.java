import greenfoot.*;

/**
 * Write a description of class Papel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Papel extends Jugadores
{
    /**
     * Act - do whatever the Papel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        ChoosePapel();
    }    
    public void ChoosePapel(){
        if(Greenfoot.isKeyDown("1")){
            x = 1;
            System.out.println("Jugador escoge papel");
        }
    }
}
