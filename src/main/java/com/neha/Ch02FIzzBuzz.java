package com.neha;

public class Ch02FIzzBuzz {
    public static void main(String[] args){
        printNumbers(10);
    }
    public static void printNumbers(int numbers){
        for(int i=0; i<numbers;i++){
            if((i % 3 ==0) && (i%5 == 0))
                System.out.println(("FizzBuzz"));
            else if(i %3 == 0)
                System.out.println("Fizz");
            else if(i %5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
}
