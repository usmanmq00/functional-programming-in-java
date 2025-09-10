package com.stream.types;

import java.util.*;

public class StreamTypes {
    public static void main(String[] args) {
        printStreamFromCollectionsList(List.of(1,2,3,4,5));
        printStreamFromCollectionsSet();
        printStreamFromColleactionsMap();
    }

    private static void printStreamFromColleactionsMap() {
        Map<String, Integer> numbers = Map.of("One",1, "Two", 2, "Three", 3);
        // Get keys
        numbers.keySet().stream().forEach(System.out::println);
        // Get values
        numbers.values().stream().forEach(System.out::println);
        // get key value
        numbers.entrySet().stream().forEach(System.out::println);
    }

    private static void printStreamFromCollectionsSet() {
        Set<Integer> numbers = Set.of(1,2,3,4,5);
        numbers.stream().forEach(System.out::println);
    }

    private static void printStreamFromCollectionsList(List<Integer> numbers) {
        numbers.stream()
                .forEach(System.out::println);
    }

}
