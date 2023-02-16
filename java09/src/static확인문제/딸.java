package static확인문제;

public class 딸 {
	String name;
	char gender;
	static int wallet = 10000;
	static int cnt = 0;
	
	public void tv() {
		System.out.println("tv");
	}

	public 딸(String name, char gender) {
		cnt++;
		wallet -= 1000;
		this.name = name;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "딸 [name=" + name + ", gender=" + gender + "]";
	}
}
