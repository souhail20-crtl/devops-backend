package tn.esprit.devops.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void testAdd() {
        assertEquals(6, calculatorService.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(1, calculatorService.subtract(3, 2));
    }

    @Test
    void testMultiply() {
        assertEquals(6, calculatorService.multiply(2, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, calculatorService.divide(6, 3));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(1, 0));
    }
}
