package 자바DB연결;

import java.util.Scanner;

public class 게시판글삭제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BBSDAO bd = new BBSDAO();
		System.out.println("no를 입력하세요.");
		int no = sc.nextInt();
		
		bd.delete(no);

	}

}
