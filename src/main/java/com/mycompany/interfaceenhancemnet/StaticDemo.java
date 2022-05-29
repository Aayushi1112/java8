package com.mycompany.interfaceenhancemnet;

public interface StaticDemo {
	
	public static void show()
	{
		System.out.println("static method1");//static method dont get available in implementing class
	}

	public static void show2()
	{
		System.out.println("static method 2");
	}
}
