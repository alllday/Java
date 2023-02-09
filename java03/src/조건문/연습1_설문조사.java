package 조건문;

import javax.swing.JOptionPane;

public class 연습1_설문조사 {

	public static void main(String[] args) {
		// 10명에게 배부른가요?? 물어봐서
		// 배부르다고 한 사람, 배부르지 않다고 한 사람 몇 명인지 카운트
		int f = 0;
		int nf = 0;
		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("배부른가? : 1 / 배부르지 않는가? : 2");
			if (data.equals("1")) {
				f++;
			} else if (data.equals("2")) {
				nf++;
			} else {
				i--;
			}
		}
		System.out.println("배불 : " + f + "명");
		System.out.println("안배불 : " + nf + "명");

	}

}
