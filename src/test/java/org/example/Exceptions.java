package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.locks.Condition;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Exceptions {

    @Test
    public void testException() {
        assertThrows(ArithmeticException.class, () -> {
            divideTwoNumbers(10, 0);
        });

    }

    @Test
    public void testNoException() {
        assertEquals(9, divideTwoNumbers(18, 2));
    }

    private int divideTwoNumbers(int dividend, int divisor) {
        return dividend / divisor;
    }



//EX.3
    @Test
    public void positiveTest() {
        int[] array = {1, 2, 3, 4, 5};
        int element = array[2];
        Assertions.assertEquals(element, 3);
    }

    @Test
    public void negativeTest() {
        int[] array = {1, 2, 3, 4, 5};
        try {
            int element = array[7];
            Assertions.fail("Expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            Assertions.assertEquals("Index 7 out of bounds for length 5", e.getMessage());
        }
    }
}








