package edu.java8.poc;

import java.util.List;

public class FunctionalProg {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

          System.out.println("Print All numbers ::");
        printAllNum(numbers);
           System.out.println("Print Even numbers ::");
        printEvenNumbers(numbers);
            System.out.println("Print Square of Even numbers ::");
        printSquaresOfEvenNum(numbers);
    }


    private static void printAllNum(List<Integer> numbers) {

        numbers.stream().forEach(System.out::println);// Method Reference
    }

    // number -> number%2 == 0
    private static void printEvenNumbers(List<Integer> numbers) {

        numbers.stream() // Convert to Stream
                .filter(number -> number % 2 == 0) // Lamdba Expression
                .forEach(System.out::println);// Method Reference

        // .filter(FP01Functional::isEven)//Filter - Only Allow Even Numbers
    }

    private static void printSquaresOfEvenNum(List<Integer> numbers) {
        numbers.stream()    // Convert to Stream
                .filter(number -> number % 2 == 0) // Lamdba Expression
                            //mapping - x -> x * x
                .map(number -> number * number)
                .forEach(System.out::println);
    }
}
