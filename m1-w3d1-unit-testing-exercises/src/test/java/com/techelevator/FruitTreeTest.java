package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FruitTreeTest {
	
	//instance variable - subject under test
	private FruitTree tree;

	@Before
	public void setUp() throws Exception {
		tree = new FruitTree("Apple", 10); // create new tree for each test
	}

	@Test
	public void testFruitTree() {
		assertNotNull(tree); // check if tree was created
	}

	@Test
	public void testGetTypeOfFruit() {
		assertEquals("Apple", tree.getTypeOfFruit()); // check type of fruit
	}

	@Test
	public void testGetPiecesOfFruitLeft() {
		assertEquals(10, tree.getPiecesOfFruitLeft()); // check if pices of fruit left is working
	}

	@Test
	public void testPickFruit() {
		boolean result = tree.pickFruit(-1); // Act
		assertEquals(false, result); // make sure we cant pick negative fruit
		assertEquals(10, tree.getPiecesOfFruitLeft());
		
	}

}
