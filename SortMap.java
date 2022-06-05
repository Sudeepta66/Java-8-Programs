package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("ABC", 12);
		map.put("DEF", 8);
		map.put("PQ", 5);
		map.put("LMN", 89);

		List<Entry<String, Integer>> entrySet = new ArrayList<>(map.entrySet());

		// Start doing through traditional/Anonymous class
		Collections.sort(entrySet, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getKey().compareTo(o2.getKey());
			}
		});
		// End doing through traditional/Anonymous class
		Collections.sort(entrySet, (o1, o2) -> o2.getKey().compareTo(o1.getKey())); // Sorting through Lambda
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println("sorted map is " + entry.getKey() + " value is " + entry.getValue());
		}
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println); // sorting through
																									// stream

		Map<Employee,Integer> employeeMap = new HashMap<>();
		employeeMap.put(new Employee(101,"ABC",100000), 60);
		employeeMap.put(new Employee(121,"PQR",300000), 300);
		employeeMap.put(new Employee(111,"JKL",200000000), 70);
		employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(System.out::println);
	}

}
