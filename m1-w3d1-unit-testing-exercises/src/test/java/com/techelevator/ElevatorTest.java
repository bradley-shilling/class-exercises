package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ElevatorTest {
	
	/*
	 * Instance varible subject unit to test
	 */
	private Elevator elevator;
	/*
	 * Done ??? - unintended side effects when calling methods
	 * Done - moving between floors when the doors are open
	 * Done - going up past the ceiling
	 */

	@Before
	public void setUp() throws Exception {
		elevator = new Elevator(1, 10); // create object for each test
	}

	@Test
	public void testElevator() {
		assertNotNull(elevator); // check if elevator object was created
	}

	@Test
	public void testGetShaftNumber() {
		assertEquals(1, elevator.getShaftNumber()); // check if elevator returns shaft number
	}

	@Test
	public void testGetCurrentLevel() {
		assertEquals(1, elevator.getCurrentLevel()); // check if returns current level
	}

	@Test
	public void testGetNumberOfLevels() {
		assertEquals(10, elevator.getNumberOfLevels()); // check if elevator returns number of levels
	}

	@Test
	public void testIsDoorOpen() {
		assertNotNull(elevator.isDoorOpen()); // test if is door open returns something
	}

	@Test
	public void testIsMoving() {
		assertNotNull(elevator.isMoving()); // test if isMoving returns something
	}

	@Test
	public void testOpenDoor() {
		elevator.CloseDoor(); // call close door
		elevator.OpenDoor(); // call open door
		assertEquals(true,elevator.isDoorOpen()); // test if door opened
	}

	@Test
	public void testCloseDoor() {
		elevator.CloseDoor(); // test close door method
		assertEquals(false,elevator.isDoorOpen()); // test if door closed
	}
	
	/*
	 * test moving up with doors opened
	 */
	@Test
	public void testGoUpWithDoorOpen() {
		elevator.OpenDoor(); // call open door 
		elevator.GoUp(5); // go up 5 floors
		assertEquals(1,elevator.getCurrentLevel()); // test if elevator moved with open doors
	}
	/*
	 * test going past ceiling
	 */
	@Test
	public void testGoUpPastTop() {
		elevator.CloseDoor();
		elevator.GoUp(11); // go up 11 floors
		assertFalse(elevator.getCurrentLevel() > elevator.getNumberOfLevels()); // test if elevator went higher than total levels
	}
	@Test
	public void testGoUp() {
		elevator.CloseDoor();
		elevator.GoUp(5); // go up 5 floors
		assertEquals(5, elevator.getCurrentLevel()); // test if elevator went up expected number of floors
	}
	

	@Test
	public void testGoDown() {
		elevator.CloseDoor();
		elevator.GoUp(5); // go up 5 floors
		elevator.GoDown(3); // go down to 3 floor
		assertEquals(3, elevator.getCurrentLevel()); // test if elevator went up expected number of floors
	}
	@Test
	public void testGoDownWithDoorOpen() {
		elevator.OpenDoor(); // call open door 
		elevator.GoUp(5); // go up 5 floors
		elevator.GoDown(3); // go down 3 floors
		assertEquals(1,elevator.getCurrentLevel()); // test if elevator moved with open doors
	}
	@Test
	public void testGoDownPastBasement() {
		elevator.CloseDoor();
		elevator.GoUp(5); // go up 5 floors
		elevator.GoDown(6);
		assertFalse(elevator.getCurrentLevel() < 1); // test if elevator went down past first level
	}

}
