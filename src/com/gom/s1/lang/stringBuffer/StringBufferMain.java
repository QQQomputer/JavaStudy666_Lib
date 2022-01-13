package com.gom.s1.lang.stringBuffer;

public class StringBufferMain {

	public static void main(String[] args) {
		// iu lee
		StringBuffer sb = new StringBuffer();
		sb.append("iu");
		sb.append("lee");
		System.out.println(sb.toString());//주소가 안나옴 >> 오버라이딩
		
		String name1="iu";
		String name2="lee";
		name1=name1+name2;
		
		
		// name1=sb;// 이건 불가능
		name1=sb.toString();
		System.out.println(name1);
		name1.equals(sb);
		System.out.println(name1.equals(sb));
	}

}
