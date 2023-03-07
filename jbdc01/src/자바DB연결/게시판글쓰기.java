package 자바DB연결;

import java.util.Scanner;

public class 게시판글쓰기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BBSDAO bd = new BBSDAO();
		System.out.println("no/title/content/writer 순으로 입력하세요.");
		int no = sc.nextInt();
		String title = sc.next();
		String content = sc.next();
		String writer = sc.next();
		
		bd.insert(no, title, content, writer);
	}

}
