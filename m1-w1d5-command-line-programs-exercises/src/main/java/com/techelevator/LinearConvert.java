package com.techelevator;

import java.util.Scanner;

/*
 The foot to meter conversion formula is:
 	m = f * 0.3048
 	
 The meter to foot conversion formula is:
 	f = m * 3.2808399
 	
 Write a command line program which prompts a user to enter a length, and whether the measurement is in (m)eters or (f)eet.
 Convert the length to the opposite measurement, and display the old and new measurements to the console.
  
 $ java LinearConvert
 Please enter the length: 58
 Is the measurement in (m)eter, or (f)eet? f
 58f is 17m.
 */

public class LinearConvert {

	public static void main(String[] args) {
		 // Setup
		Scanner input = new Scanner(System.in);
		
		// User Interactions
		System.out.print("Please enter the length: ");
		String unitsAsString = input.nextLine();
				
		System.out.print("Is the measurement in (m)eter, or (f)eet? ");
		String unitTypeAsString = input.nextLine();
		
		// Parse
		double units = Double.parseDouble(unitsAsString);
		char unitType = unitTypeAsString.charAt(0);
		
		// calculations
		double result;
		char resultType;
		if (unitType == 'm' || unitType == 'M') {
			result = units * 3.2808399;
			resultType = 'f';
		} else {
			result = units * 0.3048;
			resultType = 'm';
		} 
		
		// output
		System.out.println("" + units + unitType + " is " + result + resultType);
		

	}

}
