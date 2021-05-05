package com.neha;

public class BinarySearch {
    public static void main(String[] args){
        int[] a  = new int[] {2,4,6,8,9,10, 12, 24, 34, 55};
        //int result = binarySearch(a, 4);
        int result = binaryRec(a, 12, 0, a.length-1);
        if(result == -1)
            System.out.println("Number not exist");
        else
            System.out.println("Number position "  + result);
    }
    public static int binaryRec(int[] a, int num, int l, int r){

        if(l<=r){
            int m = l + (r - l)/2;
            if(num == a[m])
                return m;
            if(num > a[m])
                return  binaryRec(a,num, m+1, r);
            else
                return  binaryRec(a,num,l,m-1);

        }
        return -1;

    }
    public static int binarySearch(int[] a, int num){
        int l=0;
        int r=a.length -1;
        while(l<r){
            int m = l + (r - l )/2;
            if(num == a[m])
                return m;
            if(num > a[m])
                l = m+1;
            else
                r = m-1;
        }
        return -1;
    }

}
