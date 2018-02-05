package com.techelevator;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class KataPrimeFactorsTest {
	
	
	@Test
	public void test2()
	{
	  List<Integer> actual = Arrays.asList(2);
	  assertEquals(actual, KataPrimeFactors.factorize(2));
	}
	@Test
	public void test3()
	{
	  List<Integer> actual = Arrays.asList(3);
	  assertEquals(actual, KataPrimeFactors.factorize(3));
	}
	@Test
	public void test4()
	{
	  List<Integer> actual = Arrays.asList(2,2);
	  assertEquals(actual, KataPrimeFactors.factorize(4));
	}
	@Test
	public void test6()
	{
	  List<Integer> actual = Arrays.asList(2,3);
	  assertEquals(actual, KataPrimeFactors.factorize(6));
	}
	@Test
	public void test7()
	{
	  List<Integer> actual = Arrays.asList(7);
	  assertEquals(actual, KataPrimeFactors.factorize(7));
	}
	@Test
	public void test8()
	{
	  List<Integer> actual = Arrays.asList(2,2,2);
	  assertEquals(actual, KataPrimeFactors.factorize(8));
	}
	@Test
	public void test9()
	{
	  List<Integer> actual = Arrays.asList(3,3);
	  assertEquals(actual, KataPrimeFactors.factorize(9));
	}
	@Test
	public void test10()
	{
	  List<Integer> actual = Arrays.asList(2,5);
	  assertEquals(actual, KataPrimeFactors.factorize(10));
	}
	@Test
	public void test360()
	{
	  List<Integer> actual = Arrays.asList(2,2,2,3,3,5);
	  assertEquals(actual, KataPrimeFactors.factorize(360));
	}
	@Test
	public void test757()
	{
	  List<Integer> actual = Arrays.asList(757);
	  assertEquals(actual, KataPrimeFactors.factorize(757));
	}

}
