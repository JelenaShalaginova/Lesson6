package lesson6;

import java.util.*;

/**
Develop an application to display the following patterns, one after another,
using for loops.
/*
  Pattern 3 Home Task
******
*****
****
***
**
*
 
*/

public class PatternsAppHW {
	
	public static void main (String[] args) {
	
		int n;
		Scanner scan = new Scanner(System.in);
				
		System.out.println("enter a value for n: ");
		n = scan.nextInt();
		
		System.out.println();
		System.out.println("Pattern 3: ");
		System.out.println();
		
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j<=n; j++ ) {
						
						if(i+j < n+2) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}

	}//end main
}//end class
