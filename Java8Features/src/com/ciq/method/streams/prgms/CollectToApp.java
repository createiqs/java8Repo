package com.ciq.method.streams.prgms;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectToApp {
	public static void main(String[] args) {
		List<String> fruits = List.of("apple", "banana", "kiwi", "orange", "kiwi", "apple", "watermelon", "pineapple");
//		fruits.stream()
//		.distinct()
//		.forEach(s->System.out.println(s));

//		Set<String> avlaibleFruits = fruits.stream()
//				.filter(fruit -> fruit.startsWith("w"))
//				.collect(Collectors.toSet());
//		System.out.println(avlaibleFruits);
		
//		Collection<String> fruitBoxes=
//				fruits.stream()
////				.collect(Collectors.toCollection(LinkedList::new));
//				.collect(Collectors.toCollection(TreeSet::new));
//		System.out.println(" tocollection implementation");
//		System.out.println(fruitBoxes);
		
		Map<String, String> fruitsNamesWithUpperCase=
				fruits.stream()
				.distinct()
//				.collect(Collectors.toMap(fruit -> fruit ,  String::toUpperCase));
				.collect(Collectors.toMap(Function.identity() ,  String::toUpperCase));
		System.out.println(fruitsNamesWithUpperCase);
	}

}
