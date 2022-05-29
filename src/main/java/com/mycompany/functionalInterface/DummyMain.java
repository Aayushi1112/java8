package com.mycompany.functionalInterface;

public class DummyMain {
	public static void main(String args[])
	{
		Integer i=8;
		IamAFunctionalInterface var1=()->{
			System.out.println("hello");
		};
		
		var1.display();
		
		IamAFunctionalInterface var12=()->{
			System.out.println("hello2");
		};
		
		var12.display();
		
		
		
	}

	
}
