package com.mycompany.streamfilterpredicateoptional;

import java.nio.ReadOnlyBufferException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.border.SoftBevelBorder;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee[] empArr= {
				new Employee("John",567.89),
				new Employee("Peter",234.78),
				new Employee("Pet",289.78),
				new Employee("Amn",999.78),
				new Employee("Rom",908.78)
		};
		List<Employee> empList=Arrays.asList(empArr);
	    
		
		empList=empList.parallelStream().filter((emp)->{
			return emp.getSalary()>300.0;
		}).collect(Collectors.toList());
		
		
		//I want ReadOnlyBufferException namException SoftBevelBorder employeeBevelBorder
		List<String> empNameStrings=empList.parallelStream()
				.filter((emp)->{
			return emp.getSalary()>300.0;
		}).map(emp->emp.getEmpName())
				.collect(Collectors.toList());
		
		//System.out.println(empList);
		
		//Earlier java way
		/*
		 * for(Employee e:empList) {
		 * System.out.println("emp name"+e.getEmpName()+", emp salary:"+e.getSalary());
		 * }
		 */

		
		empList.forEach(e-> System.out.println("Emp name"+e.getEmpName()));
		
		//remove an Employee from List whose name start with ro
		empList.removeIf(e->e.getEmpName().startsWith("Ro"));
		empList.forEach(e->System.out.println("emp name:"+e.getEmpName()));
			}

}
