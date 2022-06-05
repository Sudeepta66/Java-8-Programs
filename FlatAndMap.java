package com.demo;

import java.util.List;
import java.util.stream.Collectors;

public class FlatAndMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customers> customers = EkartCustomerDb.getAll();
		System.out.println("Mob no are "+customers.stream().map(c->c.getEmail()).collect(Collectors.toList()));
		List<String> collect = customers.stream().flatMap(cu->cu.getMobno().stream()).collect(Collectors.toList());
		System.out.println("mob ns are "+collect);
	}

}
