package com.corejava.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.corejava.dto.Employee;

public class SortMapStream {
	
	public static void main(String[] args) {
		
		Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();
		empMap.put(1, new Employee(1, "m", 30000.00));
		empMap.put(2, new Employee(1, "a", 300.00));
		
		sortEmployee(empMap);
	
		Map<Integer, String> sortMap = new HashMap<Integer, String>();
		sortMap.put(1, "mukesh");
		sortMap.put(2, "test");
		sortMap.put(3, "atest");
		sortMap.put(4, "ntest");
		sortMap(sortMap);
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "ram", 1.0));
		empList.add(new Employee(1, "aam", 1.0));
		empList.add(new Employee(1, "shyam", 1.0));
		empList.add(new Employee(1, "bam", 1.0));
		sortEmployeeListByNmae(empList);
	}
	
	
	private static void sortEmployee(Map<Integer, Employee> empMap) {
		
		Map<Integer, Employee> sortedEmployee = empMap.entrySet().stream().sorted((emp1, emp2)->
		emp1.getValue().getSalary().compareTo(emp2.getValue().getSalary())).collect(
				Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(emp1,emp2)->emp1,LinkedHashMap::new));
		
	
		
		Map<Integer, Employee> sortedMapTest = empMap.entrySet().stream().sorted((emp1,emp2)->
		emp1.getValue().getSalary().compareTo(emp2.getValue().getSalary())).collect(Collectors
				.toMap(Map.Entry::getKey,Map.Entry::getValue,(emp1,emp2)-> emp1, LinkedHashMap::new));
		sortedMapTest.forEach((key, value) -> System.out.println(key + ":" + value));
		
		Map<Integer,Employee> sortedNewMap = empMap.entrySet().stream().sorted((e1,e2)->
        e1.getValue().getSalary().compareTo(e2.getValue().getSalary()))
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                (e1, e2) -> e1, LinkedHashMap::new));
		sortedNewMap.forEach((key, value) -> System.out.println(key + ":" + value));
		
		empMap.entrySet().stream().sorted((emp1,emp2)->emp1.getValue().getSalary().compareTo(emp2.getValue().getSalary())).collect(
				Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue, (e1,e2)->e1,LinkedHashMap::new));
		
	}
	private static void sortMap(Map<Integer, String> unSortMap) {
		
		unSortMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(
				Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(o1,o2)->o1 ,LinkedHashMap::new));
		
		unSortMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(
				Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(o1,o2)->o1,LinkedHashMap:: new));
			
		Map<Integer, String> sortedMap = unSortMap.entrySet()
	    .stream()
	    .sorted(Map.Entry.comparingByValue())
	    .collect(Collectors.toMap(
	        Map.Entry::getKey,
	        Map.Entry::getValue,
	        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

	
		sortedMap.forEach((key, value)-> System.out.println(key + ":" + value));
	}
	
	private static void sortEmployeeListByNmae(List<Employee> emp) {
		
		List<Employee> sortedEmpList = emp.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		
		System.out.print(sortedEmpList);
	}
}