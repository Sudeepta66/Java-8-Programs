package com.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Predicate;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		map.put("AB", 1);
		map.put("AC", 5);
		map.put("AD", 6);
		map.put("AE", 2);
		Set<String> keyList = map.keySet();
		for (String s : keyList) {
			System.out.println(map.get(s));
		}
		map.entrySet().stream().forEach(obj -> {
			System.out.println(obj);
			if (2 % 2 == 0)
				System.out.println("Even");
		});

		List<String> list1 = Arrays.asList("mac", "sudee", "mouse");
		/*
		 * Predicate<String> predicate = t-> { if (t.startsWith("m")) return true; else
		 * return false; };
		 */
		list1.stream().filter(t -> t.startsWith("m")).forEach(t -> System.out.println(t));

		map.entrySet().stream().filter(k -> k.getValue() % 2 == 0).forEach(t -> System.out.println("Even value are " + t));

	}

}
