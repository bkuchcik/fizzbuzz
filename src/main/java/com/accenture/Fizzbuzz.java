package com.accenture;

public class Fizzbuzz {

    public static String fizzbuzz(int nb) {

        if (nb % 3 == 0 && nb % 5 == 0) {
            return "FizzBuzz";
        }
        if (nb % 3 == 0) {
            return "Fizz";
        }
        if (nb % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(nb);
        }

    }
}
