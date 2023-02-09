package 복습;

import javax.swing.JOptionPane;

public class 순차문 {

	public static void main(String[] args) {
		// 입력 -> 처리 -> 출력
		// 두 개의 숫자를 입력 받아서 처리, 출력
		// 손으로 치는 값은 모두 다 스트링으로 취급
		// 입력
		String n1 = JOptionPane.showInputDialog("숫자1입력");
		String n2 = JOptionPane.showInputDialog("숫자2입력");
		
		// 처리
		int n11 = Integer.parseInt(n1);
		int n22 = Integer.parseInt(n2);
		
		//출력
		// 자바에서 정수와 정수의 연산결과는 무조건 정수!
		// 하나라도 실수면 결과는 무조건 실수
		System.out.println((double)n11 / n22);
		System.out.printf("%.3f", (double)n11 / n22);
		

	}

}
