package 확인문제;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 시간활용 {
	static int time1 = 100;
	static int time2 = 500;
	static int i1 = 0;
	static int i2 = 0;
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JLabel l1 = new JLabel("");
		JLabel l2 = new JLabel("");
		
		JTextField t1 = new JTextField("");	
		JTextField t2 = new JTextField("");
		
		
		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(t2);
		
		f.setVisible(true);
	}

}
