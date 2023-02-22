package 인터페이스확인문제;

public class AppleComputer implements Computer{
	public void on() {
		System.out.println("Computer On");
	}
	public void off() {
		System.out.println("Computer Off");
	}
	public void use() {
		System.out.println("Computer Use");
	}
}
