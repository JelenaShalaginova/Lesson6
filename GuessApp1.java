package lesson6;

/*
 GuessApp1
 Lets use Lab3.GuessNumber as the instantiable class, to calculate the users guess number
 Number of guess: 3
 */

import lab3.GuessNumber;
import java.util.*;

public class GuessApp1 {
	
	public static void main(String[] args) {
		
	
	//declare a local variables
	int guess;
	
	Scanner input = new Scanner(System.in);
	
	GuessNumber checker = new GuessNumber();
	
	for(int i = 0; i < 3; i++) {
		//input
		System.out.println("ENTER TO GUESS THE NUMBER: ");
		guess = input.nextInt();
		
		checker.setGuess(guess);
		
		//processing
		checker.compute();
		
		//output
		String m = checker.getMessage();
				System.out.println(m);
				
				if (m.equals("congrats")) {
					break;
				}	
		
	}//end for
		int s = checker.getSecret();
		System.out.println("secret: " + s);
	
	}//end main	

}//end class
