package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exercises {

	/*
	 * Dictionary/Map Exercises
	 */
	
	/*
	 * Given the name of an animal, return the name of a group of that animal
	 * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").  
	 * 
	 * The animal name should be case insensitive so "elephant", "Elephant", and 
	 * "ELEPHANT" should all return "herd". 
	 * 
	 * If the name of the animal is not found, null, or empty, return "unknown". 
	 * 
	 * Rhino -> Crash
	 * Giraffe -> Tower
	 * Elephant -> Herd
	 * Lion -> Pride
	 * Crow -> Murder
	 * Pigeon -> Kit
	 * Flamingo -> Pat
	 * Deer -> Herd
	 * Dog -> Pack
	 * Crocodile -> Float
	 *
	 * animalGroupName("giraffe") → "Tower"
	 * animalGroupName("") -> "unknown"
	 * animalGroupName("walrus") -> "unknown"
	 * 
	 */
	public String animalGroupName(String animalName) {
		Map<String, String> animalsToGroups = new HashMap<>();
		animalsToGroups.put("rhino", "Crash");
		animalsToGroups.put("giraffe", "Tower");
		animalsToGroups.put("elephant", "Herd");
		animalsToGroups.put("lion", "Pride");
		animalsToGroups.put("crow", "Murder");
		animalsToGroups.put("pigeon", "Kit");
		animalsToGroups.put("flamingo", "Pat");
		animalsToGroups.put("deer", "Herd");
		animalsToGroups.put("dog", "Pack");
		animalsToGroups.put("crocodile", "Float");
		
		animalName = animalName.toLowerCase();
		/*String groupName = animalsToGroups.get(animalName);
		if (groupName == null) {
			groupName = "unknown";
		}
		return groupName;*/
		if(animalsToGroups.containsKey(animalName)) {
			return animalsToGroups.get(animalName);
		}
		return "unknown"; 
		
	}
	//done

	
	
	/*
	 * Given an String item number (a.k.a. SKU), return the discount percentage if the item is on sale.
	 * If the item is not on sale, return 0.00.
	 * 
	 * If the item number is empty or null, return 0.00.
	 * 
	 * "KITCHEN4001" -> 0.20
	 * "GARAGE1070" -> 0.15
	 * "LIVINGROOM"	-> 0.10
	 * "KITCHEN6073" -> 0.40
	 * "BEDROOM3434" -> 0.60
	 * "BATH0073" -> 0.15
	 * 
	 * The item number should be case insensitive so "kitchen4001", "Kitchen4001", and "KITCHEN4001"
	 * should all return 0.20.
	 *  
	 * isItOnSale("kitchen4001") → 0.20
	 * isItOnSale("") → 0.00
	 * isItOnSale("GARAGE1070") → 0.15
	 * isItOnSale("dungeon9999") → 0.00 
	 * 
	 */
	public Double isItOnSale(String itemNumber) {
		Map<String, Double> skus = new HashMap<>();
		skus.put("KITCHEN4001", 0.20);
		skus.put("GARAGE1070", 0.15);
		skus.put("LIVINGROOM", 0.10);
		skus.put("KITCHEN6073", 0.40);
		skus.put("BEDROOM3434", 0.60);
		skus.put("BATH0073", 0.15);
		
		//case 
		itemNumber = itemNumber.toUpperCase();
		
		//checks
		if(skus.containsKey(itemNumber)) {
			return skus.get(itemNumber);
		}
		// return if fail
		return 0.00d; 	
	}
	//done
	
	/*
	 * Modify and return the given map as follows: if "Peter" has more than 0 money, transfer half of it to "Paul",
	 * but only if Paul has less than $10s.
	 * 
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 * 
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
	 * 
	 */
	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
		// add new map
		Map<String, Integer> peterPaulNew = new HashMap<>();
		// check if peter has more than $0
		// check if paul has less than $10
		if (peterPaul.get("Peter") > 0 && peterPaul.get("Paul") < 1000 ) {
			//divide peter's cash in half
			int x = peterPaul.get("Peter")/2;
			// transfer half of peter's money to paul
			peterPaulNew.put("Peter", x);
			peterPaulNew.put("Paul", peterPaul.get("Paul")+x);
			// if money doesn't divide evenly
			if (peterPaul.get("Peter") % 2 != 0) {
				peterPaulNew.put("Peter", peterPaulNew.get("Peter") + 1);
			}
		} else {
			peterPaulNew = peterPaul;
		}
		return peterPaulNew;
	}
	//done
	
    /*
	 * Modify and return the given map as follows: if "Peter" has $50 or more, AND "Paul" has $100 or more,
	 * then create a new "PeterPaulPartnership" worth a combined contribution of a quarter of each partner's
	 * current worth.
	 * 
	 * peterPaulPartnership({"Peter": 5000, "Paul": 10000}) → {"Peter": 3750, "Paul": 7500, "PeterPaulPartnership": 3750}
	 * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333, "Paul": 1234567890}
	 * 
	 */
	public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
		// check if peter has $50 or more && paul has $100 or more
		if (peterPaul.get("Peter") >= 5000 && peterPaul.get("Paul") >= 10000 ) {
			//add values to table for partnership
			peterPaul.put("PeterPaulPartnership", (peterPaul.get("Peter")+peterPaul.get("Paul"))/4);
			// remove 1/4 from each
			peterPaul.put("Peter", peterPaul.get("Peter")-(peterPaul.get("Peter")/4));
			peterPaul.put("Paul", peterPaul.get("Paul")-(peterPaul.get("Paul")/4));
		}
		// return Map
		return peterPaul;
	}
	//done
	
	/*
	 * Given an array of non-empty strings, return a Map<String, String> where for every different string in the array, 
	 * there is a key of its first character with the value of its last character.
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
	 * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"}
	 */
	public Map<String, String> beginningAndEnding(String[] words) {
		// create new map
		Map<String, String> firstAndLast = new HashMap<String, String>();
		// run through string array
		for(String word : words) {// get first char && get last char && assign last char to key first char
			firstAndLast.put(word.substring(0, 1), word.substring(word.length()-1, word.length()));
		}
		
		//return map
		return firstAndLast;
	}
	// done
	
	/*
	 * Given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the 
	 * number of times that string appears in the array.
	 * 
	 * ** A CLASSIC **
	 * 
	 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
	 * wordCount([]) → {}
	 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
	 * 
	 */
	public Map<String, Integer> wordCount(String[] words) {
		//set up new map
		Map<String, Integer> stringCount = new HashMap<>();
		for(String word : words) { // run through array

			// count number of times a string appears in array && store as temp int
			if (!stringCount.containsKey(word)) {// if no value in map add to map with value 1
				stringCount.put(word, 1);// set key to int and store string in new array
            } else { // if multople instances of value are found increase count
                int count = stringCount.get(word);
                stringCount.put(word, count + 1);// set key to int and store string in new array
            }
		}
		//return results
		return stringCount;
	}
	//done
	
	/*
	 * Given an array of int values, return a Map<Integer, Integer> with a key for each int, with the value the 
	 * number of times that int appears in the array.
	 * 
	 * ** The lesser known cousin of the the classic wordCount **
	 * 
	 * integerCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 1, 44: 1, 55: 1, 63: 3, 77: 1, 99:2}
	 * integerCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
	 * integerCount([]) → {}
	 * 
	 */
	public Map<Integer, Integer> integerCount(int[] ints) {
		//set up new map
				Map<Integer, Integer> intCount = new HashMap<>();
				for(Integer num : ints) { // run through array
					// count number of times a number appears in array && store as temp int
					if (!intCount.containsKey(num)) {// if no value in map add to map with value 1
						intCount.put(num, 1);// set key to int and store int in new array
		            } else { // if multople instances of value are found increase count
		                int count = intCount.get(num);
		                intCount.put(num, count + 1);// set key to int and store string in new array
		            }
				}
				//return results
				return intCount;
	}
	// done
	
	/*
	 * Given an array of strings, return a Map<String, Boolean> where each different string is a key and value
	 * is true only if that string appears 2 or more times in the array.
	 * 
	 * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
	 * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 * 
	 */
	public Map<String, Boolean> wordMultiple(String[] words) {
		//set up new map
		Map<String, Boolean> moreThanTwice = new HashMap<>();
		for(String word : words) { // run through array
			// count number of times a number appears in array && store as temp int
			if (!moreThanTwice.containsKey(word)) {// if no value in map add to map with a default value of false
				moreThanTwice.put(word, false);// set key to int and store int in new array
            } else { // check if in map contains string and set to true
            		moreThanTwice.put(word, true);
            }
		}
		//return results
		return moreThanTwice;
	}
	// done
	
	/*
	 * Given two maps, Map<String, Integer>, merge the two into a new map, Map<String, Integer> where keys in Map2, 
	 * and their Integer values, are added to the Integer values of matching keys in Map1. Return the new map.
	 * 
	 * Unmatched keys and their Integer values in Map2 are simply added to Map1.
	 *  
	 * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11, "SKU4": 5})
	 * 	 → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
	 * 
	 */
	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse, Map<String, Integer> remoteWarehouse) {
		// create new map with all data from warehouse
		Map<String, Integer> combinedMap = mainWarehouse;
		// create set with keys from second map
		Set<String> keys = remoteWarehouse.keySet();
		
	
		// run through list 2 && check for matches
		for(String key : keys) { // if matched combine values && ad to msp
			if (combinedMap.containsKey(key) && remoteWarehouse.containsKey(key) ) {
				combinedMap.put(key,combinedMap.get(key)+remoteWarehouse.get(key));
			} else {
				// if unmatched add values as are
				combinedMap.put(key, remoteWarehouse.get(key));
			}
		}
		
		// return combined map
		return combinedMap;
	}
	//done

	/*
	 * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
	 * 
	 * Given an array of strings, for each string, the count of the number of times that a substring length 2 appears 
	 * in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1. 
	 * 
	 * We don't count the end substring, but the substring may overlap a prior position by one.  For instance, "xxxx"
	 * has a count of 2, one pair at position 0, and the second at position 1. The third pair at position 2 is the
	 * end substring, which we don't count.  
	 * 
	 * Return Map<String, Integer>, where the key is string from the array, and its last2 count.
	 *  
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
	 * 
	 */
	public Map<String, Integer> last2Revisted(String[] words) {
		// create new map
		Map<String, Integer> lastTwoCount = new HashMap<>();
		for(String word : words) { // run through strings
			String x = word.substring(word.length()-2, word.length()); // store last 2 char of current word as temporary string
		    // compare stored value to rest of string
			Integer count =0; // declare count
			for(int i = 0; i < word.length()-2; i++) { 
				if(word.substring(i, i+2).equals(x)) { // compair strings
					count++; // add to count if same
				}
			}
			lastTwoCount.put(word, count); // add to map
		}
		//return results
		return lastTwoCount;
	}
	//done
}
