package com.training;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void shouldReturnBaseValue() {
        //Given
        Calculator calc = new Calculator(3);
        //When
        int result = calc.getValue();
        //Then
        assertEquals(3, result);
    }

    @Test
    public void shouldAddReturnValue() {
        //Given
        Calculator calc = new Calculator(3);
        //When
        int result = calc.add(10).getValue();
        //Then
        assertEquals(13, result);
    }

    @Test
    public void shouldMinusReturnValue() {
        //Given
        Calculator calc = new Calculator(3);
        //When
        int result = calc.minus(10).getValue();
        //Then
        assertEquals(-7, result);
    }

    @Test
    public void shouldSqrtReturnValue() {
        //Given
        Calculator calc = new Calculator(9);
        //When
        int result = calc.sqrt().getValue();
        //Then
        assertEquals(3, result);
    }

    @Test
    public void shouldTimesReturnValue() {
        //Given
        Calculator calc = new Calculator(3);
        //When
        int result = calc.times(10).getValue();
        //Then
        assertEquals(30, result);
    }

    @Test
    public void shouldDivideReturnValue() {
        //Given
        Calculator calc = new Calculator(10);
        //When
        int result = calc.divide(2).getValue();
        //Then
        assertEquals(5, result);
    }

    @Test
    public void shouldModuloReturnValue() {
        //Given
        Calculator calc = new Calculator(10);
        //When
        int result = calc.modulo(5).getValue();
        //Then
        assertEquals(0, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldDivideReturnError() {
        //Given
        Calculator calc = new Calculator(3);
        //When
        calc.divide(0);
        //Then
        // Throw exception
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldSqrtReturnError() {
        //Given
        Calculator calc = new Calculator(-3);
        //When
        calc.sqrt();
        //Then
        // Throw error
    }

    @Test
    public void shouldMultiple() {
        //Given
        Calculator calc = new Calculator(3);
        //When
        int result = calc.add(4).minus(3).times(6).getValue();
        //Then
        assertEquals(24, result);
    }
}
