package edu.java8.poc;

import java.util.stream.IntStream;

public class FunctionalProg1 {

    public static void main(String[] args) {

       int sum = calcSum(1, 10);
        System.out.println("Sum ="+ sum);
    }

    public static int calcSum(int start, int end) {

        return IntStream.rangeClosed(start, end)
                .peek(n -> System.out.println("original element : " +n))
                .sum();
    }
}
