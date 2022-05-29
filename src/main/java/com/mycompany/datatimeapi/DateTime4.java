package com.mycompany.datatimeapi;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class DateTime4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZoneId zoneId=ZoneId.systemDefault();
		System.out.println(zoneId);
		
		
		ZoneId zoneIdAmericaId=ZoneId.of("America/Los_Angeles");
		System.out.println(zoneIdAmericaId);
		System.out.println(LocalDateTime.now(zoneIdAmericaId));
		
		ZoneId zoneIdGmtId=ZoneId.of("GMT+05:30");
		System.out.println(LocalDateTime.now(zoneIdGmtId));

	}

}
