package com.codePractise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exercises {
    public static <T> void main(String args[]){
        //System.out.println(sum(4,6));
        //System.out.println(fact(4));
        //Operation resSum  = (a, b) -> a +b ;
        //System.out.println(resSum.perform(5,6));
        //getStringLen(s -> s.length());
       // Integer[] numbers  = {10,20,30,40, 5,6,3,9};
      //  System.out.println(maximum(numbers));
        //System.out.println(search(10,numbers));
        //System.out.println(reverse("Hello World"));
        List<Integer> list  = Arrays.asList(5,10,10,7);
        Comparator<? super T> comparator = null;
        System.out.println(list.stream().max(Integer::compare).get());
        System.out.println(average(list));

    }
    public static Double average(List<Integer> list) {
      /*  Double  add=0.0;
        for(Integer i : list)
             add = add + i;
        return add/list.size();*/
        return list.stream().mapToInt(i ->i).average().getAsDouble();
    }

    public static Integer maximum(Integer[] list) {
        Integer max=list[0];
        for (int i = 1; i < list.length; i++){
            if(list[i] > max)
                max = list[i];
        }
        return max;
    }

    public static String reverse(String s){
        String reverse = "";
        for(int i=s.length()-1; i>=0;i--)
            reverse = reverse + s.charAt(i);
        return reverse;
    }
    public static void getStringLen(StringLen s){
       System.out.println(s.getLength("Hello"));
    }

    public static Integer sum(Integer i, Integer j) {
        return i+ j;
    }
    public static Integer fact(Integer num){
        int result = num;
        for (int i = num-1; i>0; i--){
           result  = result * i;
        }
        return result;
    }
    public static int search(Integer n, Integer[] list) {
        int pos = -1;
        for(int i=0; i<list.length; i++){
            if(list[i].equals(n)){
                pos = i;
                break;
            }
        }
        return pos;
    }
}
