package com.emc.training.methodReferences;

import java.util.TreeSet;

interface Sample{
	void test(int i);
}

interface Calculator{
	int add(int a, int b);
}

class P{
	static int performAddition(int x, int y){
		return x+y;
	}
	
}
public class MethodReferenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s = System.out::println;
		s.test(90);
		
		// example of method reference 
		// only if parameter type matching with add() and performAddition()
		// only then we can use method refernce
		Calculator calc = P::performAddition;
		System.out.println(calc.add(23, 10));
		
		// can also be written like this
		Calculator cal1  = (i1,i2) -> P.performAddition(i1, i2);
		System.out.println(cal1.add(2, 3));
		
		
		// Comparator <String> c = ()  
		TreeSet<String> t1 = new TreeSet<String>(String::compareTo);
		t1.add("orange");
		t1.add("apple");
		System.out.println(t1);
	}

}
