package com.java8.tutorial.lambda;

public class LambdaTest {
	
	public static void main(String args[]){
		Sample sample = (String n) -> {return "welcome to java 8 "+n;};
		
		System.out.println(sample.getMessage("Abhijeet"));
		
		printMessage((String n) -> {return "Passing lambda expr as argument "+n;}, "abc");
	}
	
	static void printMessage(Sample s , String name){
		System.out.println(s.getMessage(name));
	}
}
