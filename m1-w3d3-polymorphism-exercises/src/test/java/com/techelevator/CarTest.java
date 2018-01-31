package com.techelevator;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class CarTest {
	private Car sut;
	private Car sut2;

	@Before
	public void setUp() throws Exception {
		sut = new Car(true);
		sut2 = new Car(false);
	}

	@Test
	public void testCar() {
		assertNotNull(sut);
	}

	@Test
	public void testCalculateToll() {
		assertEquals(new BigDecimal("0.200"), sut2.calculateToll(10));
		
	}
	@Test
	public void testCalculateTollTrailer() {
		assertEquals(new BigDecimal("1.200"), sut.calculateToll(10));
	}
	@Test
	public void testCalculateTollNeg() {
		assertEquals(new BigDecimal("0.000"), sut.calculateToll(-10));
	}
	

}
