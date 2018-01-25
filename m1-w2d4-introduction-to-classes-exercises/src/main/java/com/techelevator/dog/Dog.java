package com.techelevator.dog;

public class Dog {

	//
	// Write code here
	//
	//1. declare instance variables
	private boolean sleeping = false;
	
	//3. create methods
	public String makeSound() {
		if(sleeping) {
			return "Zzzzz...";
		}
		return "Woof!";
	};
	public void sleep() {
		sleeping = true;
	};
	public void wakeUp() {
		sleeping = false;
		
	};

	
	//2. define getters and setters
	public boolean isSleeping() {
		return sleeping;
	}

	public void setSleeping(boolean sleeping) {
		this.sleeping = sleeping;
	}
	
}
