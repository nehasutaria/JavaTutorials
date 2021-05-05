package com.practise;

public class FibbonancySeries {
    public static void main (String[] args){
    //Fibbonancy(10);
        for(int i =1; i<10;i++){
           //System.out.print(FibboRec(i) + " ");
           System.out.print(Fibbo(i) + " ");
        }

    }

    public static int FibboRec(int n) {
        if (n == 1 || n == 2)
            return 1;
        return FibboRec(n - 1) + FibboRec(n - 2);
    }
    public static int Fibbo(int n){
        if(n ==1 || n==2)
            return 1;
        int f1=1, f2=1, f3=1;
        for(int i=3; i<=n; i++){
            f3=f1 +f2;
            f1=f2;
            f2=f3;
        }
        return f3;
    }
    public static void Fibbonancy(int n){
        int f1=0, f2=1;
        System.out.print(f1 + " " + f2 + " ");
        for ( int i=0; i<=n; i++){
            int f3 = f1+f2;
            f1 = f2;
            f2 = f3;
            System.out.print(f3 + " ");
        }
    }

}
