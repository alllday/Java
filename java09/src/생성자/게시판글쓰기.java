package 생성자;

public class 게시판글쓰기 {

	public static void main(String[] args) {
		Bbs bbs1 = new Bbs(1, "자바", "오늘은 생성자하는 날", "홍길동");
		Bbs bbs2 = new Bbs(2, "JSP", "오늘은 웹프로그램 날", "김길동");
		Bbs bbs3 = new Bbs(3, "Spring", "오늘은 실무 웹프로그램 날", "박길동");
		
		System.out.println(bbs1);
		System.out.println(bbs2);
		System.out.println(bbs3);
	}

}
