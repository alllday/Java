package 조건문;

import javax.swing.JOptionPane;

public class 연습문제2 {

	public static void main(String[] args) {
		
		//1.
		String pwd = JOptionPane.showInputDialog("암호를 대시오");
		if(pwd.equals("pass")) {
			System.out.println("들어와");
		}else {
			System.out.println("나가");
		}

		//2.
		String menu = JOptionPane.showInputDialog("저녁 메뉴");
		switch (menu) {
		case "자장면":
			System.out.println("중국집");
			break;
		case "라면":
			System.out.println("분식집");
			break;
		case "회":
			System.out.println("횟집");
			break;
		default:
			System.out.println("안먹어");
			break;
		}
		
		//3.
		String num1 = JOptionPane.showInputDialog("정수입력");
		String num2 = JOptionPane.showInputDialog("정수입력");
		int num11 = Integer.parseInt(num1);
		int num22 = Integer.parseInt(num2);
		
		if (num11 > num22) {
			System.out.println(num11);
		}else if(num11 < num22) {
			System.out.println(num22);
		}else {
			System.out.println("똑같다");
		}
		
		//4. 
		String num = JOptionPane.showInputDialog("사원번호");
		char ch = num.charAt(0);
		
		switch (ch) {
		case 'A':
			System.out.println("기획부");
			break;
		case 'B':
			System.out.println("총무부");
			break;
		case 'C':
			System.out.println("개발부");
			break;
		default:
			System.out.println("해당부서없음");
			break;
		}
	}

}
