package 주식정보시스템;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 네이버주식정보시스템 {
	static String 삼성전자 = "005930";
	static String 카카오 = "035720";
	static String 네이버 = "035420";

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 400);
		f.getContentPane().setBackground(Color.green);
		f.setLayout(new FlowLayout());
		Font font = new Font("궁서", Font.BOLD, 40);
		JButton b1 = new JButton("삼성전자");
		JButton b2 = new JButton("카카오");
		JButton b3 = new JButton("네이버");
		JButton b4 = new JButton("크롤링시작");
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);

		b1.setBackground(Color.pink);
		b2.setBackground(Color.orange);
		b3.setBackground(Color.yellow);
		b4.setBackground(Color.red);

		// 액션기능추가
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// 삼성전자코드005930을 주면서
				네이버증권크롤링_코드_종목 c = new 네이버증권크롤링_코드_종목();
				c.naver(삼성전자);
			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// 삼성전자코드005930을 주면서
				네이버증권크롤링_코드_종목 c = new 네이버증권크롤링_코드_종목();
				c.naver(카카오);
			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// 삼성전자코드005930을 주면서
				네이버증권크롤링_코드_종목 c = new 네이버증권크롤링_코드_종목();
				c.naver(네이버);
			}
		});
		JLabel label = new JLabel("CODE");
		label.setFont(font);

		JTextField text = new JTextField(7);
		text.setFont(font);

		b4.addActionListener(new ActionListener() { // JTextField에 적힌 코드종목 정보 크롤링

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// 삼성전자코드005930을 주면서
				네이버증권크롤링_코드_종목 c = new 네이버증권크롤링_코드_종목();
				String code = text.getText();
				c.naver(code);
			}
		});
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(label);
		f.add(text);
		f.add(b4);

		f.setVisible(true);

	}

}
