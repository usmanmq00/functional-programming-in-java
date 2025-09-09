package com.approach.functional;

import java.util.Arrays;
import java.util.List;

public class FunctionalProgramming {
    public static void main(String[] args) {
        printAllNumbersInList(Arrays.asList(1,2,3,4,5,6,7,8));
    }

    private static void printAllNumbersInList(List<Integer> list) {
        list.stream().forEach(System.out::println);   // System.out has a static method println
    }

}
