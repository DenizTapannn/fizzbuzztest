package io.deniz.course.fizzbuzztest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class testing {

    private FB fb;

    @BeforeEach
    void setUp() {
        fb = new FB();
    }

    @Test
    void returnfizz(){
         assertEquals("fizz", fb.stringFor(3));

    }
    @Test
    void returnbuzz(){
        assertEquals("buzz",fb.stringFor(5));
    }

    @Test
    void returnfizzbuzz(){
        assertEquals("fizzbuzz",fb.stringFor(15));
    }

    @Test
    void returnnumber(){
        assertEquals("7",fb.stringFor(7));
    }

    @Test
    void throwsIllegalArgumentExcepiton(){
        assertThrows(IllegalArgumentException.class, ()->fb.stringFor(-1));
        assertThrows(IllegalArgumentException.class, ()->fb.stringFor(101));
    }
}
