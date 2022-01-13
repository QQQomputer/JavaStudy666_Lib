package com.gom.s1.lang.object;

public class ObjectMain {

	public static void main(String[] args) {

		ObjectStudy1 os = new ObjectStudy1();
		os.study1();
		
		Car car = new Car();
		System.out.println("Car : "+car);
		System.out.println(car.toString());
		Object obj = car;
		
		FireCar fc = new FireCar();
		fc.hashCode();
		obj = fc;
		
		System.out.println(car);
		System.out.println(fc);
		
		boolean check = car.equals(fc);
		System.out.println(check);
		
		

	}

}
