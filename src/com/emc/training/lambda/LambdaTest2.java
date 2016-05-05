package com.emc.training.lambda;

public class LambdaTest2 {
	
	public static void main(String args[]){
		
		// Type in inferred
		// braces are needed only for multiple statements
		// If only one argument u need not use parenthesis for n
		Sample sample = n -> "welcome to java 8 "+n;
		
		System.out.println(sample.getMessage("Abhijeet"));
		
		
		// Type is inferred
		printMessage(n -> "Passing lambda expr as argument "+n, "LambdaTest2");
	}
	
	static void printMessage(Sample s , String name){
		System.out.println(s.getMessage(name));
	}
}
