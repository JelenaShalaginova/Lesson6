package lesson6;

import lab3.GuessNumber;
import java.util.*;

/**
Problem 3
GuessApp3 
uses the instantiable class GuessNumber
allows the user to guess the number, and then ask the user whether would they like to guess again. 
If they answer yes, the application should run again, if they answer no, the application should end.
*/

public class GuessApp3 {
	
	public static void main(String[] args) {
		
		
		//declare a local variables
		int guess;
		String answer = "yes";
		
		Scanner input = new Scanner(System.in);
		GuessNumber checker = new GuessNumber();
		
			while(answer.equals("yes")) {
				System.out.println("PLEASE ENTER GUESS NUMBER");
				guess = input.nextInt();
				
				checker.setGuess(guess);
				
				checker.compute();
				
				String m = checker.getMessage();
						System.out.println(m);
						if (m.equals("congrats")) {
							break;
						}
			
				int s = checker.getSecret();
				
				System.out.println("DO YOU WANT TO TRY AGAIN? (type yes/no)");
				answer = input.next().toLowerCase();
				
				if(answer.equals("no")) {
					System.out.println("Thanks for the game!!!");
				}
				
			}//end while
	
			
		}//end main

}//end class
