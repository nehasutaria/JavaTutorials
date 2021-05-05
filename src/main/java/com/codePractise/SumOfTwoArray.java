package com.codePractise;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwoArray {
    public static void main(String[] args){

        System.out.println(reverse("Neha Sutaria"));

    }
    public static String revStr(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static String reverse(String str){
        String rev = "";
        for(int i=str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        return rev;
    }
    public static int[] getTwoSum(int[] numbers, int target){
        Map<Integer, Integer> visitedNumbers = new HashMap<>();

        for(int i=0; i<numbers.length; i++){
            int delta = target - numbers[i];
            if(visitedNumbers.containsKey(delta)) {
                return new int[]{visitedNumbers.get(delta), i};
            }
            visitedNumbers.put(numbers[i], i);
        }
        return new int[]{-1,-1};
    }
}
