package 상속응용;

public class 별이름증가감소스레드 {

	public static void main(String[] args) {
		별 별 = new 별();
		이름 이름 = new 이름();
		감소스레드 감소 = new 감소스레드();
		증가스레드 증가 = new 증가스레드();
		
		감소.start();
		증가.start();
		별.start();
		이름.start();

	}

}
