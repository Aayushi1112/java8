package com.mycompany.datatimeapi;

import java.time.LocalDate;
import java.time.Period;

public class DateTime3 {

	public static void main(String[] args) {
		//calculate experience of an employee
		LocalDate currentDate=LocalDate.now();
		LocalDate startDate=LocalDate.of(2022, 02, 12);
        Period period=Period.between(startDate, currentDate);
		System.out.printf("Total experience is: %d years %d months %d days",period.getYears(),period.getMonths(),period.getDays());

	}

}
