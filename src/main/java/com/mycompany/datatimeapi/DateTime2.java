package com.mycompany.datatimeapi;

import java.time.LocalDate;

public class DateTime2 {
	public static void main(String arg[]) {
		LocalDate date=LocalDate.now();
		System.out.println("date after 15 days "+date.plusDays(15));
		System.out.println("date before 5 months "+date.minusMonths(5));
		
	}

}
