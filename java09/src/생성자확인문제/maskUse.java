package 생성자확인문제;

public class maskUse {
	public static void main(String[] args) {
		mask m1 = new mask("흰색", 3000, 5);
		mask m2 = new mask("검정색", 2500, 2);
		
		System.out.println(m1);
		System.out.println(m2);
	}
}
