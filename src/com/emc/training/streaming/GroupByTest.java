package com.emc.training.streaming;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.emc.training.methodReferences.Employee;
import com.emc.training.methodReferences.EmployeeUtility;

public class GroupByTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeUtility utility=new EmployeeUtility();
		
	Map<String, List<Employee>> employeeGroups=utility.getAllEmployees().stream()
																				.collect(Collectors.groupingBy(e->e.getDesignation()));
		
		Set<String> set=employeeGroups.keySet();
		set.forEach(designation->{
			List<Employee> list=employeeGroups.get(designation);
			System.out.println("Employees belong to group "+designation);
			list.forEach(e->System.out.println(e));
		});

	}
}
