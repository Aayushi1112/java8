package com.mycompany.streamfilterpredicateoptional;

import java.nio.ReadOnlyBufferException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.swing.border.SoftBevelBorder;

public class EmployeeOptionalMain {

	public static void main(String[] args) {

		Employee[] empArr = { new Employee("John", 567.89), new Employee("Peter", 234.78), new Employee("Pet", 289.78),
				new Employee("Amn", 999.78), new Employee("Rom", 908.78) };
		List<Employee> empList = Arrays.asList(empArr);

		Optional<Employee> optEmp = empList.stream().filter(emp -> emp.getSalary() > 100.00).findFirst();

		if (optEmp.isPresent())
		{
			System.out.println("Employee found with ");
			Employee foundEmployee = optEmp.get();
			System.out.println(foundEmployee.getEmpName() + " " + foundEmployee.getSalary());
		}
		else {
			System.out.println("no matching record");
		}
		
		
		String name=null;
		Optional<String> optNameOptional=name!=null?Optional.of(name):Optional.empty();
		
		if(optNameOptional.isPresent()) {
			System.out.println("Name is:"+ optNameOptional.get());
		}
		else {
			System.out.println("no matching record");
		}
		
		
		
		optEmp.ifPresent(e->System.out.println(e.getEmpName()));
		Employee defaultEmployee=optEmp.orElse(new Employee("chitra", 23.0));
		optEmp.orElse(defaultEmployee);
		optEmp.orElseThrow(()->new RuntimeException("employee not found"));
	}}
