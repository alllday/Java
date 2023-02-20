package 상속;

import java.io.FileWriter;

public class 예외처리2 {

	public static void main(String[] args) {	
//		FileWriter file = new FileWriter("test.txt");
//		file.write("안녕\n");
//		file.write("바이바이\n");
//		file.close();
		
		// 파일 입출력과 같은 경우 예외처리를 해주지 않으면 에러메시지!
		try {
			FileWriter file = new FileWriter("test.txt");
			file.write("안녕\n");
			file.write("바이바이\n");
			file.close();
		} catch (Exception e) {
			e.printStackTrace(); // 에러원인메시지 출력
		}
	}

}
