package com.java8.tutorial.predefinedFunctinalInterface;

import java.util.function.BiPredicate;

import com.java8.tutorial.methodReferences.Employee;
import com.java8.tutorial.methodReferences.EmployeeUtility;

public class BiPredicateTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<String, Employee> biPredicate=(name,e)->e.getName().equalsIgnoreCase(name);
		EmployeeUtility utility=new EmployeeUtility();
		Employee e=utility.findEmployee(101);
		System.out.println(biPredicate.test("a1", e));

	}
}
