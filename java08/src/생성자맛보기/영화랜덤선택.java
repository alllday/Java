package 생성자맛보기;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 영화랜덤선택 {
	final static String[] title = {"슬램덩크", "타이타닉", "아바타"};
	final static double[] mark = {9.88, 9.76, 9.61};
	final static String[] img = {"img/001.png", "img/002.png", "img/003.png",};
	final static int[] score = {300, 980, 1300};
	
	public static void main(String[] args) {
	
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.setTitle("영화랜덤선택프로그램");
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton btn = new JButton("영화랜덤선택");
		JButton btn2 = new JButton("프로그램종료");
		JLabel img2 = new JLabel();
		ImageIcon icon = new ImageIcon("img/dog.png");
		img2.setIcon(icon);
		JLabel title2 = new JLabel("제목");
		JLabel mark2 = new JLabel("평점");
		JLabel score2 = new JLabel("관객수");
		
		btn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Random r = new Random();
				int rNum = r.nextInt(3);
				ImageIcon icon = new ImageIcon(img[rNum]);
				img2.setIcon(icon);
				title2.setText(title[rNum]);
				mark2.setText(mark[rNum] + "");
				score2.setText(score[rNum] + "만명");
			}
		});
		
		// 레이아웃 만져보기!
//		f.add(btn, BorderLayout.NORTH);
//		f.add(img2, BorderLayout.WEST);
//		f.add(title2, BorderLayout.CENTER);
//		f.add(mark2, BorderLayout.EAST);
		f.add(btn);
		f.add(btn2);
		f.add(img2);
		
		f.add(title2);
		f.add(mark2);
		f.add(score2);
		f.setVisible(true);
	}

}
