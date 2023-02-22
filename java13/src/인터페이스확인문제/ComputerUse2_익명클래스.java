package 인터페이스확인문제;

public class ComputerUse2_익명클래스 {

	public static void main(String[] args) {
		// 인터페이스는 불완전하기때문에 이것을 틀로 해서 객체생성 불가능!
		// Computer com = new Computer(); (x)
		
		// Computer 인터페이스를 구체적으로 구현한 이름없는 클래스를 가지고 객체생성 => 익명클래스
		// new 다음에는 인터페이스가 아닌 클래스가 와야함
		// Computer 자체는 인터페이스지만, Computer(){~}는 익명클래스
		Computer com = new Computer() { // (o)
			
			@Override
			public void use() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void on() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void off() {
				// TODO Auto-generated method stub
				
			}
		};
	}

}
