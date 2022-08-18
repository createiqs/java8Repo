package com.ciq.streams.prgms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreationApp {

	public static void main(String[] args) {
		List<String> musicStyles = List.of("pop", "bengali", "banzra", "foke", "arabic");
		System.out.println(musicStyles.stream().collect(Collectors.toList()));

		System.out.println(musicStyles.stream().sorted().collect(Collectors.toList()));

		musicStyles.stream().sorted().forEach(music -> System.out.println(music));

		System.out.println(Stream.of("pop", "bengali", "banzra", "foke", "arabic").collect(Collectors.toList()));

		System.out.println(Arrays.stream(new double[] { 14.5, 20.5, 66.3 }).count());
		Arrays.stream(new double[] { 14.5, 20.5, 66.3 }).forEach(d -> System.out.println(d));
		
		// with instream
		IntStream.range(0, musicStyles.size()).forEach(m -> System.out.println((m+1)+". " +musicStyles.get(m)));
		
//		IntStream.range(1, 101)
//		.forEach(number -> System.out.println(number+" .Items"));

	}

}
