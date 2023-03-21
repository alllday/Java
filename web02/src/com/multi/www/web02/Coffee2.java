package com.multi.www.web02;

// 주석한거랑 안한거랑 동일! 표현이 조금 다를뿐
public class Coffee2 {
//	int price;
//	String name;
	int price = 1000;
	String name = "에스프레소";
	
	public static Coffee2 c;
	
	public static Coffee2 getInstance() {
		if (c == null) {
//			c = new Coffee2(1000, "에스프레소");
			c = new Coffee2();
		}
		return c;
	}
	
//	private Coffee2(int price, String name) {
//		this.price = price;
//		this.name = name;
//	}
	private Coffee2() {
		
	}

}
