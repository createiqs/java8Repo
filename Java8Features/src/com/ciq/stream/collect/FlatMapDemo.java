package com.ciq.stream.collect;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {

	public static void main(String[] args) {

		Integer[][] lotteryNumbers = new Integer[][] { { 5, 23, 54, 60, 22 }, { 15, 2, 34, 77, 81 },
				{ 5, 7, 89, 63, 52 } };

		List<Integer> lotteryNumberSet = Stream.of(lotteryNumbers).flatMap(Stream::of).distinct()
				.collect(Collectors.toList());
		System.out.println(lotteryNumberSet);

		List<Integer> list1 = Arrays.asList(1, 2, 3);
		List<Integer> list2 = Arrays.asList(4, 5, 6);
		List<Integer> list3 = Arrays.asList(7, 8, 9);

		List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);

		List<Integer> listOfAllNumbers = listOfLists.stream().flatMap(l -> l.stream()).collect(Collectors.toList());

		System.out.println(listOfAllNumbers);

		List<List<String>> fruits = List.of(List.of("apple", "banna", "lemon"), List.of("plum", "mango", "kiwi")

		);
		List<String> listOfFruits = fruits.stream().flatMap(Collection::stream).collect(Collectors.toList());
		System.out.println(listOfFruits);

		List<WeatherByMonth> weatherReports=List.of(
				new WeatherByMonth("jan", 33, 23),
				new WeatherByMonth("feb", 35, 22),
				new WeatherByMonth("march", 38, 26),
				new WeatherByMonth("april", 45, 36)
				
				);
//		weatherReports.stream()
//		.flatMap(m -> m.getMonth().stream())
//		 .collect(Collectors.toList());
//		fruits.stream()
//		.flatMap(fruitsList -> )
//		List<CarDealership> carDealerships = List.of(
//                new CarDealership("Brand New Dealership", List.of("Dodge", "Ford", "Ferrari")),
//                new CarDealership("Total Car Ltd.", List.of("Kia", "Toyota", "Ford")),
//                new CarDealership("Crashed Dealership", List.of("Ford", "Lexus", "Ferrari")));
//        List<String> availableCarBrands = carDealerships.stream()
//                .map(CarDealership::getCarBrands)
//                .flatMap(Collection::stream)
//        		.flatMsp(cd ->cd.getBrands().stream())
//                .distinct()
//                .collect(Collectors.toList());
//        System.out.println("Available car brands: " + availableCarBrands);
	}

}
