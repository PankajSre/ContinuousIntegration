package com.stackroute.activitystream;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.stackroute.activitystream.Calculator;

public class CalculatorTest {

	private static Calculator calculator;
	
	@BeforeClass
	public static void init()
	{
		calculator = new Calculator();
	}
	@Test
	public void testForSum() {
		assertEquals(12, calculator.findSum(6, 6));
	}
	
	@Test
	public void testForSumAgain() {
		assertEquals(20, calculator.findSum(10, 10));
	}

}
