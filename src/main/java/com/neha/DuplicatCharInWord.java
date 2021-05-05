package com.neha;

import java.util.*;



public class DuplicatCharInWord {
    public static void main(String[] args){

        String str = "NehaSutariaN";
       // System.out.println("Non Repeated first char in string " + firstNonRepeatedCharInString(str));
        //System.out.println("Duplicate char in string " + str + " ");
        System.out.println(nonRepeatChar(str));
        //System.out.println(firstNonRepeatChar(str));
        //duplicateChar(str);
    }
    public static char nonRepeatChar(String str){
        for(int i=0; i<str.length(); i++){
            if(str.indexOf(str.charAt(i) ) == str.lastIndexOf(str.charAt(i)) )
                return str.charAt(i);
        }
        return '-';
    }
    public static void duplicateChar(String str){
        char[] characters = str.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();
        for(Character ch : characters){
            if(charMap.containsKey(ch))
                charMap.put(ch,charMap.get(ch)+1);
            else
                charMap.put(ch, 1);
        }
        Set<Map.Entry<Character, Integer>> charSet = charMap.entrySet();
        System.out.println("Original String " + str);
        for(Map.Entry<Character, Integer> entry : charSet){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
    public static char firstNonRepeatedCharInString(String str){
        Map<Character, Integer> charMap = new LinkedHashMap<>(str.length());
        for(char c : str.toCharArray()){
            if(charMap.containsKey(c))
                charMap.put(c,charMap.get(c) +1);
            else
                charMap.put(c,1);
        }
        for(Map.Entry<Character, Integer> entry : charMap.entrySet()){
            if(entry.getValue() == 1)
                return entry.getKey();
        }
        throw new RuntimeException("Didn't find any Nonrepeated character");
    }
    public static char firstNonRepeatChar(String str){
        Set<Character> repeate = new HashSet<>();
        List<Character> nonRepeat = new ArrayList<>();

        for(int i=0; i<str.length(); i++){
            if(repeate.contains(str.charAt(i)))
                continue;
            if(nonRepeat.contains(str.charAt(i))) {
                nonRepeat.remove(str.charAt(i));
                repeate.add(str.charAt(i));
            }else {
              nonRepeat.add(str.charAt(i));
            }
        }
        return nonRepeat.get(0);
    }
}
