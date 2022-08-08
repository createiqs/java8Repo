package com.ciq.fun.prgms;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<Integer> printMultipleNumbers = n -> System.out.println(n * 4);
		printMultipleNumbers.accept(10);

		Consumer<List<Integer>> mulitplyNumbers = l -> {

			for (int i = 0; i < l.size(); i++) {
				l.set(i, l.get(i) * 3);
			}

		};

		List<Integer> numbers = Arrays.asList(5, 4, 3, 2, 1);
		mulitplyNumbers.accept(numbers);
		System.out.println(numbers);
	}

}
