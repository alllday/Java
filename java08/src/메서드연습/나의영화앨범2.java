package 메서드연습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//코드정리: 컨트롤 + 쉬프트 + f
public class 나의영화앨범2 {

	public static void main(String[] args) {
		String[] title = { "더 퍼스트 슬램덩크", "타이타닉", "아바타: 물의 길", "교섭", "바빌론" };
		String[] img = { "img/001.png", "img/002.png", "img/003.png", "img/004.png", "img/005.png" };
		double[] jumsu = { 9.28, 9.72, 8.82, 6.62, 8.85 };
		
		JFrame f = new JFrame();
		f.setSize(516, 530);
		f.getContentPane().setBackground(Color.green);
		
		Font font = new Font("궁서", Font.BOLD, 40); //객체생성를 하는데, 특정한 입력값을 넣지 않으면 못만들게 할 수 있음
		Font font2 = new Font("궁서", Font.BOLD, 30); 
		
		//배치부품(객체)를 바꾸어주지 않으면 경계레이아웃을 사용하도록 셋팅
		//BorderLayout
		JLabel  top = new JLabel(title[2]);
		top.setHorizontalAlignment(0);
		top.setForeground(Color.red);
		top.setFont(font);
		f.add(top, BorderLayout.NORTH);
		
		JLabel  center = new JLabel();
		//center.setFont(font);
		ImageIcon icon = new ImageIcon(img[2]);
		//이미지붙히는 다른방법?
		center.setIcon(icon);
		f.add(center, BorderLayout.CENTER);
		
		JLabel  under = new JLabel(String.valueOf(jumsu[2]));
		under.setHorizontalAlignment(0);
		under.setForeground(Color.blue);
		under.setFont(font);
		f.add(under, BorderLayout.SOUTH);
		
		JButton left = new JButton("왼  쪽");
		left.setBackground(Color.yellow);
		left.setFont(font2);
		f.add(left, BorderLayout.WEST);
		
		JButton right = new JButton("오른쪽");
		right.setBackground(Color.yellow);
		right.setFont(font2);
		f.add(right, BorderLayout.EAST);
		
		//프로그램 끝나면 자동으로 exit
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
	}
}