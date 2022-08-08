package com.ciq.fun.prgms;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerDemo {

	public static void main(String[] args) {

		BiConsumer<String, Integer> printAttributes = (text, n) -> System.out.println(text + n);
		printAttributes.accept("Points: ", 10);
		printAttributes.accept("Price$: ", 10000);

		BiConsumer<List<Integer>, Integer> mulitplyNumbers = (list, number) -> {

			for (int i = 0; i < list.size(); i++) {
				list.set(i, list.get(i) * number);
			}

		};

		List<Integer> numbers = Arrays.asList(5, 4, 3, 2, 1);
		mulitplyNumbers.accept(numbers, 5);
		System.out.println(numbers);

	}

}
