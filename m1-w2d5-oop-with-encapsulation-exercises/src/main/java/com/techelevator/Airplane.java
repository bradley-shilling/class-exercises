package com.techelevator;

public class Airplane {
	// create instance variables
	private String planeNumber ="";
	private int bookedFirstClassSeats;
	private int totalFirstClassSeats;
	private int bookedCoachSeats;
	private int totalCoachSeats;
	
	// 3 define constructors
	public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
		this.planeNumber = planeNumber;
		this.totalFirstClassSeats = totalFirstClassSeats;
		this.totalCoachSeats = totalCoachSeats;
	}
	
	// 4 define methods
	public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
		if (forFirstClass) {
			if(availableFirstClassSeats()>=totalNumberOfSeats) {
				bookedFirstClassSeats += totalNumberOfSeats;
				return true;
			} else {
				return false;
			}
		} else {
			if(availableCoachSeats()>=totalNumberOfSeats) {
				bookedCoachSeats += totalNumberOfSeats;
				return true;
			} else {
				return false;
			}
			
		}
		
	}
	
	public int availableFirstClassSeats() {
		return totalFirstClassSeats - bookedFirstClassSeats ;
	}
	public int availableCoachSeats() {
		return totalCoachSeats - bookedCoachSeats ;
	}
	
	// define getters
	public String getPlaneNumber() {
		return planeNumber;
	}

	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}

	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}

	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}

	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}
	public int getAvailableFirstClassSeats() {
		return availableFirstClassSeats();
	}
	public int getAvailableCoachSeats() {
		return availableCoachSeats();
	}

}
