package 연산자;

public class 산술연산자 {

	public static void main(String[] args) {
		// 산술연산자(사칙연산 + %)
		int x = 20;
		int y = 10;
		
		// 하나라도 문자열이면 '+"는 결합의 기능, 결합연산자
		System.out.println("df" + (x + y));
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);

	}

}
