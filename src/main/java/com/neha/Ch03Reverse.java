package com.neha;

public class Ch03Reverse {
    public static void main(String args[]){

        System.out.println("Reverse Number "  +  reverseNumber(123456789));
    }
    public static long reverseNumber(int n){
        long reverse = 0;
        while(n>0){
            reverse = reverse * 10 + (n %10);
            n  = n/10;
            if (reverse >= Integer.MAX_VALUE || reverse <= Integer.MIN_VALUE)
                return 0;
        }
        return reverse;
    }
}
