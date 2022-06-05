package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SortEmpList {
	public static List<Employee> getEmployees() {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "ABC", 51000));
		empList.add(new Employee(102, "cde", 40000));
		empList.add(new Employee(131, "PQ", 60000));
		return empList;

	}

	public static List<Employee> getTaxableUser() {
		// return
		// getEmployees().stream().filter(emp->emp.getSalary()>50000).collect(Collectors.toList());
		Predicate predicate = (emp) -> ((Employee) emp).getSalary() > 50000;

		return (List<Employee>) getEmployees().stream().filter(predicate).collect(Collectors.toList());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("taxable users are " + getTaxableUser());
		List<Employee> employees = getEmployees();
		Collections.sort(employees, (emp1, emp2) -> emp2.getSalary() - emp1.getSalary()); // Doing through lambda
		// Start: Doing through Anonymous
		Collections.sort(employees, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getSalary() - o2.getSalary();
			}
		}); // //End: Doing through Anonymous
		employees.stream().sorted((emp1, emp2) -> emp2.getSalary() - emp1.getSalary())
				.forEach(emp -> System.out.println("Sorted using Stream " + emp));// Doing through Stream

		employees.stream().sorted((emp1, emp2) -> emp2.getSalary() - emp1.getSalary()).forEach(System.out::println);// Doing
																													// through

		System.out.println("Sorted by descending " + employees);
	}

}
