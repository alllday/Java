package 스태틱;

public class Day {
	String doing;
	int time;
	String location;
	static int cnt = 0; // static변수는 모든 객체가 공유
	static int sumTime = 0; // static변수나 함수는 객체를 따로 생성하지 않아도 사용할 수 있다!
	
	public Day(String doing, int time, String location) {
		// new로 부품을 만드는 것(객체생성)
		// 객체생성할 떄마다 꼭 처리하고 싶은 내용이 있으면
		// 생성자 메서드내에서 써주세요
		// 객체생성할 때 생성자메서드가 자동호출되기때문에 무조건 처리해줌
		cnt++;
		this.doing = doing;
		this.time = time;
		this.location = location;
		sumTime += time;
	}

	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
}