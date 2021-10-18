package com.accenture;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzTest {


    @Test
    public void whenFizzbuzzIsInvokedWith1_thenResultShouldBe1String() {

        assertEquals("1", Fizzbuzz.fizzbuzz(1));

    }

    @Test
    public void whenFizzbuzzIsInvokedWith2_thenResultShouldBe2String() {

        assertEquals("2", Fizzbuzz.fizzbuzz(2));

    }

    @Test
    public void whenFizzbuzzIsInvokedWithMultipleOf3_thenResultShouldBeFizzString() {

        assertEquals(Fizzbuzz.fizzbuzz(3), "Fizz");

    }

    @Test
    public void monBuzzTest() {

        assertEquals(Fizzbuzz.fizzbuzz(5), "Buzz");

    }

    @Test
    public void monFizzBuzzTest() {

        assertEquals(Fizzbuzz.fizzbuzz(15), "FizzBuzz");

    }
}
