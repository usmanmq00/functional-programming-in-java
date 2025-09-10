package com.approach.traditional;

import java.util.Arrays;
import java.util.List;

public class TraditionalProgramming {
    public static void main(String[] args) {
//        printAllNumberInList(Arrays.asList(1,2,3,4,5,6,7,8));
//        printEvenNumbersInList(Arrays.asList(1,2,3,4,5,6,7,8));
        int sum = printSumOfAllElementsInList(Arrays.asList(1,2,3,4,5,6,7,8));
        System.out.println("Sum is : " + sum);
    }

    private static int printSumOfAllElementsInList(List<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum += number;
        }

        return sum;
    }

    // Print Each Item in List
    private static void printAllNumberInList(List<Integer> list) {
        for (Integer item : list) {
            System.out.println(item);
        }
    }

    // print Even Numbers in List
    private static void printEvenNumbersInList(List<Integer> list) {
        for (int number : list) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

}
