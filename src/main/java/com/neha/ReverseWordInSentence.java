package com.neha;

public class ReverseWordInSentence {
    public static void main(String args[]){
        String str = "Java is best programming language";
        System.out.println(revWord(str) );
    }
    public static String revWord(String str){
        int l = str.length();
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i= words.length-1; i>=0; i--){
           sb.append(words[i] ).append(" ");
        }
        return sb.toString();
    }
}
