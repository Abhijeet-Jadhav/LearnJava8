package com.java8.tutorial.methodReferences;

class PP {
	public String getMessage(String n){
		return "Hello "+n;
	}
}

interface QQ{
	String print(PP pp, String name);
}

class R{
	void print(String s1, String s2){
		System.out.println("After concatenation: "+(s1+s2));
	}
}

// non-static method from second argument 
// when static method argument of interface method list should match method of class
interface S{
	void test(R r, String s1, String s2);
}

interface S1{
	void test(String s1, String s2);
}
class T{
	static void print(R r1, String s1, String s2){
		System.out.println("printing through static method "+s1+", "+s2);
	}
}
public class MethodReferenceTest2 {

	public static void main(String[] args) {
		QQ q = PP::getMessage;
		PP p = new PP();
		System.out.println( q.print(p, "Abhijeet") );
		
		S s = R::print;
		s.test(new R(), "hello", "world");
	}

}
