package com.emc.training.lambda;

import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class MyCallable implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		int sum = 0 ;
		return null;
	}
	
}

public class lambdaTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread thread1 = new Thread(()->{
			for(int i=1; i<= 10; i++){
				System.out.println("Inside thread "+i);
			}
		});
		thread1.start();
		
		// comparator itself can be passed as lambda
		Set<String> s = new TreeSet<String>( (s1,s2)->s2.compareTo(s1));
		s.add("apple");
		s.add("orange");
		
		System.out.println(s);
		
		Set<Integer> s1 = new TreeSet<Integer>( (i1,i2) -> i1.compareTo(i2));
		Set<Integer> s3 = new TreeSet<Integer>( (i1,i2) -> {
			
			// custom logic for comparator
			int val = 0;
			if(i1 %2 ==0)
				val = -1;
			else if (i1 % 2 == 1)
				val = 1;
			return val;
			
		});
		s3.add(23);
		s3.add(40);
		s3.add(90);
		s3.add(31);
		System.out.println(s3);
		
		MyCallable myCallable = new MyCallable();
		ExecutorService service = Executors.newFixedThreadPool(2);
		//Future<Integer> f = service
		
	}

}
