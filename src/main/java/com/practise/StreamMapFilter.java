package com.practise;

import java.util.Arrays;
import java.util.List;
import java.lang.String;

import java.util.stream.Collectors;




public class StreamMapFilter {
    public static void main(String[] args){
        List<String> numbers = Arrays.asList("1","2","3","4", "5","6","7","8","10");
        List<String> strings = Arrays.asList("Neha", "Anmol","riya","ullas");
        List<String> upperStr = strings.stream()
                .map(String :: toUpperCase).collect(Collectors.toList());
        System.out.println("Uppercase string : "+ upperStr);
        strings.stream()
                .map(String :: toLowerCase).forEach(System.out :: println);


        List<Integer> even  = numbers.stream()
                .map(s -> Integer.valueOf(s))
                .filter(i -> (i%2 ==0))
                .collect(Collectors.toList());
        List<Integer> sqrNumbers = even.stream()
                .map(i-> i*i)
                .filter(i -> i<50)
                .collect(Collectors.toList());

                System.out.println("Original list : " + numbers);
        System.out.println("Even numbers in list: " + even);
        System.out.println("Square numbes: " + sqrNumbers);
    }
}
