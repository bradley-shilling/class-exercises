package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataFizzBuzzTest {
	@Test
	public void fizzBuzzOut1() {
		assertEquals("1", KataFizzBuzz.fizzBuzz(1));
	}
	
	@Test
	public void fizzBuzzOut2() {
		assertEquals("2", KataFizzBuzz.fizzBuzz(2));
	}
	@Test
	public void fizzBuzzOut3() {
		assertEquals("Fizz", KataFizzBuzz.fizzBuzz(3));
	}
	@Test
	public void fizzBuzzOut4() {
		assertEquals("4", KataFizzBuzz.fizzBuzz(4));
	}
	@Test
	public void fizzBuzzOut5() {
		assertEquals("Buzz", KataFizzBuzz.fizzBuzz(5));
	}
	@Test
	public void fizzBuzzOut15() {
		assertEquals("FizzBuzz", KataFizzBuzz.fizzBuzz(15));
	}
	@Test
	public void fizzBuzzOut13() {
		assertEquals("Fizz", KataFizzBuzz.fizzBuzz(13));
	}
	@Test
	public void fizzBuzzOut52() {
		assertEquals("Buzz", KataFizzBuzz.fizzBuzz(52));
	}
	@Test
	public void fizzBuzzOut53() {
		assertEquals("FizzBuzz", KataFizzBuzz.fizzBuzz(53));
	}
	@Test
	public void fizzBuzzOut0() {
		assertEquals("0", KataFizzBuzz.fizzBuzz(0));
	}
	@Test
	public void fizzBuzzOut101() {
		assertEquals("Out of range.", KataFizzBuzz.fizzBuzz(101));
	}
	@Test
	public void fizzBuzzOut35() {
		assertEquals("FizzBuzz", KataFizzBuzz.fizzBuzz(35));
	}

}
