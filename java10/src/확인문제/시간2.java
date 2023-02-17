package 확인문제;

public class 시간2 extends Thread{
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(시간활용.time2);
			} catch (Exception e) {
				System.out.println("에러");
			}
			// 시간활용에 있는 jlabel text를 바꾸고 싶은데 어떻게..?ㄴ
		}
	}
}
