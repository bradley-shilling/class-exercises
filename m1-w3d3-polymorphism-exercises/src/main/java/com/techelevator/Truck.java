package com.techelevator;

import java.math.BigDecimal;

public class Truck implements Vehicles {
	/*
	 * inst var
	 */
	private int numberOfAxels;
	
	/*
	 * const
	 */
	public Truck(int numberOfAxels) {
		this.numberOfAxels = numberOfAxels;
	}
	/*
	 * meth
	 */
	@Override
	public BigDecimal calculateToll(int distance) {
		if (numberOfAxels <=4 && numberOfAxels >0 && distance > 0) {
			return new BigDecimal("0.040").multiply(new BigDecimal(distance));
		} else if (numberOfAxels <=6 && numberOfAxels >4 && distance > 0) {
			return new BigDecimal("0.045").multiply(new BigDecimal(distance));
		}else if (numberOfAxels>6 && distance > 0) {
			return new BigDecimal("0.048").multiply(new BigDecimal(distance));
		} else {
			return new BigDecimal("0.000");
		}
	}
	
	
	/*
	 * get / set
	 */
	

	

}
