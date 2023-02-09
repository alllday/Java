package 복습;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 제어문정리 {

	public static void main(String[] args) {
//		Scanner사용해주세요.!
		Scanner sc = new Scanner(System.in);
//		1.id와 pw를 입력해서 id가 root이고, pw가 1234이면 로그인 성공!
//		  아니면 로그인 실패!
//		  ==> String은 ==비교 불가능. equals() 비교해야함.
		System.out.print("id : ");
		String id = sc.next();
		System.out.print("pw : ");
		String pw = sc.next();
		
		if (id.equals("root") && pw.equals("1234")) {
			JOptionPane.showMessageDialog(null, "로그인성공");
		} else {
			System.out.println("로그인 실패");
		}
//		2. 사과 구매 갯수, 사과 한 개당 가격입력
//		   딸기 구매 갯수, 딸기 한 개당 가격입력
//		   다음과 같이 출력
//		   사과 구매 가격은 5500원입니다.
//		   딸 구매 가격은 4500원입니다.
//		   전체 구매 가격은 10000원입니다.
//		System.out.print("사과 구매 개수 / 사과 개당 가격 : "); // 하나씩 받아도 되는데 편의상 2개씩 받음~
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
//		3. 심화문제
//		   - 시작값, 종료값 입력
//		   시작값부터 종료값까지 모두 더해서 출력
//		System.out.print("시작값 / 종료값 : ");
//		int start = sc.nextInt();
//		int end = sc.nextInt();
//		int sum = 0;
//		for (int i = start; i <= end; i++) {
//			sum += i;
//		}
//		System.out.println("결과 : " + sum);
//		4. 심화문제
//		   - 시작값, 종료값, 점프값 입력
//		     시작값부터 종료값까지 점프값만큼 증가하면서 더함. 더한 값을 출력
//		     더한 값이 100을 넘으면 프로그램 종료
		System.out.print("시작값 / 종료값  / 점프값 : ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		int jump = sc.nextInt();
		int sum = 0;
		
		for (int i = start; i <= end; i+=jump) {
			sum += i;
			if (sum >= 100) {
				System.exit(0);
			}
		}
		System.out.println("결과 : " + sum);
		
		sc.close();
	}

}
