package com.gom.s1.lang.object;

public class ObjectStudy1 {

	public void study1() {
		System.out.println("Study1");
		
		//Object 객체를 생성하고 주소출력
		Object obj = new Object();
		System.out.println(obj);
		int num = obj.hashCode();
		System.out.println(num);
		
		String str = obj.toString();
		System.out.println(str);

//		public Object clone(obj) {
//			return obj.clone
//		};
		
	}
	
	
	
}
