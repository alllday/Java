package 메서드연습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

//코드정리: 컨트롤 + 쉬프트 + f
public class 나의영화앨범 {

	public static void main(String[] args) {
		String[] title = { "더 퍼스트 슬램덩크", "타이타닉", "아바타: 물의 길", "교섭", "바빌론" };
		String[] img = { "img/001.png", "002.png", "0031.png", "004.png", "005.png" };
		double[] jumsu = { 9.28, 9.72, 8.82, 6.62, 8.85 };
		
		JFrame f = new JFrame();
		f.setSize(516, 530);
		f.getContentPane().setBackground(Color.green);
		
		Font font = new Font("궁서", Font.BOLD, 40); //객체생성를 하는데, 특정한 입력값을 넣지 않으면 못만들게 할 수 있음
		
		//배치부품(객체)를 바꾸어주지 않으면 경계레이아웃을 사용하도록 셋팅
		//BorderLayout
		JLabel  top = new JLabel("영화제목");
		top.setFont(font);
		f.add(top, BorderLayout.NORTH);
		
		JLabel  center = new JLabel("포스터");
		center.setFont(font);
		f.add(center, BorderLayout.CENTER);
		
		JLabel  under = new JLabel("영화평점");
		under.setFont(font);
		f.add(under, BorderLayout.SOUTH);
		
		
		
		f.setVisible(true);
	}
}