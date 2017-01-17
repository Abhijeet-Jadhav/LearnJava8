package com.java8.tutorial.predefinedFunctinalInterface;

import java.util.function.Consumer;

import com.java8.tutorial.methodReferences.Employee;

interface EmployeeUtil{
	void updateId(Employee e);
}


public class ConsumerTest3 {

	public static void main(String[] args) {
		/*	EmployeeUtil util=e->e.setId(e.getId()+1000);
		Employee employee=new Employee(1, "Rajiv", "Developer");
		util.updateId(employee);*/
		Consumer<Employee> consumer= e->e.setId(e.getId()+1000);
		Employee employee=new Employee(1, "Rajiv", "Developer");
		consumer.accept(employee);
		System.out.println(employee);
		
	}

}
