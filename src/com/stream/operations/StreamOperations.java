package com.stream.operations;

import java.util.List;

public class StreamOperations {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8);
        numbers.stream()
                .filter(number -> number % 2 == 0)   // Expects a Predicate
                .map(number -> number*number)    // Expects a Function
                .forEach(System.out::println);   // Expects a Consumer
    }
}
