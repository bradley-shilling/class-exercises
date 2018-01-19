package com.techelevator;

import java.util.Scanner;

/*
Write a command line program which prompts the user for a series of decimal integer values  
and displays each decimal value as itself and its binary equivalent

$ DecimalToBinary 

Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321

460 in binary is 111001100
8218 in binary is 10000000011010
1 in binary is 1
31313 in binary is 111101001010001
987654321 in binary is 111010110111100110100010110001
*/
public class DecimalToBinary {

	public static void main(String[] args) {
		
		// Setup
		Scanner input = new Scanner(System.in);
		int remainder = 0;
		String binary = "";
				
		// User Interactions
		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		String decAsString = input.nextLine();
		
		// split string into array
		String[] listOfDec = decAsString.split(" ");
		
		// run until out of numbers separated by spaces
		for(int i=0; i < listOfDec.length; i++) {
			
			// Parse
			int listOfDecAsInt = Integer.parseInt(listOfDec[i]);
			
			
			System.out.print("" + listOfDec[i] + " in binary is ");
			//print 0 if 0
			if (listOfDecAsInt == 0) {
				System.out.print("0");
				System.out.printf("%n");
			} else {
			
				for (int b = 1; listOfDecAsInt > 0; b++) {
					// figure out if it is a 1 or 0
					remainder = listOfDecAsInt % 2;
					listOfDecAsInt /= 2;
					
					
					// store binary as string
		            binary = remainder + binary;
		        }
				// print result
				System.out.printf("" + binary + "%n");
				binary = "";
			}
			
			
		}
		
		
		
		


	}

}
