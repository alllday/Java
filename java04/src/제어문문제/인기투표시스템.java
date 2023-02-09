package 제어문문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 인기투표시스템 {
	static int n1_cnt = 0; // main이 아니라 main밖에 넣어줘야 됨! static을 넣어줘야 되는 이뉴는 알지?(클래스내에서 공유)
	public static void main(String[] args) {
		// 1. 각 다른 이미지 어떻게 동일하게 하는지
		// 
		
		JFrame f = new JFrame();
		f.setSize(600, 800);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.getContentPane().setBackground(Color.gray);
		
		JLabel title = new JLabel();
		title.setText("K-POP 인기 투표");
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		JLabel n1 = new JLabel();
		n1.setText("1. 아이유-라일락");
		JLabel n2 = new JLabel();
		n2.setText("2. 프로미스나인-wego");
		JLabel n3 = new JLabel();
		n3.setText("3. 스테이시-asap");
		JLabel n4 = new JLabel();
		JLabel n5 = new JLabel();
		JLabel n6 = new JLabel();
		
		Font font = new Font("궁서체", 1, 40);
		Font font2 = new Font("궁서체", 1, 20);
		
		ImageIcon icon1 = new ImageIcon("iu.jpg");
		ImageIcon icon2 = new ImageIcon("wego.jpg");
		ImageIcon icon3 = new ImageIcon("asap.jpg");
		
		title.setFont(font);
		n1.setFont(font2);
		n2.setFont(font2);
		n3.setFont(font2);
		n4.setFont(font);
		n5.setFont(font);
		n6.setFont(font);
		n4.setForeground(Color.red);
		n5.setForeground(Color.red);
		n6.setForeground(Color.red);
		b1.setIcon(icon1);
		b2.setIcon(icon2);
		b3.setIcon(icon3);
		
		f.add(title);
		f.add(b1);
		f.add(n1);
		f.add(n4);
		f.add(b2);
		f.add(n2);
		f.add(n5);
		f.add(b3);
		f.add(n3);
		f.add(n6);
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				n1_cnt++;
				n4.setText(String.valueOf(n1_cnt));
			}
			
		});
		b2.addActionListener(new ActionListener() {
			int n2_cnt = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				n2_cnt++;
				n5.setText(String.valueOf(n2_cnt));
			}
			
		});
		b3.addActionListener(new ActionListener() {
			int n3_cnt = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				n3_cnt++;
				n6.setText(String.valueOf(n3_cnt));
			}
			
		});
		
		f.setVisible(true);
		
//		Scanner sc = new Scanner(System.in);
//		int sel = 0;
//		int iu = 0;
//		int bts = 0;
//		int njs = 0;
//		
//		while(true) {
//			System.out.print("1)아이유 2)방탄 3)뉴진스 4)종료 >> ");
//			sel = sc.nextInt();
//			if (sel == 1) {
//				iu++;
//			}else if(sel == 2) {
//				bts++;
//			}else if(sel == 3) {
//				njs++;
//			}else if (sel == 4){
//				break;
//			}else {
//				System.out.println("다시 1~4번까지 입력해주세요.");
//			}
//		}
//		System.out.println("시스템을 종료합니다.");
//		System.out.println("----------------");
//		System.out.println("아이유 : " + iu + "표");
//		System.out.println("BTS : " + bts + "표");
//		System.out.println("뉴진스 : " + njs + "표");
//		System.out.println("----------------");
//		sc.close();
	}
}
