package com.mycompany.interfaceenhancemnet;

public interface Vehicle7 {
	
	
	
	default void show() {
		System.out.println("added new featuere1");
	}
	
	default void newshow()
	{
		System.out.println("added feautre 2");
	}
	void getDetails();//by default is public, abstarct
    String color="red";//by default is public static final
    Double mileage();//public and abstract//no implemnetation is given here
}
