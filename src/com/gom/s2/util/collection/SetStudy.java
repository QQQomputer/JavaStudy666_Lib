package com.gom.s2.util.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetStudy {
	Random random = new Random();
	public void study4() {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		
		Iterator<Integer> it = hs.iterator();
		
		while(it.hasNext()) {
			int num = it.next();
			System.out.println(num);			
		}
		
	}
	
	public void study3() {
		HashSet<Integer> hs = new HashSet<>();
		
		while(hs.size()!=6) {
			hs.add(random.nextInt(45)+1);
		}
		System.out.println(hs);
		
		
	}
	
	
	
	public void study2() {
		//random
		

		//Lotto 번호를 랜덤, 1-45 6개를 모두 뽑고 list 담아서		
		int num = random.nextInt(45)+1;//0~10미만
				
		ArrayList<Integer> ar = new ArrayList<>();
		//어레이를 중복되지 않게끔 중복되면 i가 올라가지 않게끔
		for(int i=0;i<6;i++) {
			ar.add(random.nextInt(45)+1);						
		}
		System.out.println(ar);
		System.out.println("");
		

		

	}
	
	
	public void study1() {
		
		
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(1);
		hs.remove(2);
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(100);
		ar.add(200);
		ar.add(100);
		//ar.remove(2);
		System.out.println(ar);
		System.out.println(ar.size());
		System.out.println(hs);
		System.out.println(hs.size());
		
		
	}
	
	
}
