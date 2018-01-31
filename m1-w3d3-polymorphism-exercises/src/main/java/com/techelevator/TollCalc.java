package com.techelevator;

import java.math.BigDecimal;
import java.util.Random;

public class TollCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * initialize local var
		 */
		int totalMiles = 0;
		BigDecimal totalCost = new BigDecimal("0.00");
		
		/*
		 * create list of vehicles
		 */
		Vehicles[] listOfVehicles = { new Car(true), new Car(false), new Truck(4), new Truck(6), new Truck(8), new Tank()};
		
		
		/*
		 * start table
		 */
		System.out.printf("%-20s %-20s %-20s", "Vehicle", "Distance Traveled", "Toll $");
		System.out.println();
		System.out.println("------------------------------------------------------");
		/*
		 * run through list of vehicls
		 */
		for(Vehicles thisVehicle : listOfVehicles) {
			int  n = new Random().nextInt(1000) + 1;
			thisVehicle.calculateToll(n);
			System.out.printf("%-20s %-20s $%.2f%n", thisVehicle.getClass().getSimpleName(), n, thisVehicle.calculateToll(n));
			totalCost = totalCost.add(thisVehicle.calculateToll(n));
			totalMiles += n;	
		}
		/*
		 * close table
		 */
		System.out.println("------------------------------------------------------");
		System.out.printf("%-40s $%.2f%n", "Total Toll", totalCost);
		System.out.println();
		System.out.printf("%-40s %-20s", "Total Distance Traveled", totalMiles);
		System.out.println();
		
		
		

	}

}
