package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataRomanNumeralsTest {
	@Test
	public void testThatOneIsI() {
		assertEquals("I", KataRomanNumerals.convertToRomanNumerals(1));
	}
	@Test
	public void testThatTwoIsII() {
		assertEquals("II", KataRomanNumerals.convertToRomanNumerals(2));
	}
	@Test
	public void testThatFourIsIV() {
		assertEquals("IV", KataRomanNumerals.convertToRomanNumerals(4));
	}
	@Test
	public void testThatFiveIsV() {
		assertEquals("V", KataRomanNumerals.convertToRomanNumerals(5));
	}
	@Test
	public void testThatSevenIsVII() {
		assertEquals("VII", KataRomanNumerals.convertToRomanNumerals(7));
	}
	@Test
	public void testThatElevenIsXI() {
		assertEquals("XI", KataRomanNumerals.convertToRomanNumerals(11));
	}
	@Test
	public void testThatFiftySixIsLVI() {
		assertEquals("LVI", KataRomanNumerals.convertToRomanNumerals(56));
	}
	@Test
	public void testThatFiftyFourIsLIV() {
		assertEquals("LIV", KataRomanNumerals.convertToRomanNumerals(54));
	}
	@Test
	public void testThatNineIsIX() {
		assertEquals("IX", KataRomanNumerals.convertToRomanNumerals(9));
	}
	@Test
	public void testThatThreeThousandIsMMM() {
		assertEquals("MMM", KataRomanNumerals.convertToRomanNumerals(3000));
	}
	@Test
	public void testThatTwoThousandOneIsMMI() {
		assertEquals("MMI", KataRomanNumerals.convertToRomanNumerals(2001));
	}
	@Test
	public void testIIs1() {
		assertEquals(1, KataRomanNumerals.convertToBaseTen("I"));
	}
	@Test
	public void testIIIs2() {
		assertEquals(2, KataRomanNumerals.convertToBaseTen("II"));
	}
	

}
