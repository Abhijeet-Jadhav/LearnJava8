package com.java8.tutorial.streaming;

import java.util.Optional;

import com.java8.tutorial.methodReferences.Employee;
import com.java8.tutorial.methodReferences.EmployeeUtility;

public class OptionalTest {

	public static void main(String ar[]){
		int id = Integer.parseInt(ar[0]);
		getEmployeeDetail(id).ifPresent(System.out::println);
		
		Optional<Integer> opt = Optional.of(10);
		System.out.println(opt.orElse(50));
		opt = Optional.empty();
		System.out.println(opt.orElse(50));
		
	}
	
	static Optional<Employee> getEmployeeDetail(int id){
		EmployeeUtility utility = new EmployeeUtility();
		Employee e = utility.findEmployee(id);
		if(e==null)
			return Optional.empty();
		else
			return Optional.of(e);
	}
}
