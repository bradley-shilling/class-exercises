package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException {
	
		// Setup
		Scanner input = new Scanner(System.in);
		String caseAsString;
		boolean caseSensitive;
		// prompt user for search term
		System.out.print("Please enter a search term: ");
		String term = input.nextLine();
		// prompt user Case Sensitivity
		System.out.print("Is the search term case sensitive? (Y or N): ");
		caseAsString = input.nextLine();
		// set case sensitive boolean based on user response
		if (caseAsString.contains("Y") || caseAsString.contains("y")) {
			caseSensitive = true;
			System.out.println ("Running as case sensitive...");
		} else if (caseAsString.contains("N") || caseAsString.contains("n")) {
			caseSensitive = false;
			System.out.println ("Running as not case sensitive...");
		} else {
			caseSensitive = true;
			System.out.println ("Invalid selection... Running as case sensitive.");
		}
		
		// prompt user for file path and store as var
		File inputFile = getInputFileFromUser();
		
		// print results
		String results = returnSearchResults(inputFile, term, caseSensitive);
		System.out.println(results);
		
		
		
		
		

	}
	
	
	// get file path method
	@SuppressWarnings("resource")
	private static File getInputFileFromUser() {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter the file path: ");
		String path = userInput.nextLine();
		
		File inputFile = new File(path);
		if(inputFile.exists() == false) { // checks for the existence of a file
			System.out.println(path+" does not exist");
			System.exit(1); // Ends the program
		} else if(inputFile.isFile() == false) {
			System.out.println(path+" is not a file");
			System.exit(1); // Ends the program
		}
		return inputFile;
	}
	
	
	// main search logic
	private static String returnSearchResults(File inputFile, String term, boolean caseSensitive) throws FileNotFoundException {
		int lineCounter = 0;
		int resultCounter = 0;
		try (Scanner fileScanner = new Scanner(inputFile)) {
			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine(); // read next line of file
				lineCounter++;
				if (line.contains(" " + term + " ") && caseSensitive) { // check if current line contains term if checking for case ssensitivity 
					resultCounter++; // increase line counter
					System.out.println("" + lineCounter + ") " + line); //format and return line if it contains result
				} else if (line.toLowerCase().contains(" " + term.toLowerCase() + " ") && !caseSensitive) { // check if current line contains term if ignoring case sensitivity by convering both to lower case 
					resultCounter++; // increase line counter
					System.out.println("" + lineCounter + ") " + line);
				}
			}
			System.out.println();
			System.out.println("--------------------------");
			System.out.println();

		} 
		return "The term "+ term + " was found " + resultCounter + " times in file " + inputFile.getName() + ".";
		//alices_adventures_in_wonderland.txt
		
	}
	

}
