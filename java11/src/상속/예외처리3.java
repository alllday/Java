package 상속;

import java.io.FileWriter;

public class 예외처리3 {

	public static void main(String[] args) {	
		// 아래 코드를 분석, 에러가 발생했을 때 실행을 제외시키고 프로그램이 중단되지 않도록 해보세요.
		
		int[] num = new int[3];
		
		
		try {
			num[3] = 2;
		} catch (Exception e) {
			System.out.println("배열에 문제가 있음");
			//e.printStackTrace();
		}
		
		System.out.println(num.length);
	}

}
