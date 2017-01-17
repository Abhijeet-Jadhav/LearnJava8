package com.java8.tutorial.lambda;

public class LambdaTest5 {
	
	public static void main(String ar[]){
		
		Interface1 intf1 = () -> "Hello";
		intf1.test();
		
		// create anon class and call test
		//Interface1 intf2 = new Interface1(){};
		
	}
}
