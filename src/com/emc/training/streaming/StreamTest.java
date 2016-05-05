package com.emc.training.streaming;


import java.util.*;
import java.util.function.Predicate;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] array=new Integer[100];
		for(int i=0;i<array.length;i++){
			array[i]=i;
		}
		List<Integer> list=Arrays.asList(array);
		Predicate<Integer> predicate=(i)->i>=50;
		list.stream().filter(predicate).forEach(System.out::println);
		

	}
}
