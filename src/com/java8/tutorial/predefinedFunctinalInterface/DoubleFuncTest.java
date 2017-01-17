package com.java8.tutorial.predefinedFunctinalInterface;

import java.util.function.ToDoubleFunction;

import com.java8.tutorial.methodReferences.Employee;
import com.java8.tutorial.methodReferences.EmployeeUtility;

public class DoubleFuncTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeUtility utility = new EmployeeUtility();
		ToDoubleFunction<Employee> doubleFunction = e->e.getSalary();
		System.out.println(doubleFunction.applyAsDouble(utility.findEmployee(104)));
	}

}
