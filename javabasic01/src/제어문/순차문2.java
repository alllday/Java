package 제어문;

import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		// 프로그램 순서 : 입력, 처리, 출력
		//1. 입력
		String data1 = JOptionPane.showInputDialog("당신이 좋아하는 운동은?");
		String data2 = JOptionPane.showInputDialog("당신이 운동하기 좋아하는 요일은?");
		//2. 처리
		String result = data2 + "에 저는 " + data1 + "를 합니다.";
		//3. 출력
		System.out.println(result);
	}

}
