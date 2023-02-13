package 배열응용;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열 {

	public static void main(String[] args) {
		//1. 프레임을 만들어보세요.
		JFrame f = new JFrame();
		//2. 프레임을 설정해보세요.
		f.setSize(700, 700);
		//	  레이아웃 부품 설정하지 않음
		f.setLayout(null);
		//3. 버튼을 넣을 배열을 먼저 만들어두세요. 500개
		JButton[] buttons = new JButton[500];
		//4. 버튼을 500개 만들어서 배열에 넣어주세요.
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼 : " + i);
		}
		//5. 배열에 있는 버튼을 꺼내서 위치를 지정 후, f에 붙여주세요
		Random r = new Random();
		for (int i = 0; i < buttons.length; i++) {
			int x = r.nextInt(1000) + 1;
			int y = r.nextInt(1000) + 1;
			
			buttons[i].setBounds(x, y, 100, 50);
			f.add(buttons[i]);
		}
		//심화) 버튼색을 몇 가지 지정해서 임의로 설정, 칼라배열\
		Color[] colors = {Color.red, Color.blue, Color.yellow, Color.green, Color.black};
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].setBackground(colors[r.nextInt(5)]);
		}
		//심화2) f에 배경색을 넣어보세요
		f.getContentPane().setBackground(colors[2]);
		
		f.setVisible(true);
	}
}
