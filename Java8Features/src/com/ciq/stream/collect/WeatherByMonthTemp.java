package com.ciq.stream.collect;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WeatherByMonthTemp {

	public static void main(String[] args) {
		List<WeatherByMonth> weatherAverages = List.of(

				new WeatherByMonth("January", 24, 16), new WeatherByMonth("February", 24, 16),
				new WeatherByMonth("March", 23, 15), new WeatherByMonth("April", 20, 13),
				new WeatherByMonth("May", 18, 10), new WeatherByMonth("June", 15, 8), new WeatherByMonth("July", 14, 7),
				new WeatherByMonth("August", 15, 8), new WeatherByMonth("September", 16, 10),
				new WeatherByMonth("October", 18, 11), new WeatherByMonth("November", 20, 12),
				new WeatherByMonth("December", 22, 15)

		);

		WeatherByMonth byMonthMaxTemp = weatherAverages.stream()
				.max(Comparator.comparing(WeatherByMonth::getDayTimeTemperture)).get();
		System.out.println(byMonthMaxTemp);

		WeatherByMonth byMonthMinTemp = weatherAverages.stream()
				.min(Comparator.comparing(WeatherByMonth::getDayTimeTemperture)).get();
		System.out.println(byMonthMinTemp);

		
	  
//		String averageCelcious = weatherAverages.stream().collect(Collectors.teeing(
//				Collectors.maxBy(Comparator.comparing(WeatherByMonth::getDayTimeTemperture)),
//				Collectors.minBy(Comparator.comparing(WeatherByMonth::getNightTimeTemperature)),
//				(max, min) -> max.get().getDayTimeTemperture() + "°C" + min.get().getNightTimeTemperature() + "°C"
//				));
//		System.out.println("The highest and the lowest temperature in India: " + averageCelcious);
	}

}
