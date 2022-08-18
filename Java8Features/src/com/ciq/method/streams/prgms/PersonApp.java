package com.ciq.method.streams.prgms;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonApp {
	public static void main(String[] args) {
		List<Person> persons = List.of(new Person("anil", 25), new Person("ram", 29), new Person("balu", 32),
				new Person("sonu", 20), new Person("mahesh", 28));
		System.out.println(persons.stream().sorted().collect(Collectors.toList()));
		persons.stream().
		sorted().
		forEach(System.out::println);
		
//		persons.stream().
//		sorted().
//		forEach(System.out::println);
		
		persons.stream()
		.sorted((p1, p2 ) -> p1.getAge().compareTo(p2.getAge()))
		.forEach(System.out::println);
		
		persons.stream()
		.sorted(Comparator.comparing(Person::getAge))
		.forEach(System.out::println);
	}

}
