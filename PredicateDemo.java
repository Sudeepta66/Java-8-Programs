package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo  {

	public static void main(String[] args) {

		Predicate<Integer> predicate = (arg0) -> arg0 % 2 == 0;

		System.out.println(predicate.test(5));
		
		List<Integer> myList=Arrays.asList(12,3,78,5,90);
		myList.stream().filter((arg0) -> arg0 % 2 == 0).forEach( t -> System.out.println("even are" +t));
		
	}


	
		
	


}