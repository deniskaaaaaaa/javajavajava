package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task2Test {
    
    @Test
    public void testCountDigitsWithZero() {
        int result = Task2.countDigits(0);
        assertEquals(1, result);
    }

    @Test
    public void testCountDigitsWithPositiveNumber() {
        int result = Task2.countDigits(12345);
        assertEquals(5, result);
    }

    @Test
    public void testCountDigitsWithNegativeNumber() {
        int result = Task2.countDigits(-9876);
        assertEquals(4, result);
    }
}
