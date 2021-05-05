package com.practise;

import java.util.stream.IntStream;

public class Prime {
    public static void main(String[] args){
        checkPrime1(4);
    }
    public static boolean checkPrime1(int n){
        if(n < 2)
            return false;
        if(IntStream.range(2,n/2).noneMatch(t -> n %t == 0))
            return true;
        else
            return false;
    }
    public static boolean checkPrime(int n){
        if(n <=1)
            return false;
        for(int i=2; i<n/2; i++){
          if(n % i == 0)
              return false;
      }
      return true;
    }
    public static void primeSeries(int n){
        for(int i=1; i<=n; i++){
            if(checkPrime(i))
                System.out.print(i + " ");
        }
    }
    public static void primeSeries1(int n){
        String primeNumbers = "";
        for(int i=1; i<n; i++){
            int count=0;
            for(int j=i; j>=1; j--){
                if(i % j == 0)
                    count++;
            }
            if(count==2)
              //  System.out.print(i + " ");
                primeNumbers = primeNumbers + i + " ";
        }
        System.out.println(primeNumbers);
    }

}
