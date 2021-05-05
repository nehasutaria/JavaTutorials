package com.leetCode;

import java.util.Deque;
import java.util.LinkedList;

public class BalanceBracket {
    public static void main(String[] args){
        String str = "Neha";
        String str1 = "{([])}";
        String str2 ="{(})[]";
        //System.out.println(checkBracket(str2));
        System.out.println(chkBracket(str2));
    }
    public static Boolean checkBracket(String str){
        Deque<Character> deque = new LinkedList<>();
        for(Character ch : str.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='[')
                deque.addFirst(ch);
            else {
                if(!(deque.isEmpty()) && ((deque.peekFirst() == '(' && ch ==')') ||
                            (deque.peekFirst() == '{' && ch =='}')||
                            (deque.peekFirst() == '[' && ch ==']')
                    )){
                    deque.removeFirst();
                }else
                    return false;
            }
        }
        return true;
    }
    public static Boolean chkBracket(String str){
       if(str == null || (str.length() %2 !=0))
           return false;
       else {
           for(char c : str.toCharArray()){
               if(!(c=='(' || c==')' || c=='{' || c=='}' || c=='[' || c==']'))
                   return false;
           }
       }
       while (str.contains("()") || str.contains("{}") || str.contains("[]")){
           str = str.replaceAll("\\(\\)", "")
                   .replaceAll("\\{\\}", "")
                   .replaceAll("\\[\\]", "");
       }
       return (str.length()==0);

    }
}
