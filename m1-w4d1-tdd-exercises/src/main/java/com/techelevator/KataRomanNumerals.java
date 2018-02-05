package com.techelevator;

import java.util.TreeMap;

public class KataRomanNumerals {
	
	private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {

        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

    }

    public static String convertToRomanNumerals(int input) {
        int l =  map.floorKey(input);
        if ( input == l ) {
            return map.get(input);
        }
        return map.get(l) + convertToRomanNumerals(input-l);
    }
    
//    private static int number;
//    public static String convertToRomanNumerals(int input) {
//    String result = "";
//    number = input;
//    
//    // long form
//    result += convertNumberToRoman(1000, "M");
//    result += convertNumberToRoman(900, "CM");
//    result += convertNumberToRoman(500, "D");
//    result += convertNumberToRoman(100, "CD");
//    result += convertNumberToRoman(100, "C");
//    result += convertNumberToRoman(90, "XC");
//    result += convertNumberToRoman(50, "L");
//    result += convertNumberToRoman(40, "XL");
//    result += convertNumberToRoman(10, "X");
//    result += convertNumberToRoman(9, "IX");
//    result += convertNumberToRoman(5, "V");
//    result += convertNumberToRoman(4, "IV");
//    result += convertNumberToRoman(1, "I");
//    return result;
//    
//    }
//    
//    private static String convertNumberToRoman (int takeaway, String replacementRoman) {
//    	String result = "";
//    	while (number >= takeaway) {
//    		number -= takeaway;
//    		result += replacementRoman;
//    }
//    	return result;
//
//    }
    
    
    
    
    
    private final static TreeMap<String, Integer> reverseMap = new TreeMap<String, Integer>();

    static {

    	reverseMap.put("M", 1000);
    	reverseMap.put("CM",900);
    	reverseMap.put("D", 500);
    	reverseMap.put("CD", 400);
    	reverseMap.put("C", 100);
    	reverseMap.put("XC", 90);
    	reverseMap.put("L", 50);
    	reverseMap.put("XL", 40);
    	reverseMap.put("X", 10);
    	reverseMap.put("IX", 9);
    	reverseMap.put("V", 5);
    	reverseMap.put("IV", 4);
    	reverseMap.put("I", 1);

    }
    
    
    
    public static int convertToBaseTen(String roman) {
    	
    	int converted = 0;
    	do {
    		if ( roman.substring(0, 1) == "I" && roman.length() > 0) {
    			converted += reverseMap.get(roman.substring(0, 1));
    			roman = roman.substring(1);
    		}
    	}
    	while (roman.length() > 0);
    	return converted;
    
    }

}
