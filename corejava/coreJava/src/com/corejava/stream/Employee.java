package com.corejava.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Employee {
	private int id;
    private String name;
    private int age;
    private long salary;
    private String gender;
    private String deptName;
    private String city;
    private int yearOfJoining;

    public Employee(int id, String name, int age, long salary, String gender, 
                    String deptName, String city, int yearOfJoining) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.deptName = deptName;
        this.city = city;
        this.yearOfJoining = yearOfJoining;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                ", deptName='" + deptName + '\'' +
                ", city='" + city + '\'' +
                ", yearOfJoining='" + yearOfJoining + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

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
    	
    	//1. Group the Employees by city.
    	
    	empList.stream().collect(Collectors.groupingBy(Employee :: getCity));
    	
    	//2. Group the Employees by age.
    	
    	empList.stream().collect(Collectors.groupingBy(Employee::getAge));
    	
    	//3. Find the count of male and female employees present in the organization.
    	
    	empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
    	
    	//4. Print the names of all departments in the organization.
    	
    		empList.stream().map(Employee::getDeptName).distinct();
    		
    	//5. Print employee details whose age is greater than 28.
    		
    		empList.stream().filter(e->e.getAge()>28).collect(Collectors.toList());
    		
    	//6. Find maximum age of employee.
    		OptionalInt max = empList.stream().mapToInt(Employee::getAge).max();
    		if (max.isPresent()) 
    		System.out.println("Maximum age of Employee: " + max.getAsInt());
    		
    	//7. Print Average age of Male and Female Employees.
    		
    		empList.stream().collect(Collectors.groupingBy
    				(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
    		
    	//9. Find oldest employee.
    		
    		
    		empList.stream().max(Comparator.comparingInt(Employee::getAge));
    		
    	//22. Print average and total salary of the organization.
    		
    		empList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
    		
    	//23. Print Average salary of each department.
    		
    		empList.stream().collect
    		(Collectors.groupingBy(Employee::getDeptName,Collectors.averagingDouble(Employee::getSalary)));
    		
    	//24. Find Highest salary in the organisation.
    		
    		empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).findFirst();
    		
    	//26. Nth Highest salary.
    		
    		int n = 10;
    		
    		empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(n-1);
    		
    	//31. Highest salary based on department.
    		
    		 empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, 
    				 Collectors.collectingAndThen(Collectors.toList(),
    				list -> list.stream().max(Comparator.comparingDouble(Employee::getSalary)))));
    		 
    //32. Print list of employee’s second highest record based on department
    		 
    		 empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,
                     Collectors.collectingAndThen(Collectors.toList(),
                     list -> list.stream().sorted(Comparator.comparingDouble
                    		 (Employee::getSalary).reversed()).skip(1).findFirst())));




	}
}
