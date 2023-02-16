package 스태틱;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 카운터프로그램 {
	static int cnt = 0;
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton btn1 = new JButton("1더하기");
		JButton btn2 = new JButton("0으로 초기화");
		JButton btn3 = new JButton("1빼기");
		JLabel num = new JLabel();
		Font font = new Font("궁서", 1, 20);
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cnt++;
				num.setText(cnt + "");
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cnt = 0;
				num.setText(cnt + "");
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cnt--;
				num.setText(cnt + "");
			}
		});
		
		num.setFont(font);
		
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(num);
		f.setVisible(true);
	}

}
