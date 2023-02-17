package 상속기본;

public class 볼펜Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		볼펜 b = new 볼펜(500, "모나미", 2);
		학용품 h = new 학용품(600, "모나미");
		
		System.out.println(b);
		System.out.println(h);
		
		b.사다();
		b.글을쓰다();
		h.사다();
	}

}
