package com.emc.training.streaming;

import java.util.List;
import java.util.function.Function;

import com.emc.training.methodReferences.Employee;
import com.emc.training.methodReferences.EmployeeUtility;

public class StreamTest2 {

	public static void main(String arg[]){
		EmployeeUtility utility = new EmployeeUtility();
		List<Employee> employees = utility.getAllEmployees();
		Function<Employee, Employee> func = e->new Employee(e.getId(),e.getName(),e.getDesignation(),e.getSalary()+1000); 
		employees.stream().map(func).forEach(System.out::println); 
	}
}
