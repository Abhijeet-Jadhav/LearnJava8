package com.emc.training.predefinedFunctinalInterface;

import java.util.function.Function;

import com.emc.training.methodReferences.Employee;
import com.emc.training.methodReferences.EmployeeUtility;

public class FunctionTest {

	public static void main(String args[]){
		
		// accepts integer return double
		Function<Integer, Double> function = no->Math.sqrt(no);
		System.out.println(function.apply(25));
		
		// shortcut
		function=Math::sqrt;
		System.out.println(function.apply(25));
		
		EmployeeUtility utility = new EmployeeUtility();
		Function<Integer,Employee> function2 = utility::findEmployee;
		System.out.println(function2.apply(101));
		
		Function<String,Employee> function3 = name->new Employee(6001, name, "Unknown");
		System.out.println(function3.apply("a2"));
		
		
	}
}
