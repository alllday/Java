package 상속기본;

public class 커피전문점 extends 매니저{

	public static void main(String[] args) {
		매니저 m = new 매니저();
		m.name = "손종일";
		m.address = "강서구";
		m.rrn = "980101";
		m.bonus = 50;
		m.test();
		System.out.println(m);

	}

}
