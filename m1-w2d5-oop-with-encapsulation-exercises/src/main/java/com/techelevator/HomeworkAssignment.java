package com.techelevator;

public class HomeworkAssignment {
	// instance var
	private int totalMarks;
	private int possibleMarks;
	private String submitterName;
	
	// constructor
	public HomeworkAssignment(int possibleMarks) {
		this.possibleMarks = possibleMarks;
	}
	
	// method
	public String letterGrade() {
		int percent = (int)((totalMarks * 100.0f) / possibleMarks);
		if (percent > 90) {
			return "A";
		} else if (percent > 80 && percent <= 89) {
			return "B";
		} else if (percent > 70 && percent <= 79) {
			return "C";
		} else if (percent > 60 && percent <= 69) {
			return "D";
		} else {
			return "F";
		}
		
		
	}
	
	// getters && setters
	public int getTotalMarks() {
		return totalMarks;
	}
	public int getPossibleMarks() {
		return possibleMarks;
	}
	public String getSubmitterName() {
		return submitterName;
	}
	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	//Derivative getter
	public String getLetterGrade() {
		return letterGrade();
	}
}
