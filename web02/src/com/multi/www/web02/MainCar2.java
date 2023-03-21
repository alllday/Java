package com.multi.www.web02;

public class MainCar2 {

	public static void main(String[] args) {
		Car car;
		for (int i = 0; i < 1000; i++) {
			car = new Car("빨강" + i, 10, 200); // 12byte
			System.out.println(car); // 전부 서로 다른 객체라 주소값이 모두 다름
		}
		System.out.println("메모리크기>> " + 12 * 1000);
	}

}
