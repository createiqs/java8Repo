package com.ciq.streams.prgms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class WithoutStreamsPrgm1 {

	public static void main(String[] args) {
		List<Integer> sumOfIntegers = new ArrayList<>();
		sumOfIntegers.add(10);
		sumOfIntegers.add(14);
		sumOfIntegers.add(15);
		sumOfIntegers.add(11);
		sumOfIntegers.add(12);
		sumOfIntegers.add(13);

		int sum = 0;
		Iterator<Integer> iterator = sumOfIntegers.iterator();

		while (iterator.hasNext()) {
			Integer num = iterator.next();
			sum = sum + num;
		}

		System.out.println("sum of integers: " + sum);

		int [] arr= {10, 11, 12, 13, 14, 15};
		int total=Arrays.stream(arr).sum();
		System.out.println("total: "+ total);
		sumOfIntegers.stream().mapToInt(i->i.intValue()).sum();
		sumOfIntegers.stream().mapToInt(Integer::intValue).sum();
		sumOfIntegers.stream().reduce(0, WithoutStreamsPrgm1::sum);
	}
	public static int sum(int a, int b) {
		return a+b;
	}

}
