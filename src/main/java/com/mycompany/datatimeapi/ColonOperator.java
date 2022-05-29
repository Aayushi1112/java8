package com.mycompany.datatimeapi;

import java.util.Arrays;
import java.util.List;

public class ColonOperator {
	public static void main(String args[]) {
		List<String> nameStrings=Arrays.asList("apple","mango","banana");
		nameStrings.forEach(name->System.out.println(name));
		
		nameStrings.forEach(System.out::println);
		
		nameStrings.stream().map(String::toUpperCase).forEach(System.out::println);
		
	}

}
