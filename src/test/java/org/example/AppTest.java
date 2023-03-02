package org.example;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    Calculator calculator;

    @Before
    public void setupEachTest() {
        // run before each test
        calculator = new Calculator();
    }

    @Test
    public void divisionPositive()
    {
        double result = calculator.divide(3.5, 0.5);
        assertEquals(7.0, result, 0001);
    }

    @Test
    public void divisionOneNegative()
    {
        double result = calculator.divide(-2.0, 4.0);
        assertEquals(-0.5, result, 0001);
    }

    @Test
    public void divisionBothNegative()
    {
        double result = calculator.divide(-78.5, -5.0);
        assertEquals(15.7, result, 0001);
    }

    @Test
    public void divisionSameNum()
    {
        double result = calculator.divide(12.3, 12.3);
        assertEquals(1, result, 0001);
    }

    @Test
    public void multiplyPositive()
    {
        double result = calculator.multiply(8.5, 2.0);
        assertEquals(17.0, result, 0001);
    }

    @Test
    public void multiplyOneNegative()
    {
        double result = calculator.multiply(-12.3, 5.0);
        assertEquals(-61.5, result, 0001);
    }

    @Test
    public void multiplyBothNegative()
    {
        double result = calculator.multiply(-536.8, 2.0);
        assertEquals(-1073.6, result, 0001);
    }

    @Test
    public void multiplyByZero()
    {
        double result = calculator.multiply(18.8, 0.0);
        assertEquals(0.0, result, 0001);
    }

}
