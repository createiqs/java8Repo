package com.ciq.streams.prgms;

import java.util.List;

public class MethodRef1 {
	public static void main(String[] args) {
		List<String> musicStyles = List.of("pop", "bengali", "banzra", "foke", "arabic");
		musicStyles.stream().sorted().forEach(System.out::println);
		//this new code does same job,but how it works
		// it works almost same way, execpt the we can't see how the parameter is used
		// so developers of the java had an idea that can we simplify when we just pass
		//a value to lambda expression
		// huge advantage of method ref is that they are compact,
		//easy to read lambda expression for methods that already have a name
	}

}
