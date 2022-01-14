package com.gom.s3.ex4.calendar;

import java.util.Calendar;

public class CalendarStudy4 {

	public static void main(String[] args) {
		
		//현재 시간
		
		//태어난 날
		
		//몇일 살았는지
		
		//나이
		
		Calendar ca = Calendar.getInstance();
		Calendar born = Calendar.getInstance();
		born.set(1997, 4, 5);
		System.out.println(born.getTime());
		int d= 1000 * 60 * 60 * 24;
		double y= 1000 * 60 * 60 * 24 * 365.2425;
		long l1 = ca.getTimeInMillis();
		long l2 = born.getTimeInMillis();
		double result = l1-l2;
		
		
		System.out.println("삶을 살아간 일수 : "+result/d);
		System.out.println("나이 : "+(result/y));

	}

}
