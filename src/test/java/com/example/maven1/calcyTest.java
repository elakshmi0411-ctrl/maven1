
package com.example.maven1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class calcyTest {

    calcy c = new calcy();

    @Test
    public void testAdd() {
        assertEquals(15, c.add(10, 5));
    }

    @Test
    public void testSubtract() {
        assertEquals(5, c.subtract(10, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals(50, c.multiply(10, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2, c.divide(10, 5));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            c.divide(10, 0);
        });
    }

    @Test
    public void testNegativeNumbers() {
        assertEquals(-5, c.add(-10, 5));
        assertEquals(-15, c.subtract(-10, 5));
        assertEquals(-50, c.multiply(-10, 5));
        assertEquals(-2, c.divide(-10, 5));
    }

    @Test
    public void testZero() {
        assertEquals(0, c.add(0, 0));
        assertEquals(0, c.subtract(0, 0));
        assertEquals(0, c.multiply(0, 10));
    }

    @Test
    public void testBoundaryValues() {
        assertEquals(Integer.MIN_VALUE,
                c.add(Integer.MAX_VALUE, 1));

        assertEquals(Integer.MAX_VALUE,
                c.subtract(Integer.MIN_VALUE, 1));
    }
}
