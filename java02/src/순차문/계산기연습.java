package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 계산기연습 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 700);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		ImageIcon icon = new ImageIcon("cal.jpg");
		
		JLabel label1 = new JLabel();
		label1.setIcon(icon);
		JLabel label2 = new JLabel();
		label2.setText("숫자1");
		JLabel label3 = new JLabel();
		label3.setText("숫자2");
		JTextField text1 = new JTextField(13);
		JTextField text2 = new JTextField(13);
		Font font = new Font("굴림", 1, 35);
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		JButton b4 = new JButton();
		b1.setText("+");
		b2.setText("-");
		b3.setText("*");
		b4.setText("/");
		
		b1.setBackground(Color.blue);
		b2.setBackground(Color.blue);
		b3.setBackground(Color.blue);
		b4.setBackground(Color.blue);
		b1.setForeground(Color.red);
		b2.setForeground(Color.red);
		b3.setForeground(Color.red);
		b4.setForeground(Color.red);
		text1.setBackground(Color.yellow);
		text2.setBackground(Color.yellow);
		
		label2.setFont(font);
		label3.setFont(font);
		text1.setFont(font);
		text2.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		f.add(label1);
		f.add(label2);
		f.add(text1);
		f.add(label3);
		f.add(text2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		f.setVisible(true);
	}

}
