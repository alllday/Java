package 확인문제;

import java.util.Date;

public class 시간1 extends Thread{
	public void run() {
		for (int i = 0; i < 100; i++) {
			시간활용.i1 = i;
			try {
				Thread.sleep(시간활용.time1);
			} catch (Exception e) {
				System.out.println("에러");
			}
		}
	}
}
