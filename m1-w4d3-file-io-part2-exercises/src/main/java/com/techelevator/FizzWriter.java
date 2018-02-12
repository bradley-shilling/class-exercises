package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FizzWriter {

	public static void main(String[] args) throws FileNotFoundException {
		// create new file for output
		File newFile = new File("FizzBuzz.txt");
		
		
		// write to file
		
			try(PrintWriter writer = new PrintWriter(newFile)) {
				for(int i=0; i<301; i++){ // count to 300
				writer.println(fizzBuzz(i));
				}
			}
		
		// tell user task completed
		System.out.println("Done!");
	}
	
	//fizz buzz method
	public static String fizzBuzz(int input) {
		if (input == 0) { // check if 0
			return "0";
		} else if (input % 15 == 0 || String.valueOf(input).contains("3") && String.valueOf(input).contains("5")) { // check if contains 3 and 5 or is divisable by 3 and 5
			return "FizzBuzz";
		} else if (input % 3 == 0 || String.valueOf(input).contains("3")) {  // check if divisable by 3 or contains 3
			return "Fizz";
		} else if (input % 5 == 0 || String.valueOf(input).contains("5")) { // check if divisable by 5 or contains 5
			return "Buzz";
		} else if (input > 0 && input <301) { // check if in range
			return String.valueOf(input);
		}
			return "Out of range."; // else return out of range
			
		}


}
