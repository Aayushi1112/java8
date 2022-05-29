package com.mycompany.functionalInterface;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 value");

		Double num1 = sc.nextDouble();

		System.out.println("enter num2 value");
		Double num2 = sc.nextDouble();
		sc.nextLine();

		System.out.println("enter1.Add, 2.Sub 3.Div 4.Mul");
		String option = sc.nextLine();

		
		Calculator calculator=null;
		Double result=null;
		switch (option) {
		case "1":
			calculator=(Double num11,Double num22)->{
				return num11+num22;
			};
			result=calculator.operation(num1, num2);
			break;
		case "2":
			calculator=(Double num11,Double num22)->{
				return num11-num22;
			};
			result=calculator.operation(num1, num2);
			break;
		case "3":
			calculator=(Double num11,Double num22)->{
				return num11*num22;
			};
			result=calculator.operation(num1, num2);
			break;
		case "4":
			calculator=(Double num11,Double num22)->{
				return num11/num22;
			};
			result=calculator.operation(num1, num2);
			break;
		default:
			System.out.println("incorrect option! try again");
			break;
		}
		if(result!=null) {
			System.out.println("Result is:"+result);
		}
		else
		{
			System.out.println("Something wrong");
		}
	}

}
