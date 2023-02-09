package 조건문;

import java.util.Scanner;

public class 확인문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1
//		System.out.print("id : ");
//		String id = sc.next();
//		System.out.print("pw : ");
//		String pw = sc.next();
//		
//		if (id.equals("root") && pw.equals("1234")) {
//			System.out.println("로그인 성공");
//		} else {
//			System.out.println("로그인 실패");
//		}
		
		// 2
//		System.out.print("사과 구매 개수 / 사과 개당 가격 : ");
//		int app_n = sc.nextInt();
//		int app_p = sc.nextInt();
//		System.out.print("딸기 구매 개수 / 딸기 개당 가격 : ");
//		int stb_n = sc.nextInt();
//		int stb_p = sc.nextInt();
//		int app_t = app_n * app_p;
//		int stb_t = stb_n * stb_p;
//		System.out.println("사과 구매 가격은 " + app_t + "원입니다.");
//		System.out.println("딸기 구매 가격은 " + stb_t + "원입니다.");
//		System.out.println("전체 구매 가격은 " + (app_t + stb_t) + "원입니다.");
		
		//3
//		System.out.print("시작값 / 종료값 : ");
//		int start = sc.nextInt();
//		int end = sc.nextInt();
//		int sum = 0;
//		for (int i = start; i <= end; i++) {
//			sum += i;
//		}
//		System.out.println("결과 : " + sum);
		
		//4
		System.out.print("시작값 / 종료값  / 점프값 : ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		int jump = sc.nextInt();
		int sum = 0;
		for (int i = start; i <= end; i+=jump) {
			if (sum > 100) {
				break;
			}
			sum += i;
		}
		System.out.println("결과 : " + sum);
	}

}
