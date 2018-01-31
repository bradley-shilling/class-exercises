package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HomeworkAssignmentTest {
	
	/*
	 * Test for these things:
	 * does the correct letter grade get returned?
	 * what happens when an incorrect value is given for total marks?
	 */
	
	/*
	 * Instance varible subject unit to test
	 */
	private HomeworkAssignment ass;
	
	
	/*
	 * create HomeworkAssignment object with 100 possible marks and submitter name of name
	 */
	@Before
	public void setUp() throws Exception {
		ass = new HomeworkAssignment(100);
		ass.setSubmitterName("Name");
	}
	
	/*
	 * Check if object was created
	 */
	@Test
	public void testHomeworkAssignment() {
		assertNotNull(ass); // check if  object was created
	}
	
	/*
	 * Check if get total marks works
	 */
	@Test
	public void testGetTotalMarks() {
		ass.setTotalMarks(100);
		assertEquals(100, ass.getTotalMarks()); 
	}
	
	/*
	 * Check if set total marks works
	 */
	@Test
	public void testSetTotalMarks() {
		ass.setTotalMarks(80);
		assertEquals(80, ass.getTotalMarks());
	}
	
	/*
	 * Check if get possible marks works
	 */
	@Test
	public void testGetPossibleMarks() {
		assertEquals(100, ass.getPossibleMarks());
	}
	/*
	 * Check if get name works
	 */
	@Test
	public void testGetSubmitterName() {
		assertEquals("Name", ass.getSubmitterName());
	}

	/*
	 * Check if set name works
	 */
	@Test
	public void testSetSubmitterName() {
		ass.setSubmitterName("NotName");
		assertEquals("NotName", ass.getSubmitterName());
	}

	/*
	 * Check if Letter grade returns a result
	 */
	@Test
	public void testGetLetterGrade() {
		assertNotNull(ass.getLetterGrade());
	}
	/*
	 * does the correct letter grade get returned?
	 * what happens when an incorrect value is given for total marks?
	 */
	@Test
	public void testGetLetterGradeValue() {
		double letterGrade = ((double)ass.getTotalMarks() / ass.getPossibleMarks()) * 100; // get percent
		String testLetterGrade = "";
		if (letterGrade < 101 && letterGrade >= 90) {
			testLetterGrade = "A";
		}else if (letterGrade < 90 && letterGrade >= 80) {
			testLetterGrade = "B";
		}else if (letterGrade < 80 && letterGrade >= 70) {
			testLetterGrade = "C";
		}else if (letterGrade < 70 && letterGrade >= 60) {
			testLetterGrade = "D";
		} else if (letterGrade < 60 && letterGrade >= 0) {
			testLetterGrade = "F";
		} else {
		}
		
		assertEquals(testLetterGrade, ass.getLetterGrade());
		
	}
	
	/*
	 * what happens when an incorrect value is given for total marks?
	 */
	@Test
	public void testGetLetterGradeIsValid() {
		if (ass.getTotalMarks() > ass.getPossibleMarks() || ass.getTotalMarks() < 0) {
			assert false;
		}
		
	}

}
