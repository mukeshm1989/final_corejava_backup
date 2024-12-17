package corejava.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import corejava.test.dto.Student;

public class Test {
	
	public static void main(String[] args) {
	
		int i=1,j=0;
		try {
		    int k=i/j;
		} catch (Exception ex) {
		    System.out.println("Exception occured");
		}
		
		Student student = new Student();
		
		student.setAddress("Bangalore");
		student.setAge(20);
		student.setName("TestJava");
		

		
		Student student1 = new Student();
		student1.setAddress("Chennai");
		student1.setAge(22);
		student1.setName("JavaTest");
		
		List<Student> set = new ArrayList<Student>();
		
		set.add(student);
		set.add(student1);
		//Collections.sort(set,new SortByAge());
		Collections.sort(set,new SortByname());
		set.forEach((key)->{
			System.out.println(key.getAge());
			System.out.println(key.getAddress());
			System.out.println(key.getName());
		});
	}

}
 class SortByname implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
	 
 }
 
 class SortByAge  implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getAge()-o2.getAge();
	}
	 
 }
