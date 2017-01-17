package com.java8.tutorial.methodReferences;

public class MethodReferenceTest6 {

	
	public static void main(String[] args) {
		EmployeeData employeeData = EmployeeUtility::findEmployee;
		System.out.println(employeeData.getEmployeeDetail(new EmployeeUtility(), 101));
	}

}
