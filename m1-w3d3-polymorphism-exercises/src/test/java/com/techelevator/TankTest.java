package com.techelevator;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class TankTest {
	private Tank sut;
	@Before
	public void setUp() throws Exception {
		sut = new Tank();
	}

	@Test
	public void testCalculateToll() {
		assertEquals(new BigDecimal("0.000"), sut.calculateToll(10));
		assertEquals(new BigDecimal("0.000"), sut.calculateToll(20));
	}

}
