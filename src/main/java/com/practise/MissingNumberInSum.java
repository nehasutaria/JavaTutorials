//Given an array of non-duplicating numbers from 1 to n where one number is missing,
// write an efficient java program to find that missing number
package com.practise;

public class MissingNumberInSum {
    public static void main(String[] args){

        int[] array={4,3,8,7,1,2,6};
        System.out.println("Missing Number: " + findMissingNum(array));
    }
    public static int findMissingNum(int[] nums){
        int n = nums.length +1;
        int actualSum = n*(n+1)/2;
        int arraySum=0;
        for(int i=0; i<nums.length; i++)
            arraySum +=  nums[i];
        return actualSum - arraySum;
    }
}
