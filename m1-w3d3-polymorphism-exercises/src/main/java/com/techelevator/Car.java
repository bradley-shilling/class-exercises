package com.techelevator;

import java.math.BigDecimal;

public class Car implements Vehicles {
	/*
	 * inst var
	 */
	private boolean hasTrailer = false;

	
	
	/*
	 * const
	 */
	public Car(boolean hasTrailer) {
		// TODO Auto-generated constructor stub
		this.hasTrailer = hasTrailer;
	}
	
	/*
	 * meth
	 */
	@Override
	public BigDecimal calculateToll(int distance) {
		BigDecimal toll = new BigDecimal("0.020").multiply(new BigDecimal(distance));
		if (! hasTrailer && distance > 0) {
			 return toll;
		} else if (distance > 0) {
			toll = toll.add(new BigDecimal("1.00"));
			return toll;
		} else {
			return new BigDecimal("0.000");
		}
	}
	
	
	/*
	 * get / set
	 */
	
	
	


	

}
