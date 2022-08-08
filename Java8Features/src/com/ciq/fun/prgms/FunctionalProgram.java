package com.ciq.fun.prgms;

public class FunctionalProgram {

	public static void main(String[] args) {
		Runnable myRunnable = () -> {
			for (int i = 1; i <= 5; i++) {
				System.out.print(i+" ");
			}
		};

		Thread t1 = new Thread(myRunnable);
		t1.start();
	}
	
	

}
