package com.ciq.stream.collect;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectGroupingByApp {
	public static void main(String[] args) {
		List<Item> fruitBoxes = List.of(

				new Item("Strawberry", 10, 75.00), new Item("blueberry", 10, 75.00), new Item("pear", 10, 450.00),
				new Item("apple", 10, 75.00), new Item("kiwi", 10, 110.00), new Item("pear", 10, 450.00),
				new Item("apple", 10, 285.00), new Item("apple", 10, 300.00)

		);

//		Map<Boolean, List<Item>> partitionFruitBoxes = fruitBoxes.stream()
//				.collect(Collectors.partitioningBy(fruitBox -> fruitBox.getPrice() > 85));
//		System.out.println(" fruit boxes cheaper and more expensives`");
//		partitionFruitBoxes.entrySet().stream().forEach(v -> System.out.println(v.getKey()+ " "+ v.getValue()));
		
		Map<String, List<Item>> groupByFruitBoxes = fruitBoxes.stream()
				.collect(Collectors.groupingBy( Item:: getName));
		System.out.println(" fruit boxes group by`");
		System.out.println(groupByFruitBoxes);
//		groupByFruitBoxes.entrySet().stream().forEach(v -> System.out.println(v.getKey()+ " "+ v.getValue()));

		
		Map<String, Long> fruitBoxesCounting = fruitBoxes.stream()
				.collect(Collectors.groupingBy( Item:: getName, Collectors.counting()));
		System.out.println(" fruit boxes counting");
		System.out.println(fruitBoxesCounting);
		
		
	}

}
