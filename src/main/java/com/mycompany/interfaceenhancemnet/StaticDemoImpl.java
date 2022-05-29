package com.mycompany.interfaceenhancemnet;

public class StaticDemoImpl implements StaticDemo {
	public static void main(String arg[]) {
		StaticDemoImpl obj=new StaticDemoImpl();
		//obj.show();//not allowed
		StaticDemo.show();//allowed
	}

}
