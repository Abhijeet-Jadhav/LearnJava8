package com.emc.training.lambda;

public class LambdaTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Next next1 = (s1,s2) -> s1+"  "+s2;
		Next next2 = (s1,s2) -> s1.concat(s2).toUpperCase();
		System.out.println(next1.process("abc", "def"));
		System.out.println(next2.process("abc", "def"));
		
		Next next3 = (s1,s2)->s2.concat(s1);
		System.out.println(next3.process("abc", "def"));
	}

}
