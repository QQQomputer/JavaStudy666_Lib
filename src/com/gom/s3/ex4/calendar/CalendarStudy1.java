package com.gom.s3.ex4.calendar;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarStudy1 {

	public static void main(String[] args) {
		// Calendar는 추상 클래스
		// GregorianCalendar 가 Calendar 클래스 상속
		// Calendar의 메서드는 GregorianCalendar에 있다
		
		GregorianCalendar gc = new GregorianCalendar();
		
		Calendar calendar = new GregorianCalendar();
		
		Calendar ca = Calendar.getInstance();
		
		
		int y = ca.get(Calendar.YEAR);
		int m = ca.get(Calendar.MONTH);
		int d = ca.get(Calendar.DATE);
		int h = ca.get(Calendar.HOUR);
		int hh = ca.get(Calendar.HOUR_OF_DAY);
		int mm = ca.get(Calendar.MINUTE);
		int s = ca.get(Calendar.SECOND);
		int ms = ca.get(Calendar.MILLISECOND);
		//ms = s * 1/1000
		
		System.out.println(""+y+(m+1)+d+"\n"+hh+":"+mm+":"+s);
		System.out.println(ms);
		long millis = ca.getTimeInMillis();
		System.out.println(millis);
		
		Date date = ca.getTime();
		System.out.println(date);
		
		
//		System.out.println(gc);
//		System.out.println(calendar);
//		System.out.println(ca);
		

	}

}
