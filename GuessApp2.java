package lesson6;

import lab3.GuessNumber;
import java.util.*;

/**
Problem 2
GuessApp2 
uses the instantiable class GuessNumber
allows the user to guess the number. User can enter the guess number!
*/

public class GuessApp2 {
	
	public static void main(String[] args) {
		int guess;
		int numOfAttempts;
		
		Scanner input = new Scanner(System.in);
		
		GuessNumber checker = new GuessNumber();
		System.out.println("PLEASE ENTER NUMBER OF ATTEMPTS: ");
		numOfAttempts = input.nextInt();
		
		for(int i = 0; i < numOfAttempts; i++) {
			System.out.println("PLEASE ENTER GUESS NUMBER: ");
			guess = input.nextInt();
			
			checker.setGuess(guess);
			
			checker.compute();
			
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
