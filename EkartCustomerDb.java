package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartCustomerDb {

	public static List<Customers> getAll()
	{
		return Stream.of(
				new Customers("ABC","ABC@gmail.com",Arrays.asList("123","456")),
				new Customers("BCD","BCD@gmail.com",Arrays.asList("678","456"))
				).collect(Collectors.toList());
	}
}
