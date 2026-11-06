package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EvenOddTest {

    @Test
    void evenNumberReturnsTrue() {
        assertTrue(EvenOdd.isEven(4));
    }

    @Test
    void oddNumberReturnsFalse() {
        assertFalse(EvenOdd.isEven(7));
    }

    @Test
    void zeroIsEven() {
        assertTrue(EvenOdd.isEven(0));
    }

    @Test
    void negativeOddNumber() {
        assertFalse(EvenOdd.isEven(-3));
    }

    @Test
    void checkReturnsCorrectText() {
        assertEquals("Even", EvenOdd.check(10));
        assertEquals("Odd", EvenOdd.check(11));
    }
}
