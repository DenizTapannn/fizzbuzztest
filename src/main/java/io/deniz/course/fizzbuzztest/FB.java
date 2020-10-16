package io.deniz.course.fizzbuzztest;

public class FB {
    public String stringFor(int number) {
        if(number<1 || number>100){
            throw new  IllegalArgumentException();
        }

        if(number%15==0){
            return "fizzbuzz";
        }

        if (number%3==0) {
            return "fizz";
        }
        if (number%5==0) {
            return "buzz";
        }

        return String.valueOf(number);
    }
}
