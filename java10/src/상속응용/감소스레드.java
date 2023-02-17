package 상속응용;

public class 감소스레드 extends Thread{
	public void run() {
		for (int i = 5000; i > 0; i--) {
			System.out.println("감소>> " + i);
		}
	}
}
