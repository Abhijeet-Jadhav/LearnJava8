package com.emc.training.predefinedFunctinalInterface;

import java.util.function.Supplier;

import com.emc.training.methodReferences.Employee;

public class SupplierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Employee> s = Employee::new; 
	}

}
