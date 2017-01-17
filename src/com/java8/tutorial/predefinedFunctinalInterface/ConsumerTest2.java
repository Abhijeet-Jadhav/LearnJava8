package com.java8.tutorial.predefinedFunctinalInterface;

interface R{
	void test(int p);
}
class S{
	void print(int k)
	{
		System.out.println("Value is "+k);
	}
}

public class ConsumerTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S s=new S();
		R r=s::print;
		r.test(46);
		
	}

}