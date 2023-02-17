package 상속응용;

public class 증가스레드 extends Thread{
	public void run() {
		for (int i = 0; i < 5000; i++) {
			System.out.println("증가>> " + i);
		}
	}
}
