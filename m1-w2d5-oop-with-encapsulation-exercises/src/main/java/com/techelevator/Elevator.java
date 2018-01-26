package com.techelevator;

public class Elevator {
	//1. define instand variables
	private int currentFloor = 1;
	private int numberOfFloors;
	private boolean doorOpen;
	
	//3 define constructors
	public Elevator(int totalNumberOfFloors) {
		this.numberOfFloors = totalNumberOfFloors;
	}
	
	//4 Define methods
	public void openDoor() {
		doorOpen = true;
	}
	public void closeDoor() {
		doorOpen = false;
	}
	public void goUp(int desiredFloor) {
		if (!doorOpen && desiredFloor <= numberOfFloors && desiredFloor > currentFloor) {
			currentFloor = desiredFloor;
		}
	}
	public void goDown(int desiredFloor) {
		if (!doorOpen && desiredFloor <= numberOfFloors && desiredFloor < currentFloor && desiredFloor >= 1) {
			currentFloor = desiredFloor;
		}
	}
	
	
	//2 create getters 
	public int getCurrentFloor() {
		return currentFloor;
	}
	
	public int getNumberOfFloors() {
		return numberOfFloors;
	}
	
	public boolean isDoorOpen() {
		return doorOpen;
	}
	
	
	
	

}
