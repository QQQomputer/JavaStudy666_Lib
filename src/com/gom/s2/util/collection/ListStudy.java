package com.gom.s2.util.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListStudy {

	private final int NUM=1;
	
	public List<String> study5() {//다형성
		
		LinkedList<String>list =new LinkedList<>();
		list.add("1");
		return list;
		
	}
	
	
	
	
	public void study4() {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		
	}
	
	
	
	public void study3() {
		
		//123
		//generic
		//ArrayList<E> 변수명 = new ArrayList<E>();
		//E=Integer
		ArrayList<Integer> ar2 = new ArrayList();
		//add(E e)
		ArrayList<String> ar3 = new ArrayList();
		ar3.add("");
		
		//generic 여기있는 사람은 <>타입만 모여있어요
		//primitive type 불가능
		ArrayList<Integer> ar = new ArrayList();
		
		ar.add(1);
		ar.add(2);
//		ar.add('b');
//		ar.add(3.12);
//		ar.add("iu");
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));				
		}
		
		Object obj = 1;
		int n = (Integer)obj;
		
		int num = ar.get(0);
		
		Integer a = n;
		n=a;
		System.out.println("=============");
		
	}
	
	
	
	
	
	
	public void study2() {
		ArrayList ar = new ArrayList();
		int num = 1;
		Integer n=num;//autoBoxing
		ar.add(n);
		
		ar.add(1);//autoBoxing
		ar.add('a');//autoBoxing
		ar.add(3.12);//autoBoxing
		ar.add("name");
		
	}

	public void study1() {
		int[] numbers = new int[3];
		ArrayList ar = new ArrayList();

		numbers[0] = 1;
		numbers[1] = 2;
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(1, 1000);
		ar.set(0, 100);
		ar.remove(2);
		// ar.clear();

//		System.out.println(numbers[0]);
//		System.out.println(ar.get(1));

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("=============");
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

	}

}
