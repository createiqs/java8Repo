package com.ciq.fun.prgms.after;

import com.ciq.fun.prgms.before.Greeter;
import com.ciq.fun.prgms.before.WelcomeMessageService;

public class FunctionTestMoreMeaningful {

	public static void main(String[] args) {

		WelcomeMessageService message = new WelcomeMessageService();
		String userStatus = "loggedIn";
		Greeter greeter;
		if ("guest".equals(userStatus)) {
			greeter = () -> System.out.println("Welcome to our application, please create an account or log in");
		} else if ("loggedIn".equals(userStatus)) {
			greeter = () -> System.out.println("Welcome back,");
		} else {
			greeter = () -> System.err.println("Unknown user status");
		}

		message.greet(greeter);
	}

}
