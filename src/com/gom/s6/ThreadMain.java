package com.gom.s6;

public class ThreadMain {

	public static void main(String[] args) {
		
		Thread t1 = new Thread1();
		Thread t2 = new Thread2();
		
		t1.start();
		t1.start();
		

	}

}
