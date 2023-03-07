package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MemberUI {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 회원가입 화면");
		f.setSize(600, 500);
		
		JLabel label1 = new JLabel("<<<<회원가입화면>>>>");
		JLabel label2 = new JLabel("아이디");
		JLabel label3 = new JLabel("패스워드");
		JLabel label4 = new JLabel("이름");
		JLabel label5 = new JLabel("전화번호");
		
		JTextField tf1 = new JTextField(10);
		JTextField tf2 = new JTextField(10);
		JTextField tf3 = new JTextField(10);
		JTextField tf4 = new JTextField(10);
		
		JButton b1 = new JButton("회원가입 처리");
		JButton b2 = new JButton("회원탈퇴 처리");
		JButton b3 = new JButton("회원수정 처리");
		JButton b4 = new JButton("회원검색 처리");
		
		// f에 위에 있는 요소들을 add로 붙여주어야하는데, 붙이는 순서대로 물흐르듯이 붙여주고 싶음. 물흐르듯이 붙여주는 부품이 필요
		FlowLayout flow = new FlowLayout();
		//font설정을 하기 위한 부품
		Font font = new Font("궁서", Font.BOLD, 40);
		Font font2 = new Font("궁서", Font.BOLD, 30);
		
		///// 필요한 부품(객체)를 ram에 가져다 놓고, 준비 끝 /////
		/// 조립을 시작해보자! ///
		f.setLayout(flow);
		f.add(label1);
		f.add(label2); f.add(tf1);
		f.add(label3); f.add(tf2);
		f.add(label4); f.add(tf3);
		f.add(label5); f.add(tf4);
		f.add(b1); f.add(b2);
		f.add(b3); f.add(b4);
		
		label1.setFont(font);
		label2.setFont(font);
		label3.setFont(font);
		label4.setFont(font);
		label5.setFont(font);
		tf1.setFont(font);
		tf2.setFont(font);
		tf3.setFont(font);
		tf4.setFont(font);
		b1.setFont(font2);
		b2.setFont(font2);
		b3.setFont(font2);
		b4.setFont(font2);
		
		tf1.setBackground(Color.yellow); tf1.setForeground(Color.blue);
		tf2.setBackground(Color.yellow); tf2.setForeground(Color.blue);
		tf3.setBackground(Color.yellow); tf3.setForeground(Color.blue);
		tf4.setBackground(Color.yellow); tf4.setForeground(Color.blue);
		
		b1.setBackground(Color.pink); b1.setForeground(Color.red);
		b2.setBackground(Color.pink); b2.setForeground(Color.red);
		b3.setBackground(Color.pink); b3.setForeground(Color.red);
		b4.setBackground(Color.pink); b4.setForeground(Color.red);
		
		f.getContentPane().setBackground(Color.green);
		// 맨 끝으로
		f.setVisible(true);
	}

}
