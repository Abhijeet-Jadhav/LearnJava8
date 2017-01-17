package com.java8.tutorial.methodReferences;


interface A{
	int getValue(float f);
}

class B{
	public int getNextValue(float f)
	{
		int p=(int)f;
		return ++p;
	}
}



interface D{
	int getValue(B b,float f);
}

interface E{
	int getPosition(String s1,String s2);
}

public class MethodReferenceTest3 {
	public static void main(String[] args) {
		A a=Math::round;
		System.out.println(a.getValue(34.22F));
		D d=B::getNextValue;
		System.out.println(d.getValue(new B(), 75.22F));
		E e1=String::indexOf;
		System.out.println(e1.getPosition("hello", "e"));
	}

}