package com.neha;

public class PowerOfFour {
    public static void main(String[] args){
        if(isPowerOfFour(65))
            System.out.println("Number is POWER of four");
        else
            System.out.println("Number is not power of four");

    }
    public static boolean isPowerOfFour(int num){
        if(num == 0) return false;
        while (num != 1){
            if(num %4 != 0) return false;
            num = num/4;
        }
        return true;
    }
    public static boolean isPwrOfFour(int n){
        return Math.log(n)/Math.log(4) % 1 == 0;
    }
}
