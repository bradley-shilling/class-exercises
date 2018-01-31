package com.techelevator;

import java.math.BigDecimal;

public class PostalServiceFirstClass implements DeliveryDriver {
	/*
	 * Instance Var
	 */
	//int weightInOunces;
	BigDecimal pricePerMile;
	BigDecimal totalCost;
	
	
	
	/*
	 * Constructors
	 */
	
	/*
	 * methods
	 */
	public BigDecimal calculateRate(int distance, int weight) {
		if (weight>= 0 && weight <= 2 ) {
			pricePerMile = new BigDecimal("0.035");
			totalCost = pricePerMile.multiply(new BigDecimal(distance));
		} else if (weight > 2 && weight <= 8 ) {
				pricePerMile = new BigDecimal("0.040");
				totalCost = pricePerMile.multiply(new BigDecimal(distance));
		} else if (weight > 8 && weight <= 15 ) {
			pricePerMile = new BigDecimal("0.047");
			totalCost = pricePerMile.multiply(new BigDecimal(distance));
		} else if (weight > 8 && weight <= 48 ) {
			pricePerMile = new BigDecimal("0.195");
			totalCost = pricePerMile.multiply(new BigDecimal(distance));
		} else if (weight > 48 && weight <= 128 ) {
			pricePerMile = new BigDecimal("0.450");
			totalCost = pricePerMile.multiply(new BigDecimal(distance));
		} else if (weight > 128 ) {
			pricePerMile = new BigDecimal("0.500");
			totalCost = pricePerMile.multiply(new BigDecimal(distance));
		} else {
			totalCost = new BigDecimal("0.00");
		}
		return totalCost;
		
	}
	
	/*
	 * Getter and setter
	 */

}
