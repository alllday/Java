package 배열복습;

public class 스트링과배열3 {

	public static void main(String[] args) {
		String s = "   010-245-1234    ";
		//1)
		String s2 = s.trim();
		//2)
		String[] s3 = s2.split("-"); // s가 아니라 s2로 해야됨! s로하면  s3[0]가 "   010"이렇게 된다.
		//3)
		if (s3[0].equals("011")) {
			System.out.println("SK");
		}else if(s3[0].equals("019")) {
			System.out.println("LG");
		}else {
			System.out.println("Apple");
		}
		//4)
		if (s3[1].length() >= 4) {
			System.out.println("최신폰");
		}else {
			System.out.println("올드폰");
		}
		//5)
		int length = 0;
		for (int i = 0; i < s3.length; i++) {
			length += s3[i].length();
		}
		if (length >= 10) {
			System.out.println("유효한 전화번호");
		}else {
			System.out.println("유효하지 않은 전화번호");
		}
	}
}
