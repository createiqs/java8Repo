package com.ciq.fun.prgms.after;

import com.ciq.fun.prgms.before.Greeter;
import com.ciq.fun.prgms.before.GuestUserGreeter;
import com.ciq.fun.prgms.before.WelcomeMessageService;

public class FunctionalProgrammingApp {

	public static void main(String[] args) {

		WelcomeMessageService message = new WelcomeMessageService();

		Greeter greeter = new GuestUserGreeter();
		Greeter loggedInUserGreeter = () -> System.out.println("welcome Back,");

//		message.greet(loggedInUserGreeter);
//		greeter.perform();
//		loggedInUserGreeter.perform();

		// OR
//		message.greet(() -> System.out.println("welcome Back,"));
	}

}

interface MyFunctionType {
	void myFunction();
}
