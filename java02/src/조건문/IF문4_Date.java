package 조건문;

import java.util.Date;

public class IF문4_Date {

	public static void main(String[] args) {
		//Date - 년월일시분초, java.util.Date
		Date date = new Date();
		System.out.println("분 : " + date.getMinutes());
		System.out.println("초 : " + date.getSeconds());
		System.out.println("일 : " + date.getDate());
		System.out.println("요일 : " + date.getDay()); // 요일! 0(일요일)부터 시작
		System.out.println("년 : " + (date.getYear() + 1900)); // 1900년을 기준으로 몇년이 지났는지 (2000년엔 세상이 멸망할줄 ㅋㅋ)
		
		int hour = date.getHours(); // 오래된거여서 줄그어진거! 다른거 사용하길 바라는 것임
		//int hour = 15;
		System.out.println("시 : " + hour);
		
		if (hour < 11) {
			System.out.println("굿모닝");
		}else if (hour < 14) {
			System.out.println("굿에프터눈");
		}else if (hour < 20) {
			System.out.println("굿이브닝");
		}else {
			System.out.println("굿나잇");
		}
		
		int month = date.getMonth() + 1; // getMonth는 음력기준이기 때문에 -1로 나옴
		System.out.println("월 : " + month);
		//int month = 2;
		
		
		switch (month) {
		case 3: case 4: case 5: 
			System.out.println("봄");
			break;
		case 6: case 7: case 8: 
			System.out.println("여름");
			break;
		case 9: case 10: case 11: 
			System.out.println("가을");
			break;
		default:
			System.out.println("겨울");
			break;
		}
		
	}
}
