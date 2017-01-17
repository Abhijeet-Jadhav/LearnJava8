package com.java8.tutorial.predefinedFunctinalInterface;

import java.util.function.Supplier;

import com.java8.tutorial.methodReferences.Employee;

public class SupplierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Employee> s = Employee::new; 
	}

}
