package 생성자;

public class 은행통장 {
	String name;
	String ssn;
	int money;

	@Override
	public String toString() { // toString 재정의
		return "내돈많은통장 [name=" + name + ", ssn=" + ssn + ", money=" + money + "]";
	}

	public 은행통장(String name, String ssn, int money) {
		this.name = name;
		this.ssn = ssn;
		this.money = money;
	}
	
	
}
