package 상속응용;

public class 스레드2 extends Thread{
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("@");
		}
	}
}
