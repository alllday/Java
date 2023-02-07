package 조건문;

import java.util.Date;

public class 연습문제 {

	public static void main(String[] args) {
		Date date = new Date();
		int year = date.getYear() + 1900;
		int day = date.getDay();
		int month = date.getMonth() + 1;
		//1.
		if (year >= 2000) {
			System.out.println("밀레니엄o");
		}else {
			System.out.println("밀레니엄x");
		}
		//2.
		switch (day) {
		case 0: case 6:
			System.out.println("쉬자");
			break;
		default:
			System.out.println("공부하자");
			break;
		}
		//3.
		switch (month) {
		case 2:
			for (int i = 1; i < 29; i++) {
				System.out.println(i + "일 ");
			}
			break;
		case 4: case 5: case 9: case 11:
			for (int i = 1; i < 31; i++) {
				System.out.println(i + "일 ");
			}
			break;
		default:
			for (int i = 1; i < 32; i++) {
				System.out.println(i + "일 ");
			}
			break;
		}
		

	}

}
