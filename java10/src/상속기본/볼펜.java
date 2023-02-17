package 상속기본;

public class 볼펜 extends 학용품{
	//두께
	//글을쓰다()
	int 두께;
	
	public void 글을쓰다() {
		System.out.println("글");
	}

	public 볼펜(int 가격, String 회사, int 두께) {
		super(가격, 회사);
		this.두께 = 두께;
	}

	@Override
	public String toString() {
		return "볼펜 [두께=" + 두께 + ", 가격=" + 가격 + ", 회사=" + 회사 + "]";
	}
}
