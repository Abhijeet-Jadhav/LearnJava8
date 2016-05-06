package com.emc.training.predefinedFunctinalInterface;

import java.util.function.Supplier;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;

import com.emc.training.methodReferences.Employee;
import com.emc.training.methodReferences.EmployeeUtility;

public class DoubleFuncTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeUtility utility = new EmployeeUtility();
		ToDoubleFunction<Employee> doubleFunction = e->e.getSalary();
		System.out.println(doubleFunction.applyAsDouble(utility.findEmployee(104)));
	}

}
