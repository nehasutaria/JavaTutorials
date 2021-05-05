package com.javaEight;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] arg) {

       /* Predicate<Integer> pre1 = i -> i > 100;
        Predicate<Integer> pre2 = i -> i < 300;
        Predicate<Integer> preAnd = pre1.and(pre2);
        Predicate<Integer> preOr = pre1.or(pre2);
        System.out.println(preAnd.test(200));
        System.out.println(preOr.test(600));
*/
        Predicate<String> preStr = Predicate.isEqual("Neha");
        System.out.println(preStr.test("neha"));

    }
}
