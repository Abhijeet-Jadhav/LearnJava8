package com.java8.tutorial.datetime;


import static java.time.DayOfWeek.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static  java.time.temporal.TemporalAdjusters.*;
 

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date=LocalDate.now();
		System.out.println(date.getDayOfWeek());
		System.out.println(date.isLeapYear());
		//System.out.println(next(MONDAY));
		System.out.println(date.with(next(MONDAY)));
		System.out.println(date.with(next(TUESDAY)));
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		System.out.println(formatter.format(date));
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		formatter=DateTimeFormatter.ofPattern("hh:mm:ss a");
		System.out.println(formatter.format(time));

		LocalDateTime dateTime=LocalDateTime.now();
		formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy EEEE hh:mm:ss a");
		System.out.println(formatter.format(dateTime));
	}

}
