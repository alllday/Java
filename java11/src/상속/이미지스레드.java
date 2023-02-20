package 상속;

public class 이미지스레드 extends Thread {

	@Override
	public void run() {
		String[] images = {"img/1.png", "img/2.png", "img/3.png", "img/4.png", "img/5.png"};
		for (int i = 0; i < images.length; i++) {
			System.out.println("이미지>> " + images[i]);
			try {
				Thread.sleep(5000); //5초재워라! //ms(밀리세컨즈)
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김.");
			}
		}
	}
}