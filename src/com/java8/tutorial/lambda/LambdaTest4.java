package com.java8.tutorial.lambda;

public class LambdaTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Third t1 = str -> str.length();
		Third t2 = str->str.indexOf("-");
				
		System.out.println(t1.getDetail("hello"));
		System.out.println(t2.getDetail("abd"));
	}

}
