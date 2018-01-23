package com.techelevator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Exercises {

	/*
	 Note, for-each is preferred, and should be used when possible.
	 */

	/*
	 Given an array of Strings, return an ArrayList containing the same Strings in the same order 
	 array2List( {"Apple", "Orange", "Banana"} )  ->  ["Apple", "Orange", "Banana"]
	 array2List( {"Red", "Orange", "Yellow"} )  ->  ["Red", "Orange", "Yellow"]
	 array2List( {"Left", "Right", "Forward", "Back"} )  ->  ["Left", "Right", "Forward", "Back"] 
	 */
	public List<String> array2List(String[] stringArray) {
		return Arrays.asList(stringArray);
	}
	//Done
	
	/*
	 Given a list of Strings, return an array containing the same Strings in the same order 
	 list2Array( ["Apple", "Orange", "Banana"] )  ->  {"Apple", "Orange", "Banana"}
	 list2Array( ["Red", "Orange", "Yellow"] )  ->  {"Red", "Orange", "Yellow"}
	 list2Array( ["Left", "Right", "Forward", "Back"] )  ->  {"Left", "Right", "Forward", "Back"}
	 */
	public String[] list2Array(List<String> stringList) {
		String[] copy = new String[stringList.size()];
		for(int i = 0; i < stringList.size(); i++) {
			copy[i] = stringList.get(i);
		}
		return copy;
	}
	//done
	
	/*
	 Given an array of Strings, return an ArrayList containing the same Strings in the same order 
	 except for any words that contain exactly 4 characters.
	 no4LetterWords( {"Train", "Boat", "Car"} )  ->  ["Train", "Car"]
	 no4LetterWords( {"Red", "White", "Blue"} )  ->  ["Red", "White"]
	 no4LetterWords( {"Jack", "Jill", "Jane", "John", "Jim"} )  ->  ["Jim"]
	 */
	public List<String> no4LetterWords(String[] stringArray) {
		// create new list
		List<String> no4Letters = new ArrayList<String>();
		// run through array
		for(String element : stringArray) {
			// check for 4 letters
			if (element.length() != 4 ) {
				//add words without 4 letters to list
				no4Letters.add(element);
			}
		}
		return no4Letters;
	}
	//done


	/*
	 Given a List of Strings, return a new list in reverse order of the original. One obvious solution is to
	 simply loop through the original list in reverse order, but see if you can come up with an alternative
	 solution. (Hint: Think LIFO (i.e. stack))
	 reverseList( ["purple", "green", "blue", "yellow", "green" ])  -> ["green", "yellow", "blue", "green", "purple" ]
	 reverseList( ["jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way"} )
		-> ["way", "the", "all", "jingle", "bells", "jingle", "bells", "jingle"]
	 */
	public List<String> reverseList(List<String> stringList) {
		
		// new stack
		Stack<String> reverseOrder = new Stack<String>();
		// new list
		List<String> reversedOrder = new ArrayList<String>();
		// run through all elments in original list
		for(int i = 0; i < stringList.size(); i++) {
			//add ro stack
			reverseOrder.push(stringList.get(i));	
		}
		//check if reverse order stack contains anything
		while(! reverseOrder.isEmpty()) {
			// add element to new list && remove from stack
			reversedOrder.add (reverseOrder.pop());	
		}
		// return reversed order
		return reversedOrder;
	}
	//done

	/*
	 Given an array of ints, divide each int by 2, and return an ArrayList of Doubles.
	 arrayInt2ListDouble( {5, 8, 11, 200, 97} ) -> [2.5, 4.0, 5.5, 100, 48.5]
	 arrayInt2ListDouble( {745, 23, 44, 9017, 6} ) -> [372.5, 11.5, 22, 4508.5, 3]
	 arrayInt2ListDouble( {84, 99, 3285, 13, 877} ) -> [42, 49.5, 1642.5, 6.5, 438.5]
	 */
	public List<Double> arrayInt2ListDouble(int[] intArray) {
		//declare new array list
		List<Double> halvedList = new ArrayList<Double>();
		//run through original array
		for(int i = 0; i < intArray.length; i++) {
			// add temp double to store value from array
			double x = intArray[i]; 
			// divide value by 2	 && add value to new list
			halvedList.add(x/2);
		}
		//return list
		return halvedList;
	}
	// done
	
	/*
	 Given a List of Integers, return the largest value.
	 findLargest( [11, 200, 43, 84, 9917, 4321, 1, 33333, 8997] ) -> 33333
	 findLargest( [987, 1234, 9381, 731, 43718, 8932] ) -> 43718
	 findLargest( [34070, 1380, 81238, 7782, 234, 64362, 627] ) -> 64362
	 */
	public Integer findLargest(List<Integer> integerList) {
		//Declare new int
		int biggestNumber = 0;
		// determine largest number
		for(int element : integerList) {
			if (element > biggestNumber) {
				biggestNumber = element;
			}
		}
		// return biggest number
		return biggestNumber;
	}
	// done
	
	/*
	 Given an array of Integers, return a List of Integers containing just the odd values.
	 oddOnly( {112, 201, 774, 92, 9, 83, 41872} ) -> [201, 9, 83]
	 oddOnly( {1143, 555, 7, 1772, 9953, 643} ) -> [1143, 555, 7, 9953, 643]
	 oddOnly( {734, 233, 782, 811, 3, 9999} ) -> [233, 811, 3, 9999]  
	 */
	public List<Integer> oddOnly(Integer[] integerArray) {
		// create a new List
		List<Integer> oddValues = new ArrayList<Integer>();
		//run while integerArray has values
		for(int i = 0; i < integerArray.length; i++) {
			// Check if odd and more than 0
			if (integerArray[i] > 0 && integerArray[i] % 2 != 0) {
				// add odd values to new array
				oddValues.add(integerArray[i]);
			}	
		}
		//return new array
		return oddValues;
	}
	//done
	
	/* 
	 Given a List of Integers, and an int value, return true if the int value appears two or more times in 
	 the list.
	 foundIntTwice( [5, 7, 9, 5, 11], 5 ) -> true
	 foundIntTwice( [6, 8, 10, 11, 13], 8 -> false
	 foundIntTwice( [9, 23, 44, 2, 88, 44], 44) -> true
	 */
	public boolean foundIntTwice(List<Integer> integerList, int intToFind) {
		//declare new int count
		int count = 0;
		//check for number
		for(int element : integerList) {
			if (element == intToFind) {
				//increase count
				count++;
			}
		}
		// return true  if  number appears two or more times
		return (count > 1);
	}
	// done
	
	/*
	 Given an array of Integers, return a List that contains the same Integers (as Strings). Except any 
	 multiple of 3
   should be replaced by the String "Fizz", any multiple of 5 should be replaced by the String "Buzz",
    and any multiple of both 3 and 5 should be replaced by the String "FizzBuzz"
    ** INTERVIEW QUESTION **	 
    
    fizzBuzzList( {1, 2, 3} )  ->  [1, 2, "Fizz"]
	 fizzBuzzList( {4, 5, 6} )  ->  [4, "Buzz", 6]
	 fizzBuzzList( {7, 8, 9, 10, 11, 12, 13, 14, 15} )  ->  [7, 8, "Fizz", "Buzz", 11, "Fizz", 13, 14, "FizzBuzz"]
	 
	 HINT: To convert an integer x to a string you can call x.toString() in your code (e.g. if x = 1 then x.ToString() equals "1")
	 */
	public List<String> fizzBuzzList(Integer[] integerArray) {
		// declare new string List
		List<String> fizzyBuzz = new ArrayList<>();
		// run through original array
		for(Integer element : integerArray) {
			// check if multiple or 3 && 5
			if (element % 3 == 0 && element % 5 == 0 ) {
				fizzyBuzz.add("FizzBuzz");
			} else if (element % 3 == 0) {
				// check for multiple of 3
				fizzyBuzz.add("Fizz");
			} else if (element % 5 == 0) {
				// check if multiple of 5
				fizzyBuzz.add("Buzz");
			} else {
				fizzyBuzz.add(element.toString());
				// declar object in	
			}	
		}
		
		return fizzyBuzz;
	}

	/*
	 Given a list of Strings, return a list that contains the distinct values. In other words, no value is to be
	 included more than once in the returned list. (Hint: Think Set)
	 distinctValues( ["red", "yellow", "green", "yellow", "blue", "green", "purple"] ) -> ["red", "yellow", "green", "blue", "purple"]
	 distinctValues( ["jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way"] ) -> ["jingle", "bells", "all", "the", "way"]
	 */
	public List<String> distinctValues(List<String> stringList) {
		// convert list to set
		Set<String> set = new HashSet<String>(stringList);
		// create new list containing set
		List<String> newStringList = new ArrayList<String>(set);
		// return set
		return newStringList;
		// done
		
	}

	/*
	 Given two lists of Integers, interleave them beginning with the first element in the first list followed
	 by the first element of the second. Continue interleaving the elements until all elements have been interwoven.
	 Return the new list. If the lists are of unequal lengths, simply attach the remaining elements of the longer
	 list to the new list before returning it.
	 interleaveLists( [1, 2, 3], [4, 5, 6] )  ->  [1, 4, 2, 5, 3, 6]
	 */
	public List<Integer> interleaveLists(List<Integer> listOne, List<Integer> listTwo) {
		
		
		/* Attempt 1
		// determine which is longer
		if (listOne.size() > listTwo.size()) { 		// listTwo Larger
			// do while i is smaller than listTwo
			for(int i = 0; i < listTwo.size(); i++) {
				 listTwo.add(i+1, listOne.get(i));
			}
			// do after i is larger than listTwo
			for(int j = listTwo.size(); j < listOne.size(); j++) {
				 listTwo.add(listTwo.size(), listOne.get(j));	 
			}	
			System.out.println(listTwo);
			return listTwo;
		} else if (listOne.size() < listTwo.size()){ 		// listOnw Larger
			for(int i = 1; i < listOne.size(); i++) {
				 listTwo.add(i+1, listOne.get(i));	 
			}	
			System.out.println(listTwo);
			return listTwo;
		} else { // equal lists
			for(int i = 0; i < listTwo.size(); i++) {
				 listOne.add(i+1, listTwo.get(i));	 
			}
			System.out.println(listOne);
			return listOne;
		}
		*/
		
		/*
	    // determine which is longer
	    if (listOne.size() < listTwo.size()) { // listTwo longer
	        for (int i = 0; i < listOne.size(); i++) { // before k passes a1 size
	        	listOne.add(i+1, listTwo.get(i));
	        }
	     // do after i is larger than listOne
	        for (int i = listOne.size(); i < listTwo.size(); i++) {
	        	listOne.add(listOne.size(), listTwo.get(i));
	        }
	        System.out.println(listOne);
	        return listOne;

	    } else if (listOne.size() > listTwo.size()) { // ListOne longer
	        for (int i = 1; i < listTwo.size(); i++) {
	        	listOne.add(i+1, listTwo.get(i));
	        }
	        System.out.println(listOne);
	        return listOne;

	    } else { // if both lists are equal
	        for (int i = 0; i < listTwo.size(); i++) {
	        	listOne.add(i+1, listTwo.get(i));
	        }
	        System.out.println(listOne);
	        return listOne;
	    }
	    */
		
		// attempt 3
		// set counter to -1
		int i = -1;
		for(Integer element: listTwo) {
			//determine if listOne is larger that count
		    if(i < listOne.size()-1) {
		    	// if so add 2 to count
		        i += 2;
		    } else { // if not add 1 to count
		        i += 1;
		    }
		    //add element from listTwo to correct index in listOne
		    listOne.add(i, element);
		}
		// return combined list one
		return listOne;
		
	}

	/*
	 Given a list of Integers representing seat numbers, group them into ranges 1-10, 11-20, and 21-30.
	 (Any seat number less than 1, or greater than 30 is invalid, and can be ignored.) Preserve the order
	 in which the seat number entered their associated group. Return a list of the grouped Integers 1-10,
	 11-20, and 21-30. (Hint: Think multiple queues)
	 boardingGate( [1, 13, 43, 22, 8, 11, 30, 2, 4, 14, 21] ) -> [1, 8, 2, 4, 13, 11, 14, 22, 30, 21]
	 boardingGate( [29, 19, 9, 21, 11, 1, 0, 25, 15, 5, 31] ) -> [9, 1, 5, 19, 11, 15, 29, 21, 25]
	 boardingGate( [0, -1, 44, 31, 17, 7, 27, 16, 26, 6] ) -> [7, 6, 17, 16, 27, 26]
	 */
	public List<Integer> boardingGate(List<Integer> seatNumberList) {
		
		//set up queues
		Queue<Integer> lessThanEleven = new LinkedList<Integer>();
		Queue<Integer> lessThanTwentyOne = new LinkedList<Integer>();
		Queue<Integer> lessThanThirtyOne = new LinkedList<Integer>();
		// sort numbers & chexk if valid
		for(Integer element: seatNumberList) {
			// check if valid 
			if (element > 0 && element <31) {
				//sort tickets
				if (element < 11) {
					lessThanEleven.offer(element);
				} else if (element < 21) {
					lessThanTwentyOne.offer(element);
				} else if (element < 31) {
					lessThanThirtyOne.offer(element);
				}
			}
		}
		// Set up new boarding Lists
		List<Integer> boardingGate = new ArrayList<>();
		//List<Integer> twentyOrLess = new ArrayList<>();
		//List<Integer> thirtyOrLess = new ArrayList<>();
		// run through first queue
				while(! lessThanEleven.isEmpty()) {
					boardingGate.add(lessThanEleven.poll());
				}
		// run through second queue
				while(! lessThanTwentyOne.isEmpty()) {
					boardingGate.add(lessThanTwentyOne.poll());
				}
		// run through third queue
				while(! lessThanThirtyOne.isEmpty()) {
					boardingGate.add(lessThanThirtyOne.poll());
				}
		// wrap all list in list to return
		//List boardingGate = new ArrayList<>();
		//boardingGate.add(tenOrLess);
		//boardingGate.add(twentyOrLess);
		//boardingGate.add(thirtyOrLess);
		
		System.out.println(boardingGate);
		return boardingGate;
	}
	
	
	

}
