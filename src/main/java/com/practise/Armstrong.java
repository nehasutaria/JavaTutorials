package com.practise;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        System.out.println("Enter any number");
        int num = new Scanner(System.in).nextInt();
        if(num == armstrong(num))
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstron");

    }
    public static int armstrong(int n){
        int result=0;
        while (n>0){
            int rem = n%10;
            result = result + (rem * rem *rem);
            n=n/10;
        }
        return result;
    }
}
