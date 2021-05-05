package com.neha;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Person> people  = Arrays.asList(new Person("Neha", "CParmar",40),
        new Person("Ullas", "BSutaria", 42),
        new Person("Seema", "Anawadiya", 35));

        /*for(Person p : people){  //conventional way printing
            System.out.println(p);
        }
        people.forEach(person -> System.out.println(person)); //lamada expression
        people.forEach(System.out :: println); //Method reference */

        //sort element based on last name
       /* Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        }); */
        //Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
        Collections.sort(people, Comparator.comparing(Person::getLastName));
        people.forEach(System.out :: println);
        Collections.sort(people, Comparator.comparing(Person::getFirstName));
        people.forEach(System.out :: println);

        int sum = Arrays.stream(new int[]{1, 2, 3})
                .filter(i -> i >= 2)
                .map(i -> i * 3)
                .sum();
        System.out.println(sum);



    }
}
