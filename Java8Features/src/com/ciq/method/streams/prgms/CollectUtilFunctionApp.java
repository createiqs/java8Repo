package com.ciq.method.streams.prgms;

import java.util.List;
import java.util.stream.Collectors;

public class CollectUtilFunctionApp {

	public static void main(String[] args) {
		List<String>playerNames =List.of("sachin", "dravid", "ganguly");
		List<Integer>  playerInjured=List.of(12,20,15,120,30,16,40,20,100);
		List<Double>playerInjuredDouble=List.of(12.0,20.0,15.0,120.0,30.0,16.0,40.0,20.0,100.0);
		
		System.out.println("playerNames: "+String.join(",", playerNames));
//		System.out.println("playerInjured: "+String.join(",", playerInjured));
		System.out.println("playerInjured: "+playerInjured.stream()
//		.map(injure ->" "+ injure)
//		.collect(Collectors.joining(", "))
//				);
//		.map(injure ->injure.toString())
		.map(Object::toString)
		.collect(Collectors.joining(", "))
		 		);
		
		Long numberOfInjuries=playerInjured.stream()
				.collect(Collectors.counting());
		System.out.println("numberOfInjuries: "+numberOfInjuries);
		
		Integer overallInjured=playerInjured.stream()
				.collect(Collectors.summingInt(i -> i.intValue()));
		System.out.println("overallDamage: "+ overallInjured);
		
		Double overallInjuredDouble=playerInjuredDouble.stream()
				.collect(Collectors.summingDouble(d -> d.doubleValue()));
		
		System.out.println("overallInjuredDouble: "+ overallInjuredDouble);
		
		Double overallInjuredAvg=playerInjuredDouble.stream()
				.collect(Collectors.averagingDouble(d -> d.doubleValue()));
		
		System.out.println("overallInjuredAvg: "+ overallInjuredAvg);
		

		System.out.println("statistics : "+ playerInjured.stream().
				collect(Collectors.summarizingDouble(Integer::doubleValue)).getMax()
				);
	}

}
