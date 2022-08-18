package com.ciq.streams.prgms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumOfIntegers {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(10, 11, 12, 13, 14, 15);
		Integer sum = integers.stream().reduce(0, (a, b) -> (a + b));

		System.out.println("sum of integers: " + sum);

		int sum1 = integers.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Total : " + sum1);

		int sum3 = integers.stream().mapToInt(i -> i.intValue()).sum();
		System.out.println(" total: " + sum3);

		Stream<Integer> integers2 = Stream.iterate(1, n -> n + 1).limit(10);
		IntStream intStream = integers2.mapToInt(x -> x);
		int sum2 = intStream.sum();
		System.out.println("Total : " + sum2);
		// dot collect function gets all the remaining elements  
		Stream<Integer> inStream=integers.stream().collect(Collectors.toList()).parallelStream();
				System.out.println(inStream.mapToInt(i -> i.intValue()).sum());
	}

}
