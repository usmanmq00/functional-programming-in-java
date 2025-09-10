package com.stream.types;

import java.util.*;
import java.util.stream.Stream;

public class StreamTypes {
    public static void main(String[] args) {
        // Collections
//        printStreamFromCollectionsList(List.of(1,2,3,4,5));
//        printStreamFromCollectionsSet();
//        printStreamFromColleactionsMap();

        // Stream.of()
//        printStreamFromStreamOf(Stream.of("Apple", "Banana", "Cherry"));

        // Array.stream()
//        printStreamFromPrimitiveArray();

        // Stream.builder()
//        printStreamBuildManually();

        // Stream.generate()
        printStreamFromGenerate();

    }

    private static void printStreamFromGenerate() {
        Stream.generate(Math::random).limit(5).forEach(System.out::println);  // Expects a Supplier Interface
    }

    private static void printStreamBuildManually() {
        Stream.Builder<String> fruits = Stream.builder();
        fruits.add("Apple").add("Banana").add("Cherry");
        Stream<String> stream = fruits.build();
        stream.forEach(System.out::println);
    }

    private static void printStreamFromPrimitiveArray() {
        int[] numbers = {1,2,3,4,5};
        Arrays.stream(numbers).forEach(System.out::println);
    }

    private static void printStreamFromStreamOf(Stream<String> fruits) {
        fruits.forEach(System.out::println);
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
