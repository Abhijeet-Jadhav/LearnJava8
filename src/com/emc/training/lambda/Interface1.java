package com.emc.training.lambda;

public interface Interface1 {
	
	default void test(){
		System.out.println("default implementation of test method");
		System.out.println("Message : "+getMessage());
	}
	
	String getMessage();
}
