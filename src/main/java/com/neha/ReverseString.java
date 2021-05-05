package com.neha;
import org.apache.commons.lang3.StringUtils;

public class ReverseString {
    public static void main(String[] args) {

       // System.out.println(RevStringBuffer("Neha"));
        //System.out.println(RevStr("Neha"));
        //System.out.println(countOccurance("Java", "a"));
        //System.out.println(countOccurance("Java Java is a Programming Java java Lang Java", "Java"));
        System.out.println(replaceWithChar("Hello  World "));
    }

    public static String RevStringBuffer(String str) {
        String revStr = new StringBuffer(str).reverse().toString();
        return revStr;
    }

    public static String RevStr(String str) {
        StringBuilder rev = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }
        return rev.toString();
    }

    public static int countOccurance(String str, String matchStr) {
        return StringUtils.countMatches(str, matchStr);
    }
    public static String replaceWithChar(String str){ //replace space " "  to  "%20" in any string
        char[] charStr = str.toCharArray();
        StringBuilder newStr = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(charStr[i] == ' '  )
                newStr.append("%20");
            else
                newStr.append(charStr[i]);
        }
        return newStr.toString();
    }

}
