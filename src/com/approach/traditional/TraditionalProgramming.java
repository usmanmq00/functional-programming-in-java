package com.approach.traditional;

import java.util.Arrays;
import java.util.List;

public class TraditionalProgramming {
    public static void main(String[] args) {
        printAllNumberInList(Arrays.asList(1,2,3,4,5,6,7,8));
    }

    // Print Each Item in List
    private static void printAllNumberInList(List<Integer> list) {
        for (Integer item : list) {
            System.out.println(item);
        }
    }
}
