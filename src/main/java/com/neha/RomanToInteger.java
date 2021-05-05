package com.neha;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String args[]){

        String romanNumber  = "MCMIV";
        //System.out.println(romanToInteger(romanNumber));
        System.out.println(integerToRoman(3215));

    }
    public static int romanToInteger(String s){
        int result = 0;
        Map<Character, Integer> map  = new HashMap<>();
        map.put('I', 1);
        map.put('V',5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D',500);
        map.put('M', 1000);
        for(int i=0; i<s.length(); i++){

            if(i > 0 && map.get(s.charAt(i))>map.get(s.charAt(i-1))){
                result += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i-1));
            }else
            result +=  map.get(s.charAt(i));
        }
        return result;

    }
    public static String integerToRoman(int n){
        String[] units  = new String[]{"", "I","II","III", "IV", "V","VI","VII","VIII","IX","X"};
        String[] tens  = new String[]{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC","C"};
        String[] hundreds =  new String[] {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] thousands = new String[] { "","M","MM","MMM"};

        return thousands[n/1000] + hundreds[(n%1000)/100] + tens[(n%100)/10] + units[(n%10)];
    }
}
