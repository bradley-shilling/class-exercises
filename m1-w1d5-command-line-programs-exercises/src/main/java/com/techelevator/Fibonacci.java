package com.techelevator;

import java.util.Scanner;

/*
 The Fibonacci numbers are the integers in the following sequence:  
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two.
 
Write a command line program which prompts the user for an integer value and display the Fibonacci sequence leading up to that number.

  
 $ java Fiboncci
 
Please enter the Fibonacci number: 25
 
 0, 1, 1, 2, 3, 5, 8, 13, 21
 */
public class Fibonacci {

	public static void main(String[] args) {
		
		 // Setup
		Scanner input = new Scanner(System.in);
		int firstFibber = 0;
		int secondFibber = 1;
		int qeuedFibber = 0;
		
	    // User Interactions
		System.out.print("Please enter the Fibonacci number: ");
		String countToMe = input.nextLine();
		
		// Parse
		double reallyCountToMe = Double.parseDouble(countToMe);
		
		// calculations
		if (reallyCountToMe == 0) {
			System.out.print("nice try");
		} else {
			for(int i=0; i < reallyCountToMe; i++) {
				if (firstFibber <= reallyCountToMe) {
					System.out.print(firstFibber + " ");
					qeuedFibber = (firstFibber + secondFibber);
					firstFibber = secondFibber;
					secondFibber = qeuedFibber;
				}
				
			}
		}

	}

}
