package com.techelevator;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class TruckTest {
	private Truck sut;
	private Truck sut2;
	private Truck sut3;
	private Truck sut4;
	private Truck sut5;
	private Truck sut6;

	@Before
	public void setUp() throws Exception {
		sut = new Truck(2);
		sut2 = new Truck(4);
		sut3 = new Truck(6);
		sut4 = new Truck(8);
		sut5 = new Truck(10);
		sut6 = new Truck(-10);
	}

	@Test
	public void testTruck() {
		assertNotNull(sut);
	}

	@Test
	public void testCalculateToll4OrLess() {
		assertEquals(new BigDecimal("0.400"), sut.calculateToll(10));
		assertEquals(new BigDecimal("0.800"), sut2.calculateToll(20));
	}
	@Test
	public void testCalculateToll4To6() {
		assertEquals(new BigDecimal("0.450"), sut3.calculateToll(10));
	}
	@Test
	public void testCalculateToll8OrMore() {
		assertEquals(new BigDecimal("0.480"), sut4.calculateToll(10));
		assertEquals(new BigDecimal("0.960"), sut5.calculateToll(20));
	}
	@Test
	public void testCalculateTollNeg() {
		assertEquals(new BigDecimal("0.000"), sut4.calculateToll(-100));
	}
	@Test
	public void testCalculateTollNegAxles() {
		assertEquals(new BigDecimal("0.000"), sut6.calculateToll(100));
	}

}
