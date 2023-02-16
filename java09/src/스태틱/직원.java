package 스태틱;

public class 직원 {
	String name;
	int age;
	String gender;
	static int cnt;
	static int sumAge;
	
	// 객체생성하지 않고 클래스이름으로 바로 접근해서 아무 때나 평균을 구하고 싶은 경우
	// static메서드
	public static void getAvg() {
		// static메서드에서 전역변수를 접근할 때는
		// 같은 성격을 가진 static변수만 접근이 가능!
		// System.out.println(name); -> name 부분에서 에러
		System.out.println(sumAge / cnt);
	}
	
	// 
	public 직원(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		cnt++;
		sumAge += this.age;
	}

	@Override
	public String toString() {
		return "static확인문제_class [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
}
