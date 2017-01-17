package com.java8.tutorial.streaming;

import java.util.Optional;
import java.util.stream.Stream;

import com.java8.tutorial.methodReferences.EmployeeUtility;

public class StreamTest3 {

	public static void main(String args[]){
		EmployeeUtility utility = new EmployeeUtility();
		Optional<Integer> opt=Stream.of(1,2,3).map(i->i*i).reduce((x,y)->(x+y));
		System.out.println(opt.orElse(0));
		opt=Stream.of(12,55,55).filter(no->no>=100).map(i->i*i).reduce((x,y)->(x+y));
		System.out.println(opt.orElse(0));

	}
}
