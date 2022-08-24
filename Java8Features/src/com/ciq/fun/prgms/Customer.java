package com.ciq.fun.prgms;

import java.util.function.Consumer;

public class Customer {

	private String name;
	private int phoneNumber;

	public Customer(String name, int phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	static boolean isPhoneNumberValid(int phoneNumber) {
		if (phoneNumber >= 10 && phoneNumber != 0)
			return true;
		return false;
	}

	public static void main(String[] args) {
		Customer customer = new Customer("maria", 124561);

		Consumer<Customer> greetCustomer = c -> System.out
				.println("Hello " + c.name + " thanks for registering " + c.phoneNumber);

		greetCustomer.accept(customer);

		System.out.println(isPhoneNumberValid(1232321456));

//		Consumer<Integer> isPhoneNumberValid = phoneNumber -> ;
//		  isPhoneNumberValid.accept(234561230);
		 
	}

}
