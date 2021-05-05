package com.javaEight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedList {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(33,35,67,23,12,4,8,9,36,99);
        List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
        List<Integer> reverseList = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Original List:");
        for (Integer i:numbers) {
            System.out.print(i + " ");
        }
        System.out.println("\nSorted List:");
        for (Integer i:sortedNumbers) {
            System.out.print(i + " ");
        }
        System.out.println("\nReversed Sorted List:");
        for (Integer i:reverseList) {
            System.out.print(i + " ");
        }
    }
}
