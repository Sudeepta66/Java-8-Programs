package com.demo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleFilterMap {
	public static List<Officer> getOfficer() {

		return Stream
				.of(new Officer(101, "ABC@gmail.com", 10000, "A"), new Officer(102, "DCE@gmail.com", 20000, "B"),
						new Officer(102, "DCE@gmail.com", 15000, "A"), new Officer(102, "DCE@gmail.com", 5000, "A"))
				.collect(Collectors.toList());

	}

	public static void main(String[] args) {
		Integer reduce = getOfficer().stream().filter(officer -> officer.getGrade().equalsIgnoreCase("A"))
				.map(c -> c.getSalary()).reduce(0, (a, b) -> a + b);
		System.out.println("salary is " + reduce);

		double asDouble = getOfficer().stream().filter(officer -> officer.getGrade().equalsIgnoreCase("A"))
				.map(c -> c.getSalary()).mapToDouble(i -> i).average().getAsDouble();
		System.out.println("Avgerage is " + asDouble);
	}

}
