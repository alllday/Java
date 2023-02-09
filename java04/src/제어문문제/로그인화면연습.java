package 제어문문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 로그인화면연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(300, 500);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JLabel img = new JLabel();
		JLabel text1 = new JLabel();
		text1.setText("아이디 입력");
		JTextField input1 = new JTextField(20);
		JLabel text2 = new JLabel();
		text2.setText("패스워드 입력");
		JTextField input2 = new JTextField(20);
		JLabel text3 = new JLabel();
		text3.setText("이름 입력");
		JTextField input3 = new JTextField(20);
		JLabel text4 = new JLabel();
		text4.setText("전화번호 입력");
		JTextField input4 = new JTextField(20);
		JButton b = new JButton();
		b.setText("회원가입처리");
		
		Font font = new Font("궁서", 1, 20);
		text1.setFont(font);
		text2.setFont(font);
		text3.setFont(font);
		text4.setFont(font);
		
		ImageIcon icon = new ImageIcon("login.png");
		img.setIcon(icon);
		
		input1.setBackground(Color.yellow);
		input2.setForeground(Color.red);
		text3.setForeground(Color.blue);
		b.setBackground(Color.pink);
		
		f.add(img);
		f.add(text1);
		f.add(input1);
		f.add(text2);
		f.add(input2);
		f.add(text3);
		f.add(input3);
		f.add(text4);
		f.add(input4);
		f.add(b);
		f.setVisible(true);
	}

}
