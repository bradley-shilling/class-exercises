package com.techelevator.shoppingcart;

public class ShoppingCart {

	//
	// Write code here
	//
	// 1. define instance var
	private int totalNumberOfItems;
	private double totalAmountOwed;
	
	//3. create methods
	public double getAveragePricePerItem() {
		if (totalAmountOwed != 0 && totalNumberOfItems !=0) {
		return (totalAmountOwed / totalNumberOfItems);
		}
		return 0;
	};
	public void addItems(int numberOfItems, double pricePerItem) {
		totalNumberOfItems = totalNumberOfItems + numberOfItems;
		totalAmountOwed = totalAmountOwed +(pricePerItem * numberOfItems);
	};
	public void empty() {
		totalNumberOfItems = 0;
		totalAmountOwed = 0;
		
	};
	
	// 2. define getters and setters
	public int getTotalNumberOfItems() {
		return totalNumberOfItems;
	}
	public void setTotalNumberOfItems(int totalNumberOfItems) {
		this.totalNumberOfItems = totalNumberOfItems;
	}
	public double getTotalAmountOwed() {
		return totalAmountOwed;
	}
	public void setTotalAmountOwed(double totalAmountOwed) {
		this.totalAmountOwed = totalAmountOwed;
	}
	
}
