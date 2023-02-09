package 반복문;

import javax.swing.JOptionPane;

public class for2 {

	public static void main(String[] args) {
		for(;;) {
			System.out.println("잘 쓰지 않음");
			String data = JOptionPane.showInputDialog("종료할까요?? y를 입력");
			// == 연산자는 기본데이터만 비교 가눙
			// string 부품에서 제공하는 기능을 사용해서 비교해주어야 함.
			if (data.equals("y")) {
				System.out.println("안녕히가세요!");
				break;
			}else {
				
			}
		}
	}

}
