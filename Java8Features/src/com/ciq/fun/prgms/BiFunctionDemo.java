package com.ciq.fun.prgms;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Double> getPow = (numberOne, numberTwo) -> Math.pow(numberOne, numberTwo);
		System.out.println(getPow.apply(5, 2));

		BiFunction<Integer, Integer, List<Integer>> numbers = (size, multiply) -> {

			List<Integer> generatedList = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				generatedList.add(i * multiply);
			}

			return generatedList;
			
			 	

		};
		
		System.out.println(numbers.apply(10, 2));

	}

}
