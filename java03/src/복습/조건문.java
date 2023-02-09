package 복습;

import javax.swing.JOptionPane;

public class 조건문 {

	public static void main(String[] args) {
		int target = 77;
		int me = 88;
		
		// 조건은 비교하는 코드가 들어감. 결과가 무조건 논리형(true/false)
		// if는 조건이 만족하면 처리하고 더 이상 실행x, 자체break기능
		if (target == me) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
		}
		
		// switch case자체는 break가 없음
		// 멈추고 싶은 곳에 break사용해야 함
		String you = "신나";
		switch (you) {
		case "로또":
			System.out.println("정답");
			break;
		case "신나": case "놀자": case "나가자":
			System.out.println("오답");
		default:
			System.out.println("그만해");
			break;
		}

	}

}
