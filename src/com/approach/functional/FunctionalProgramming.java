package com.approach.functional;

import java.util.Arrays;
import java.util.List;

public class FunctionalProgramming {
    public static void main(String[] args) {
//        printAllNumbersInList(Arrays.asList(1,2,3,4,5,6,7,8));
        printEvenNumbersInList(Arrays.asList(1,2,3,4,5,6,7,8));
    }

    private static void printEvenNumbersInList(List<Integer> list) {
        list.stream().
                filter(number -> number%2==0).    // Expects a Predicate
                forEach(System.out::println);  // Expects a Consumer
    }

    private static void printAllNumbersInList(List<Integer> list) {
        list.stream().forEach(System.out::println);   // System.out has a static method println
    }

}
