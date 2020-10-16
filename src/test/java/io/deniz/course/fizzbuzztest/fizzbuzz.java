package io.deniz.course.fizzbuzztest;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class fizzbuzz {

    @Test
    void returnfizz(){
        FizzBuzz fizzBuzz=new FizzBuzz();
        assertEquals(FizzBuzz.stringFor(3), "fizz");
    }

}
