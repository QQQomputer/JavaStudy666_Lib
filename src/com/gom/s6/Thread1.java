package com.gom.s6;

public class Thread1 extends Thread{

	@Override
	public void run() {

		for(int i=0;i<10;i++) {
			for(int j=0;j<1000000000;j++) {}
			System.out.println("i : "+i);
		}
		
		
		super.run();
	}
	
	
	
}
