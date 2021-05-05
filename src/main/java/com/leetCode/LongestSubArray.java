package com.leetCode;

public class LongestSubArray {
    public static void main(String[] args){
        int[] result;
        result = findLongestSubArray(12, new int[]{1,2,3,7,0,0,0,5});
        System.out.println(result[0] + " " + result[1]);

    }
    public static int[] findLongestSubArray(int s, int a[]){
        int[] result = new int[]{-1};
        int sum =0;
        int left=0;
        int right=0;
        while (right < a.length){
            sum = sum + a[right];
            while(sum >s && left <right){
                sum -= a[left++];
            }
            if(sum == s && (result.length ==1 || result[1] - result[0] <right-left  ))
                result = new int[]{left+1, right+1};

            right++;
        }
        return result;
    }
}
