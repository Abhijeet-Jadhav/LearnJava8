package com.emc.training.lambda;

public class LambdaTest6 {

	public static void main(String a[]){
		int k = 10;
		Interface2 intf = r -> r+k;
		System.out.println(intf.manipulate(20));
		
		// changing value of k will compilation error
		// since it is a effectively final variable
		//k = 90;
	}
}
