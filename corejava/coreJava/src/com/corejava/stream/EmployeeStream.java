package com.corejava.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeStream {
	private int id;
    private String name;
    private int age;
    private long salary;
    private String gender;
    private String deptName;
    private String city;
    private int yearOfJoining;
	
	public static void main(String[] args) {
		
    	List<Employee> empList = new ArrayList<>();
    	empList.add(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
    	empList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
    	empList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
    	empList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));

    	empList.add(new Employee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
    	empList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
    	empList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
    	empList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
    	empList.add(new Employee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));
    	
    	
    	Map<String, List<Employee>> n2 = empList.stream().filter(t -> t.getSalary()>=125).
    			collect(Collectors.groupingBy(Employee::getDeptName));
    	
    	System.out.println(n2);
    	
    	
    	//1. Group the Employees by city.
    	
    	Map<String, List<Employee>> reList =    			
    			empList.stream().collect(Collectors.groupingBy(Employee::getDeptName));
    	//System.out.println(reList);
    	
    	//3. Find the count of male and female employees present in the organization.
    	
    	Map<String, Long> empcoutn = empList.stream().collect(Collectors.groupingBy(Employee::getGender , Collectors.counting()));
    	
    	//System.out.println(empcoutn);
    	
    	//4. Print the names of all departments in the organization.
    	
    	//empList.stream().map(Employee::getDeptName).distinct().forEach(System.out::println);
    	
    	//5. Print employee details whose age is greater than 28.
    	
    	
    	//empList.stream().filter(emp->emp.getAge()>28).collect(Collectors.toList()).forEach(
    			//System.out::println);
    	
    	//6. Find maximum age of employee.
    	
    	OptionalInt n = empList.stream().mapToInt(Employee::getAge).max();
    	if(n.isPresent()) {
    		//System.out.println(n);
    		
    		//7. Print Average age of Male and Female Employees.
    		
    		Map<String, Double> i = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
    		System.out.println(i);
    		
    		//23. Print Average salary of each department.
    		
    		empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.averagingDouble(Employee::getSalary)));
    		
    		
    		//24. Find Highest salary in the organisation.
    		
    		empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).findFirst();
    		
    		//26. Nth Highest salary.
    		
    		int n1=2;
    		
    		empList.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed()).skip(n1-1);
    		
    		
    		//31. Highest salary based on department.
    		
    		empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.collectingAndThen(Collectors.toList(), 
    				list->list.stream().max(Comparator.comparingDouble(Employee::getSalary)))));
    		
    		 //32. Print list of employee’s second highest record based on department
    		
    		empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.collectingAndThen(Collectors.toList(), 
    				list->list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(n1-1))));
    	}
	}

}
