package com.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Employee implements Comparable<Employee>{
    int age;
    String name;
    int salary;

    public Employee(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
    @Override
    public int compareTo(Employee o) {
        return this.age - o.age ;
    }
}
class Student implements Comparator<Student>{
    int age;
    String name;
    int grade;

    public Student(int age, String name, int grade) {
        this.age = age;
        this.name = name;
        this.grade = grade;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.age - o2.age;
    }
}
class StudentComparatorByName implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}
public class SortingWithCollection {

    public static void main(String[] args){
        /*int[] a = new int[]{10,3,5,6,33,4};
        String[] str = new String[]{"Neha", "Anmol", "Riya", "Ullas"};
        System.out.println("Before sorting");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("After sorting");
        System.out.println(Arrays.toString(a));

        System.out.println("Before sorting");
        System.out.println(Arrays.toString(str));
        Arrays.sort(str);
        System.out.println("After sorting");
        System.out.println(Arrays.toString(str));*/

        /*Employee e1 = new Employee(40, "Neha", 9000);
        Employee e2 = new Employee(8, "Anmol", 6000);
        Employee e3 = new Employee(44, "Ullas", 17000);
        Employee e4 = new Employee(14, "Riya", 12000);

       Employee[] employees = new Employee[]{e1,e2,e3,e4};
       System.out.println("Before Sorting");
       System.out.println(Arrays.toString(employees));
       Arrays.sort(employees);
       System.out.println("After Sorting");
       System.out.println(Arrays.toString(employees));*/

        Student s1 = new Student(40, "Neha", 9000);
        Student s2 = new Student(8, "Anmol", 6000);
        Student s3 = new Student(44, "Ullas", 17000);
        Student s4 = new Student(14, "Riya", 12000);

        Student[] students = new Student[]{s1,s2,s3,s4};


        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(students));
       // Arrays.sort(students, new StudentComparatorByName());
        Arrays.sort(students, new Student());
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(students));





    }


}
