package com.ciq.streams.prgms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class WithoutStreamsPrgm2 {

	public static void main(String[] args) {
		List<String> capitals = new ArrayList<>();
		capitals.add("london");
		capitals.add("new delhi");
		capitals.add("moscow");
		capitals.add("tokyo");
		capitals.add("washington");
		capitals.add("paris");

		System.out.println("capitals: " + capitals);
		Iterator<String> iterator = capitals.iterator();
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("enter capital letter");
//		String input= scanner.next();
		
		while (iterator.hasNext()) {
			String capital = iterator.next();
			if (capital.startsWith("p")) {
				System.out.println(capital);
			}
		}

	}

}
