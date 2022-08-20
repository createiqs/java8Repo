package com.ciq.method.streams.prgms;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		System.out.println("2313");
		Map<Integer, Product> smartWatches = new HashMap<>();
		smartWatches.put(1, new Product("Fitness Tracker", "Fast Track", 5000.00, 3.5));
		smartWatches.put(2, new Product("Fossil", "Fast Track", 9500.00, 4.8));
		smartWatches.put(3, new Product("A1 Model", "Morepro", 7000.00, 4.5));
		smartWatches.put(4, new Product("A2 Model", "Morepro", 8000.00, 4.3));
		
		smartWatches.entrySet().stream()
		.forEach(System.out::println);
		
//		smartWatches.entrySet().stream()
//		.filter(p -> p.getValue()!=null && p.getValue().getName().equalsIgnoreCase("Morepro"))
//		.forEach(p ->{
//			Product prv=p.getValue();
//			System.out.println(prv.getBrand()+" _ "+prv.getName()+" _$"+ prv.getPrice());
//		} );
//		.forEach(p -> System.out.println(p.getValue().getName() + " _ " + p.getValue().getBrand() + " - $" + p.getValue().getPrice()));
	}

}
