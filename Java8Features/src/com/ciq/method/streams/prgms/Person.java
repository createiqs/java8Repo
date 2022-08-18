package com.ciq.method.streams.prgms;


public class Person implements	Comparable<Person> {
//implements	Comparable<Person>
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
	}

	@Override
	public int compareTo(Person o) {
		 
		return this.getAge().compareTo(o.getAge());
	}

 
}
