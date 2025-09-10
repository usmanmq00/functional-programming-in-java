package com.approach.functional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class FunctionalProgramming {
    public static void main(String[] args) {
//        printAllNumbersInList(Arrays.asList(1,2,3,4,5,6,7,8));
//        printEvenNumbersInList(Arrays.asList(1,2,3,4,5,6,7,8));
//        printOddNumbersInList(Arrays.asList(1,2,3,4,5,6,7,8));
//        printAllCourses(List.of("Spring", "Spring Boot", "AWS", "Docker", "Azure"));
//        printCoursesContainingSpring(List.of("Spring", "Spring Boot", "AWS", "Docker", "Azure"));
//        printCoursesHavingFourLetters(List.of("Spring", "Spring Boot", "AWS", "Docker", "Azure"));
//        printSquareOfEvenNumbers(Arrays.asList(1,2,3,4,5,6,7,8));
//        printCharactersInEachItemOfList(List.of("Spring", "Spring Boot", "AWS", "Docker", "Azure"));
//        printCoursesStartWithS(List.of("Spring", "Spring Boot", "AWS", "Docker", "Azure"));
        int sum = printSumOfAllElementsInList(Arrays.asList(1,2,3,4,5,6,7,8));
        System.out.println("Sum is : " + sum);

        Optional<String> fruit = Optional.of("Orange");
        Optional<String> empty = Optional.empty();

//        System.out.println("Value of Fruit is : " + fruit.get() + " and Value of Empty is : " + empty) ;
    }

    private static int printSumOfAllElementsInList(List<Integer> list) {
        return list.stream().reduce(0, Integer::sum);
    }

    private static void printCoursesStartWithS(List<String> courses) {
        Predicate<? super String> predicate = course -> course.startsWith("S");

        Optional<String> optional = courses.stream().filter(predicate).findFirst();

        System.out.println("Value of Optional Class : " + optional + " & is Empty : " +
                optional.isEmpty() + " & is Present : " + optional.isPresent() + " & Value is : " + optional.get());
    }

    private static void printCharactersInEachItemOfList(List<String> courses) {
        courses.stream()
                .map(String::length)
                .forEach(System.out::println);
    }

    private static void printSquareOfEvenNumbers(List<Integer> list) {
        list.stream()
                .filter(number -> number%2==0)
                .map(number -> number*number)   // Expects a Function Interface
                .forEach(System.out::println);
    }

    private static void printCoursesHavingFourLetters(List<String> courses) {
        courses.stream()
                .filter(course -> course.length() >= 4)
                .forEach(System.out::println);
    }

    private static void printCoursesContainingSpring(List<String> courses) {
        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);
    }

    private static void printAllCourses(List<String> courses) {
        courses.stream().
                forEach(System.out::println);
    }

    private static void printOddNumbersInList(List<Integer> list) {
        list.stream().
                filter(number -> number%2!=0).
                forEach(System.out::println);
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
