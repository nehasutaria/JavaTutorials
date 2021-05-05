package com.neha;

// find out index position in array which return th expected target result, e.g given array {2,4,6,3,8} and target is 7 so we need
// to return index position (1, 3)

import java.util.HashMap;
import java.util.Map;

public class Ch01TwoSum {
    public static void main(String[] args){
        int[] numbers = new int[] { 2,4,6,3,1,8};
        int target = 9;
       int[] result  = getTwosum(numbers, target);
        //int[] result  = getTwoSum(numbers, target);
        System.out.println(result[0] + "," + result[1]);
    }
    public static int[] getTwosum(int[] numbers, int target){
        Map<Integer, Integer> visitedNumbers = new HashMap<>();
        for (int i=0; i<numbers.length; i++){
            int delta = target - numbers[i];
            if(visitedNumbers.containsKey(delta)) {
                return new int[]{i, visitedNumbers.get(delta)};
            }
            visitedNumbers.put(numbers[i], i);
        }
        return new int[] {-1, -1};
    }
    public static int[] getTwoSum(int[] numbers, int target){
        int a_ptr = 0;
        int b_ptr = numbers.length -1;

        while(a_ptr <= b_ptr){
            int sum = numbers[a_ptr] + numbers[b_ptr];
            if(sum < target){
                b_ptr -=1;
            }else if(sum >target){
                a_ptr +=1;
            }else {
                return new int[]{a_ptr+1, b_ptr+1};
            }
        }
        return new int[]{a_ptr+1, b_ptr+1};
    }
}
