package com.java8.tutorial.predefinedFunctinalInterface;

import java.util.function.UnaryOperator;

import com.java8.tutorial.methodReferences.Employee;

public class UnaryOperatorTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UnaryOperator<Employee> incSalary=e->{
			e.setSalary(e.getSalary()+10000);
			return e;
		};
		Employee e=new Employee(101, "Rajiv", "Developer",40000);
		System.out.println(incSalary.apply(e));
}
}