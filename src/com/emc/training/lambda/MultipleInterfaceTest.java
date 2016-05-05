package com.emc.training.lambda;

interface I1{
	default void test(){
		System.out.println("Method of I1");
	}
}

interface I2{
	default void test(){
		System.out.println("Method of I1");
	}
}

class X implements I1, I2{
	public void test(){
		
		// java 8 allows concrete methods within an interface
		I1.super.test();
		I2.super.test();
		System.out.println("Method of class X");
	}
}
public class MultipleInterfaceTest implements I1 {

	
	public static void main(String a[]){
		X x = new X();
		x.test();
	}
}
