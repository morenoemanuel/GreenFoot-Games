import greenfoot.*;
import java.util.Random;

/**
 * Write a description of class Jugadores here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugadores extends Actor
{
    public int x;
    public int y;
    /**
     * Act - do whatever the Jugadores wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Jugada();
       
    }   
    
    public void Jugada(){
        //Empates
		if (x==0 && y==0){
			System.out.println("Empate");
		}
		else if(x==1 && y==1){
			System.out.println("Empate");
		}
		else if(x==2 && y==2){
			System.out.println("Empate");
		}
		
		/////////////////
		else if(y==0 && x==1){
			System.out.println("Jugador Gana");
		}
		else if(y==0 && x==2){
			System.out.println("CPU gana");
		}
		else if(y==1 && x==0){
			System.out.println("CPU gana");
		}
		else if(y==2 && x==0){
			System.out.println("Jugador gana");
		}
		
		//////////
		else if(y==1 && x==0){
			System.out.println("Jugador gana");
		}
		else if(y==2 && x==1){
			System.out.println("CPU gana");
		}
	
		////////
		else if(y==0 && x==1){
			System.out.println("Jugador gana");
		}
		else if(y==2 && x==1){
			System.out.println("CPU gana");
		}
    }
    
}
