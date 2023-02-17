package 상속응용;

public class 별 extends Thread{
	public void run() {
		for (int i = 0; i < 5000; i++) {
			System.out.println(i + " : ★");
		}
	}
}
