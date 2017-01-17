package com.java8.tutorial.streaming;

import java.util.Arrays;

public class SumAvgTest {

	public static void main(String[] args) {

		int sum = Arrays.stream(new int[]{34,25,2,56,369,4}).sum();
		System.out.println("sum="+sum);
		
		double average = Arrays.stream(new int[]{34,89,75,66,32,24}).average().getAsDouble();
		System.out.println("average="+average);
		
		//output of stream can be send to collections using collector

	}

}
