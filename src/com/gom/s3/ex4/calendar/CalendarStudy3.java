package com.gom.s3.ex4.calendar;

import java.util.Calendar;

public class CalendarStudy3 {

	public static void main(String[] args) {
		// 1초 = 1000
		// 1분 = 60초
		// 1시간= 60분
		// 하루 = 24시간
		// 1년 = 365일
		// 1000*60*60*24*365
		int a= 1000 * 60 * 60 * 24 * 365;
		Calendar ca = Calendar.getInstance();

		Calendar ca2 = Calendar.getInstance();
		ca2.set(Calendar.HOUR_OF_DAY, 17);

		System.out.println(ca.getTime());
		System.out.println(ca2.getTime());

		long l1 = ca.getTimeInMillis();
		long l2 = ca2.getTimeInMillis();
		long result = l2 - l1;
		
		Calendar ca3 = Calendar.getInstance();
		
		
		System.out.println(result);
		System.out.println(result/(1000 * 60 * 60));
		
		
		
		
		
		
	}

}
