package com.leetCode;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args){
        int[] numbers = new int[]{1,2,3,4,5};
        int[] dupNum = new int[] {1,2,3,1};

        //System.out.println(checkDuplicate(numbers));
        //System.out.println(checkDuplicate(dupNum));

    }
    public static boolean checkDuplicate(int[] numbers){
        HashSet<Integer> numSet = new HashSet<>();
        for(int i=0; i<numbers.length; i++){
            if(numSet.contains(numbers[i]))
                return true;
            else
                numSet.add(numbers[i]);

        }
        return false;
    }
    public static boolean checkDup(int[] numbers){
        Arrays.sort(numbers);
        for(int i=0; i<numbers.length;i++){
            if(numbers[i] == numbers[i+1])
                return true ;

        }
        return false;
    }

}
