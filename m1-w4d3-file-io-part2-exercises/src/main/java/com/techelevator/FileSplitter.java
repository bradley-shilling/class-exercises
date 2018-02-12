package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileSplitter {

	public static void main(String[] args) throws FileNotFoundException {
		// vars
		int fileNumber = 0;

		// set up
		Scanner input = new Scanner(System.in);
		// prompt user for search term
		File inputFile = getInputFileFromUser();
		// prompt user for number of lines to split at
		System.out.print("Please enter the number of lines each file should contain: ");
		String userNumber = input.nextLine();
		int numberOfLines = Integer.parseInt(userNumber); // change to int

		
		/*
		 * Logic
		 */
		if (numberOfLines >= 1) { // do if number of lines per file is valid
			int fileCount = 1;
			// write to file
			try (Scanner fileReader = new Scanner(inputFile); // read in source
			) {
				// loop write to new files
				while (fileReader.hasNextLine()) {
					PrintWriter writer = new PrintWriter(inputFile + "-" + fileCount + ".txt");
					for (int i = 0; i < numberOfLines; i++) { // count to specified number of lines
						if (fileReader.hasNextLine()) { // only execute while next line exists in input file this prevents end
							String currentLine = fileReader.nextLine(); // get line from file
							writer.println(currentLine); // add to new file
						}
					}
					fileCount++; // increase file count
					writer.close(); // close current file and write to hd !
				}

			} catch (FileNotFoundException ex) {
				System.out.println("File not found!"); // tells user the file is unable to be located
				System.exit(1); // Ends the program
			}

		} else {
			System.out.println("Enter a positive integer"); // tells user to enter valid number
			System.exit(1); // Ends the program
		}

		// tell user task completed
		System.out.println("Done!");
	}

	

	// get input file path method
	@SuppressWarnings("resource")
	private static File getInputFileFromUser() {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter the path to the original file: ");
		String path = userInput.nextLine();
		// path
		// String path = "alices_adventures_in_wonderland.txt";

		File inputFile = new File(path);
		if (inputFile.exists() == false) { // checks for the existence of a file
			System.out.println(path + " does not exist");
			System.exit(1); // Ends the program
		} else if (inputFile.isFile() == false) {
			System.out.println(path + " is not a file");
			System.exit(1); // Ends the program
		}
		return inputFile;
	}

}
