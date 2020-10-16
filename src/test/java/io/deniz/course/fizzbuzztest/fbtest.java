package io.deniz.course.fizzbuzztest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class fbtest {

    private FizzBuzzT fb;

    @BeforeEach
    void setUp() {
        fb = new FizzBuzzT();
    }

    @Test
    void returnFizzifthree(){

        assertEquals("Fizz", fb.stringFor(3));
    }
    @Test
    void returnBuzziffive(){
        assertEquals("Buzz",fb.stringFor(5));
    }

    @Test
    void returnFizzBuzz(){
        assertEquals("FizzBuzz",fb.stringFor(15));
    }

    @Test
    void returnNumber(){
        assertEquals("7",fb.stringFor(7));
    }

    @Test
    void returnIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class,()->fb.stringFor(-1));
        assertThrows(IllegalArgumentException.class,()->fb.stringFor(101));

    }
}
