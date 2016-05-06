package com.emc.training.streaming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.emc.training.methodReferences.Employee;
import com.emc.training.methodReferences.EmployeeUtility;

public class CollectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeUtility utility = new EmployeeUtility();
		List<Employee> developers = utility.getAllEmployees().stream()
		.filter(e->e.getDesignation().equals("Developers"))
		.sorted(Comparator.comparing(Employee::getName))
		.collect(Collectors.toList());
		
		developers.forEach(System.out::println);
	}

}
