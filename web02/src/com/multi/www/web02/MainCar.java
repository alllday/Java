package com.multi.www.web02;

public class MainCar {

	public static void main(String[] args) {
		Car car = new Car("빨강", 10, 200); // 12byte
		Car car2 = new Car("파랑", 20, 250); // 12byte
		Car car3 = new Car("검정", 30, 300); // 12byte
		System.out.println(car); // toString 없으면 주소확인! 있으면 멤버변수 값
		System.out.println(car2);
		System.out.println(car3);
	}

}
