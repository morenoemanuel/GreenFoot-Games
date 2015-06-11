import greenfoot.*;
import java.util.Random;
/**
 * Write a description of class Oponente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Oponente extends Jugadores
{
    /**
     * Act - do whatever the Oponente wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {   
        if (Greenfoot.isKeyDown("A")){
            Oponente();

        }
        
    }    
     public void Oponente(){
        
        y = Greenfoot.getRandomNumber(3);
        if (x == 0 || x ==1 || x==2){
            if (y==0){
                System.out.println("Oponente escoje piedra");
            }
            else if (y==1){
                System.out.println("Oponente escoje papel");
            }
            
            else if(y==2){
                System.out.println("Oponente escoje tijeras");
            }
            
            else{
                System.out.println("Error por parte del CPU");
            }
    }      
    }
}
