package com.techelevator;

public class FruitTree {
	// instance var
	private String typeOfFruit;
	private int piecesOfFruitLeft;
	
	//const
	public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
		this.typeOfFruit = typeOfFruit;
		this.piecesOfFruitLeft = startingPiecesOfFruit;	
	}
	//meth
	public boolean pickFruit(int numberOfPiecesToRemove) {
		if (piecesOfFruitLeft >= numberOfPiecesToRemove && numberOfPiecesToRemove > 0) {
			piecesOfFruitLeft -= numberOfPiecesToRemove;
			return true;
		}
		return false;
		
	}
	
	//get set
	public String getTypeOfFruit() {
		return typeOfFruit;
	}
	public int getPiecesOfFruitLeft() {
		return piecesOfFruitLeft;
	}

}
