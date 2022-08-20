package com.ciq.method.streams.prgms;

import java.util.List;
import java.util.stream.Collectors;

public class MapFuncitons {
	public static void main(String[] args) {
		List<String> names=List.of("aladdin", "chiru", "cnu", "charan");
		List<String> capatilized=names.stream()
				.map(name -> name.substring(0, 1).toUpperCase()+ name.substring(1))
				.collect(Collectors.toList());
		
		System.out.println(capatilized);
		
		System.out.println("-------------------");
		
		List<Product> products = List.of(new Product("xoami", "note 11 pro", 25000.00, 4.0),
				new Product("xoami", "note 11 Ne lite", 25000.00, 3.5), new Product("samsung", "M53", 26000.00, 4.5),
				new Product("samsung", "m52", 25000.00, 3.5), new Product("realme", "9 pro", 25000.00, 3.5),
				new Product("Apple", " 13 pro", 75000.00, 4.0), new Product("IQ", "note 11 pro", 19000.00, 3.5),
				new Product("Redmi", "K 20", 21000.00, 3.0)
				);
		
		List<String> productNames=products.stream()
//				.map(name ->name.getBrand())
				.map(Product::getName)
				.collect(Collectors.toList());
		System.out.println(productNames);
		
		List<Product> productNamesPrices=products.stream()
				.map(pr -> new Product(pr.getBrand(), pr.getName(), pr.getPrice()* 1.5, pr.getRating()) 
				).collect(Collectors.toList());
		
		System.out.println(productNamesPrices);

	}

}
