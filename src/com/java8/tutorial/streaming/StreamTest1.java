package com.java8.tutorial.streaming;

import java.util.List;
import java.util.function.Predicate;

import com.java8.tutorial.methodReferences.Employee;
import com.java8.tutorial.methodReferences.EmployeeUtility;

public class StreamTest1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeUtility utility=new EmployeeUtility();
		List<Employee> employees=utility.getAllEmployees();
	/*	Function<Employee, Employee> func=
				e->new Employee(e.getId(), e.getName(), e.getDesignation(), e.getSalary()+10000);*/
		Predicate<Employee> predicate=e->e.getSalary()>=50000;
		employees.stream()
		.peek(e->System.out.println("before filtering "+e)).
		filter(predicate)
		.peek(e->System.out.println("before mapping "+e)).
		map(e->{
			e.setSalary(e.getSalary()+10000);
			return e;
		}).
		peek(e->System.out.println("after mapping "+e)).
		forEach(System.out::println);

		// forEach(e->System.out.println(e))		
				// .stream.parallel to make use of multiple cores
				
				
	}


}
