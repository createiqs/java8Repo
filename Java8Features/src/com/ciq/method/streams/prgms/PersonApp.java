package com.ciq.method.streams.prgms;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonApp {
	public static void main(String[] args) {
		List<Person> persons = List.of(new Person("anil", 25), new Person("ram", 29), new Person("balu", 32),
				new Person("sonu", 20), new Person("mahesh", 28));
		System.out.println(persons.stream().sorted().collect(Collectors.toList()));
		persons.stream().sorted().forEach(System.out::println);

//		persons.stream().
//		sorted().
//		forEach(System.out::println);

		persons.stream().sorted((p1, p2) -> p1.getAge().compareTo(p2.getAge())).forEach(System.out::println);
		// instance method ref using a static method ref
		persons.stream().sorted(Comparator.comparing(Person::getAge)).forEach(System.out::println);
		System.out.println("----------------------------");

		persons.stream().sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getName))
				.forEach(System.out::println);
		
		PersonApp papp=new PersonApp();
		
		System.out.println("----------------------------");
		persons.stream().sorted(papp::comparisonByName)
		.forEach(System.out::println);

	}

	public int comparisonByName(Person p1, Person p2) {
		return Comparator.comparing(Person::getName).thenComparing(Person::getAge).compare(p1, p2);

	}
}
