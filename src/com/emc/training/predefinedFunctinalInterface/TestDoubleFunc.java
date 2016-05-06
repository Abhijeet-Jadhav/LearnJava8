package com.emc.training.predefinedFunctinalInterface;


import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleFunction;

import com.emc.training.methodReferences.Employee;
import com.emc.training.methodReferences.EmployeeUtility;

public class TestDoubleFunc {
	public static void main(String[] args) {
		EmployeeUtility utility=new EmployeeUtility();
		DoubleFunction<List<Employee>> findBySalary=salary->{
			 List<Employee> list=utility.getAllEmployees();
			 List<Employee> subList=new ArrayList<>();
			 for(Employee e:list){
				 if(e.getSalary()>salary){
					 subList.add(e);
				 }
			 }
			 return subList;
		};
		List<Employee> listAbove50000=findBySalary.apply(50000);
		for(Employee e:listAbove50000){
			System.out.println(e);
		}
	}

}