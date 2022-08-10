package com.ciq.obj.methods;

public class Demo {

	private int id;

	public Demo(int id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "Demo [id=" + id + "]";
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method");
	}	
	
	

	public static void main(String[] args) {
		 
		for (int i = 1; i < 10000; i++) {
		System.out.println(new Demo(i));
		}
//		System.gc();
	}

}
