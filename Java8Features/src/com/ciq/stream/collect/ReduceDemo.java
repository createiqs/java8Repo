package com.ciq.stream.collect;

import java.util.List;

public class ReduceDemo {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(10, 20, 30, 40, 50);
		double result = numbers.stream().mapToInt(i -> i.intValue()).sum();
		System.out.println(result);
		double total = numbers.stream().
				map(Integer::intValue).reduce(-5, Integer::sum);
		System.out.println(total);
	}

}
