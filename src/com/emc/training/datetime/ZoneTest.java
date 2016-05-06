package com.emc.training.datetime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZoneId zoneId=ZoneId.of("Australia/Melbourne");
		LocalDateTime localTime=LocalDateTime.now();
		ZonedDateTime zonedDateTime=ZonedDateTime.now(zoneId);
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yy EEE hh:mm:ss a");
		System.out.println("current zone time "+formatter.format(localTime));
		System.out.println("australian zone time "+formatter.format(zonedDateTime));

	}

}