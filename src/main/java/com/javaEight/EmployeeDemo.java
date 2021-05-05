package com.javaEight;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class EmployeeDemo {
    public static void main(String[] args){
        List<Employee> employeeList = Arrays.asList(
                new Employee("Neha", 42),
                new Employee("Ullas", 44),
                new Employee("Anmol", 8),
                new Employee("Anmol", 8),
                new Employee("Anmol", 8),
                new Employee("Riya", 14)
        );
        employeeList.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed())
                .limit(3)
                .map(Employee::getName)
                .forEach(System.out::println);

        /*Predicate<Employee> predicate1 = employee -> employee.getAge() >40;
        Predicate<Employee> predicate2 = employee -> employee.getName().equalsIgnoreCase("anmol");
        Predicate<Employee> predicate3 = employee -> employee.getAge() <20;
        System.out.println("Above Age 40");
        predicateDemo(employeeList, predicate1).forEach(System.out::println);
        System.out.println("Name equls anmol");
        predicateDemo(employeeList, predicate2).forEach(System.out::println);
        System.out.println("Age below 20");
        predicateDemo(employeeList, predicate3).forEach(System.out::println);*/


        /*List<Integer> integers = Arrays.asList(4,5,6,7,3,2,3,4,6,4,4,11,12);
        OptionalDouble avg =  integers.stream().mapToInt(n -> n*n).filter(n-> n>100).average();
        System.out.println(avg);*/
        /*System.out.println("List: ");
        integers.forEach(System.out::print);
        System.out.println("\nDistinct: ");
        integers.stream().distinct().collect(Collectors.toList()).forEach(System.out::print);
        System.out.println("\nSet: ");
        integers.stream().collect(Collectors.toSet()).forEach(System.out::print);
        Set<Employee> empSet = employeeList.stream()
                .collect(Collectors.toSet());
        empSet.forEach(System.out :: println);*/
        /*Map<String, List<Employee>> map = employeeList.stream()
                .collect(Collectors.groupingBy(Employee :: getName));
        for(Map.Entry<String, List<Employee>> emp : map.entrySet()){
            System.out.println("Name : " +emp.getKey() + " List : " + emp.getValue());
        }
        map.forEach((name, nameList) -> System.out.println("Name: " + name + "List: " + nameList));*/


        /*List<String> empStr = employeeList.stream().map(Employee::getName).collect(Collectors.toList());
        String nameStr = String.join(",", empStr);
        System.out.println(nameStr);

        System.out.println("Original List: ");
        employeeList.forEach(System.out :: println);
*/
        /*employeeList.sort((e1,e2) -> e1.getAge()-e2.getAge());
        System.out.println("Sorted List By age: ");
        employeeList.forEach(System.out :: println);*/

        /*employeeList.sort((e1,e2) -> e1.getName().compareTo(e2.getName()));
        System.out.println("Sorted List By Name");
        employeeList.forEach(System.out :: println);*/

       /* OptionalInt maxEmp = employeeList.stream().mapToInt(Employee::getAge).max();
        if(maxEmp.isPresent())
            System.out.println(maxEmp);*/
        /*System.out.println("List of Employee above age 40 : ");
        for (String s: getEmployee(employeeList)){
            System.out.println(s);
        }*/
        //System.out.println("Number of Employees whose name is Anmol : "+ getEmpByName(employeeList, "Anmol"));
        //System.out.println("Check Anmol is present in list : "+ getEmployee(employeeList, "Anmols"));
    }
    public static List<Employee> predicateDemo(List<Employee> employees, Predicate<Employee> empPre){
        return employees.stream().filter(empPre).collect(Collectors.toList());
    }
    public static Employee getEmployee(List<Employee> employees, String s){
        List<String> result = new ArrayList<>();
        for (Employee e: employees) {
            if(s.equalsIgnoreCase(e.getName()))
                return e;
        }
        return null;
    }
    public static List<String> getEmployeeByName(List<Employee> employees){
        List<String> empNameList = employees.stream().filter(e -> e.getAge() < 40)
                .map(Employee::getName)
                .collect(Collectors.toList());

        return  empNameList;
    }
    public static Long getEmpByName(List<Employee> employees, String name){
        Long emp = employees.stream()
                .filter(e -> e.getName().equalsIgnoreCase("Anmols"))
               .count();

        return  emp;
    }
}
