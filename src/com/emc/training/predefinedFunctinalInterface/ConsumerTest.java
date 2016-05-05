package com.emc.training.predefinedFunctinalInterface;

import java.util.*;
import java.util.function.Consumer;

import com.emc.training.methodReferences.Employee;

public class ConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Employee> consumer=(e)->{
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getDesignation());
		};
	/*	Employee e=new Employee(1001, "Rajiv", "Developer");
		consumer.accept(e);*/
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(501, "Sachin", "Accountant"));
		list.add(new Employee(502, "David", "Team Lead"));
		list.add(new Employee(503, "Raghav", "Architect"));
		System.out.println("using lambda");
		list.forEach(consumer);
		
		Consumer<Employee> cons=new Consumer<Employee>() {

			@Override
			public void accept(Employee t) {
				// TODO Auto-generated method stub
				System.out.println(t.getName());
			}
		};
		
		System.out.println("using anonymous class");
		list.forEach(cons);
		System.out.println("using method intf");
		list.forEach(System.out::println);
		System.out.println("using plain lambda");
		list.forEach(e->System.out.println(e));
	}
}
