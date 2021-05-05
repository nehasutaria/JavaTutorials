package com.practise;

public class Factorial {
    public static void main(String[] args){
        System.out.println(fact(5));
        System.out.println(factRec(5));

    }
    public static int fact(int n){
        int res=1;
        if(n<1)
            return 0;
        for(int i=n; i>=1;i--)
            res = res * i;
        return res;
    }
    public static int factRec(int n){
        if(n<=0)
            return 1;
        return n* factRec(n-1);
    }
}
