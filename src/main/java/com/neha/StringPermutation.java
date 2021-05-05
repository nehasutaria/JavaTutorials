/* Start off with just the last element (c) in a set (["c"]), then add the second last element (b) to its front, end and every possible positions in the middle, making it ["bc", "cb"] and then in the same manner it will add the next element from the back (a) to each string in the set making it:

        "a" + "bc" = ["abc", "bac", "bca"]  and  "a" + "cb" = ["acb" ,"cab", "cba"] */
package com.neha;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StringPermutation {
    static Set<String> permutations;
    static Set<String> result = new HashSet<String>();
    public static void main(String[] args){
        Set<String> resultSet = permutation("abc");
        Iterator<String> it = resultSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
    public static Set<String> permutation(String str){
        permutations = new HashSet<String>();
        int len = str.length();
        for(int i=len-1; i>=0; i--){
            shuffle(str.charAt(i));
        }
        return permutations;
    }
    public static void shuffle(char c){
        if(permutations.size()==0)
            permutations.add(String.valueOf(c));
        else {
            Iterator<String> it = permutations.iterator();
            for(int i=0; i<permutations.size(); i++){
                String temp;
                while (it.hasNext()){
                    temp = it.next();
                    for(int k=0; k<temp.length() +1; k++){
                        StringBuilder sb =  new StringBuilder(temp);
                        sb.insert(k,c);
                        result.add(sb.toString());
                    }
                }
            }
            permutations = result;
            result = new HashSet<String>();
        }
    }
}
