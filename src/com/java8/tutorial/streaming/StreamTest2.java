package com.java8.tutorial.streaming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest2 {

	public static void main(String arg[]){
		String[] fruits = {"applE","orange","mango"};
		List<String> list = Arrays.asList(fruits);
		
		//list.stream().filter(s->s.length()<=5).map(s->s.toUpperCase()).forEach(System.out::println);
		list.stream().filter(s->s.length()<=5).map(String::toUpperCase).forEach(System.out::println);
		
		Stream<Double> stream = Stream.of(12.0,123.34,123.45,456.34);
		stream.map(Math::sqrt).forEach(System.out::println);
		
		//int[] array = new int[100];
		// stream doesn't work on primitive types
		
		Integer[] array = new Integer[100];
		for(int i=0; i<array.length;i++)
			array[i] = (int)(Math.random()*100);
		Arrays.asList(array).stream().parallel().
		forEach(no->System.out.println(Thread.currentThread().getName()+" "+no));
		
		Stream.of(array).parallel().
		forEach(no->System.out.println(Thread.currentThread().getName()+" "+no));
		
	}
}
