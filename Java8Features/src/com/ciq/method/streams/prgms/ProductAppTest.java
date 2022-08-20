package com.ciq.method.streams.prgms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductAppTest {

	public static void main(String[] args) {
		List<Product> products = List.of(new Product("xoami", "note 11 pro", 25000.00, 4.0),
				new Product("xoami", "note 11 Ne lite", 25000.00, 3.5), new Product("samsung", "M53", 26000.00, 4.5),
				new Product("samsung", "m52", 25000.00, 3.5), new Product("realme", "9 pro", 25000.00, 3.5),
				new Product("Apple", " 13 pro", 75000.00, 4.0), new Product("IQ", "note 11 pro", 19000.00, 3.5),
				new Product("Redmi", "K 20", 21000.00, 3.0)
				);

		products.stream()
		.filter(p ->p.getRating() <=4.5 && p.getPrice()>= 50000.00 )
		.forEach(System.out::println);

		List<Integer> numbers = List.of(11, 12, 14, 14, 15, 13, 10, 18, 19,16,16,17,17);
		System.out.println(numbers);
		Set<Integer> numbersSet=CollectionTransforms.transform(numbers, HashSet::new);
		System.out.println(numbersSet);

		Set<String> names = Stream.of("ram", "ram","balu", "arun","balu", "arun").collect(Collectors.toCollection(HashSet::new));
		names.stream().forEach(System.out::println);

		Set<Integer> numberns = newHashSet(14, 15, 16,16,17,17, 11, 12, 11, 10, 13);
		numberns.stream().filter(p -> p > 12).forEach(System.out::println);
	}

	public static final <T> Set<T> newHashSet(T... objs) {
		Set<T> set = new HashSet<T>();
		Collections.addAll(set, objs);
		return set;
	}
}
