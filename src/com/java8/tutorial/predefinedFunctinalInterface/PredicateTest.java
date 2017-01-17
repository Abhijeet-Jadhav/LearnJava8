package com.java8.tutorial.predefinedFunctinalInterface;

import java.util.List;
import java.util.function.Predicate;

import com.java8.tutorial.methodReferences.Employee;
import com.java8.tutorial.methodReferences.EmployeeUtility;

public class PredicateTest {
	public static void main(String[] args) {
		EmployeeUtility utility=new EmployeeUtility();
		List<Employee> employees=utility.getAllEmployees();
		Predicate<Employee> predicate=e->e.getDesignation().equals("Developer");
		for(Employee e:employees){
			if(predicate.test(e)){
				System.out.println(e);
			}
		}
	}
}
