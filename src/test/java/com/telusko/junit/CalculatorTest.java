package com.telusko.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator c = new Calculator();
		int actualResult = c.multiply(5, 28);
		int expectedResult = 140;
		assertEquals(expectedResult, actualResult);
	}

}
