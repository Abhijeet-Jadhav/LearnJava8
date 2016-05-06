package com.emc.training.streaming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

import com.emc.training.methodReferences.Employee;
import com.emc.training.methodReferences.EmployeeUtility;

public class SortTest {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			EmployeeUtility utility=new EmployeeUtility();
			/*utility.getAllEmployees().stream().filter(e->e.getDesignation().equals("Developer")).
			sorted((e1,e2)->e1.getName().compareTo(e2.getName())).
				forEach(System.out::println);
			
			
			String[] fruits={"orange","apple","grape","pine apple"};
			Arrays.asList(fruits).stream().sorted((s1,s2)->s2.compareTo(s1)).forEach(System.out::println);
	*/
			Function<Employee, String> func1=e->e.getDesignation();
			Function<Employee, Double> func2=e->e.getSalary();
			utility.getAllEmployees().stream()
			.filter(e->e.getDesignation().equals("Developer")).
			sorted(Comparator.comparing((Employee e)->e.getDesignation()).thenComparing(e->e.getSalary())).
			//.thenComparing(e->e.getSalary())).
			forEach(System.out::println);

		}
		
	}


