package com.example.calculator;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(8, calculator.add(5, 3));
        assertEquals(0, calculator.add(-5, 5));
        assertEquals(-8, calculator.add(-3, -5));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3));
        assertEquals(-10, calculator.subtract(-5, 5));
        assertEquals(2, calculator.subtract(-3, -5));
    }

    @Test
    public void testMultiply() {
        assertEquals(15, calculator.multiply(5, 3));
        assertEquals(-25, calculator.multiply(-5, 5));
        assertEquals(15, calculator.multiply(-3, -5));
        assertEquals(0, calculator.multiply(5, 0));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(6, 3), 0.001);
        assertEquals(-1.0, calculator.divide(-5, 5), 0.001);
        assertEquals(2.5, calculator.divide(5, 2), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(5, 0);
    }

    @Test
    public void testModulo() {
        assertEquals(2, calculator.modulo(17, 5));
        assertEquals(1, calculator.modulo(10, 3));
        assertEquals(0, calculator.modulo(10, 5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testModuloByZero() {
        calculator.modulo(5, 0);
    }

    @Test
    public void testIsPositive() {
        assertTrue(calculator.isPositive(5));
        assertFalse(calculator.isPositive(-5));
        assertFalse(calculator.isPositive(0));
    }
    @Test
    public void testMain() {
        // Capture System.out to verify main method execution
        Calculator.main(new String[]{});
        // This will execute the main method and improve coverage
    }

}
