package com.mycompany.datatimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Date;

public class DataTime1 {
	public static void main(String args[]) {
			Date date=new Date();
			System.out.println(date);
			
			
			//java8
			LocalDate localDate=LocalDate.now();
			System.out.println(localDate);
			
			LocalTime localTime=LocalTime.now();
			System.out.println(localTime);
			
			
			LocalDateTime localDateTime=LocalDateTime.now();
			System.out.println(localDateTime);
			
			
			
			System.out.println(localDate.getDayOfMonth());
			System.out.println(localDate.getMonthValue());
			
		//create a future date time
			LocalDateTime  futureDateTime=LocalDateTime.of(2024, Month.DECEMBER,20,9,30,20);
			System.out.println(futureDateTime);
			
	}

}
