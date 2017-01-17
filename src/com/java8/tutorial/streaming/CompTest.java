package com.java8.tutorial.streaming;

import java.util.List;
import java.util.stream.Stream;

public class CompTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stream<Integer> stream = Stream.of(12,324,42,53,65);
		
		System.out.println("No of items: "+Stream.of(12,324,42,53,65).count());
		System.out.println("No of items more than 50: "+Stream.of(12,324,42,53,65).filter(no->no>50).count());
		
		System.out.println("max: "+Stream.of(12,324,42,53,65).max(Integer::compareTo)); // alternate to below line
		System.out.println("max: "+Stream.of(12,324,42,53,65).max((no1,no2)->no1.compareTo(no2))); 
		
		System.out.println("Min: "+Stream.of(12,324,42,53,65).min(Integer::compareTo));
		
		
		
	}

}
