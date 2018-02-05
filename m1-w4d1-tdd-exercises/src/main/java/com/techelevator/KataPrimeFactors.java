package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class KataPrimeFactors {
	public static List<Integer> factorize(int originalNumber) {
        
        List<Integer> factors = new ArrayList<Integer>(); // create list
        for (int i = 2; i <= originalNumber; i++) { // run while counter i is lessthan or equal to int n
            while (originalNumber % i == 0) { // this will increase  with each loop and check for primes
                factors.add(i); // add  found primes to array
                originalNumber /= i; //divide original number by i
            }
        }
        return factors; // return array
    }
}
