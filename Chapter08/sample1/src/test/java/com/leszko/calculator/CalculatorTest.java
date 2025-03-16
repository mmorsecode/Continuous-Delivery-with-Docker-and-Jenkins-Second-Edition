package com.leszko.calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
     private Calculator calculator = new Calculator();

	@Test
	public void testSum() {
    		Calculator calculator = new Calculator();
    		assertEquals(5, calculator.sum(2, 2)); // Change expected result to force failure
}

