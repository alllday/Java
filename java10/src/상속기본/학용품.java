package 상속기본;

public class 학용품 {
	//가격,회사
	//사다()
	int 가격;
	String 회사;
	
	public void 사다() {
		System.out.println("구매");
	}

	public 학용품(int 가격, String 회사) {
		super();
		this.가격 = 가격;
		this.회사 = 회사;
	}

	@Override
	public String toString() {
		return "학용품 [가격=" + 가격 + ", 회사=" + 회사 + "]";
	}

}
