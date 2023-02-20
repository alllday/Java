package 상속;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame{

	public static void main(String[] args) {
		new CarGame();
	}
	
	public CarGame() {
		setTitle("자동차 경주");
		setSize(700, 500);
		setLayout(null);
		
		MyThread car1 = new MyThread("img/car01.png", 100, 0);
		MyThread car2 = new MyThread("img/car02.png", 100, 150);
		MyThread car3 = new MyThread("img/car03.png", 100, 300);
		
		car1.start();
		car2.start();
		car3.start();
		
		setVisible(true);
	}
	
	public class MyThread extends Thread{
		int x, y;
		JLabel label;
		
		public MyThread(String file, int x, int y) {
			this.x = x;
			this.y = y;
			ImageIcon icon = new ImageIcon(file);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 150, 150);
			add(label);
		}
		@Override
		public void run() {
			for (int i = 0; i < 200; i++) {
				// 동시에 실행하고 싶은 내용
				// 모든 스레드가 오른쪽으로 움직이고 싶음.
				// 화면에서 오른쪽으로 움직이는 것은 x를 늘려주는 것.
				Random r = new Random();
				int move = r.nextInt(50);
				x += move;
				label.setBounds(x, y, 150,150);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
