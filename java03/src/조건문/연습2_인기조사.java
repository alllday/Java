package 조건문;

import javax.swing.JOptionPane;

public class 연습2_인기조사 {

	public static void main(String[] args) {
		//인기투표 10명 
		//1)아이유 2)뉴진스 3)BTS
		int iu = 0;
		int nj = 0;
		int bts = 0;
		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("1)아이유  2)뉴진스 3)BTS");
			if (data.equals("1")) {
				iu++;
			} else if (data.equals("2")) {
				nj++;
			} else if (data.equals("3")) {
				bts++;
			} else {
				i--;
			}
		}
		System.out.println("아이유 : " + iu + "명");
		System.out.println("뉴진스 : " + nj + "명");
		System.out.println("BTS : " + bts + "명");
	}

}
