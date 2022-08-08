package com.ciq.fun.prgms.before;

public class WelcomeMessageService {

	public void greet(Greeter greeter) {
//		 System.out.println(" welcome to greeting");
		greeter.perform();
	}

	public static void main(String[] args) {
		WelcomeMessageService message = new WelcomeMessageService();
//		Greeter greeter = new LogedInGreeter();
		Greeter greeter = new GuestUserGreeter();
//		if(isLoggedInUser) {
//			Greeter greeter = new LogedInGreeter();
//		}else {
//			Greeter greeter = new GuestUserGreeter();
//		}
//		
		message.greet(greeter);
	}

}
