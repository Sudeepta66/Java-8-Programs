package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo  {

	public static void main(String[] args) {
		Supplier<String> supplier	=	() ->  "Hi World";
		System.out.println(supplier.get());
		List<String> myList = Arrays.asList("w","w","y","z");
		System.out.println(myList.stream().findAny().orElseGet(supplier));
	}



		
	

}
