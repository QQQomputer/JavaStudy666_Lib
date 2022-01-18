package com.gom.s6;

public class Thread2 extends Thread {

	@Override
	public void run() {

		for(int i='a';i<'z';i++) {
			for(int j=0;j<1000000000;j++) {}
			System.out.println("Alpa : "+i);
		}
		
	}

	
	
	
}
