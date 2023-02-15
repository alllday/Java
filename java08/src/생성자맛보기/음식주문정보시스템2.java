package 생성자맛보기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 음식주문정보시스템2 {
	static int result = 0;
	static int totalPrice = 0;
	public static void main(String[] args) {
		//심화
		//1) 버튼을 클릭했을 때, 각 음식의 주문량을 체크해서 f의 title로 보여주세요
		//   f.setTitle(~~)
		//2) 음식의 값을 다 분리
		int[] price = { 7000, 6000, 5000 };
		int[] cnt = {0, 0, 0};
		String[] imgList = { "img/001.png", "img/002.png", "img/003.png" };

		JFrame f = new JFrame();
		f.setSize(420, 500);
		f.getContentPane().setBackground(Color.cyan);
		f.setTitle("슬램덩크 : " + cnt[0] + "개 타이타닉 : " + cnt[1] + "개 아바타 : " + cnt[2] + "개");

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("궁서", Font.BOLD, 20);

		JButton btn1 = new JButton("슬램덩크");
		btn1.setBackground(Color.red);
		JButton btn2 = new JButton("타이타닉");
		btn2.setBackground(Color.orange);
		JButton btn3 = new JButton("아바타");
		btn3.setBackground(Color.green);

		JLabel num = new JLabel("개수 : ");
		num.setFont(font);
		JTextField total = new JTextField();
		total.setText(result + "개");
		total.setBackground(Color.yellow);
		total.setFont(font);
		JLabel img = new JLabel();
		ImageIcon icon = new ImageIcon(imgList[0]);
		img.setIcon(icon);
		JLabel sum = new JLabel("결제금액 : " + totalPrice + "원");
		sum.setFont(font);
		
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				result++;
				total.setText(result + "개");
				ImageIcon icon = new ImageIcon(imgList[0]);
				img.setIcon(icon);
				totalPrice += price[0];
				sum.setText("결제금액 : " + totalPrice + "원");
				cnt[0]++;
				f.setTitle("슬램덩크 : " + cnt[0] + "개 타이타닉 : " + cnt[1] + "개 아바타 : " + cnt[2] + "개");
			}
		});
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				result++;
				total.setText(result + "개");
				ImageIcon icon = new ImageIcon(imgList[1]);
				img.setIcon(icon);
				totalPrice += price[1];
				sum.setText("결제금액 : " + totalPrice + "원");
				cnt[1]++;
				f.setTitle("슬램덩크 : " + cnt[0] + "개 타이타닉 : " + cnt[1] + "개 아바타 : " + cnt[2] + "개");
			}
		});
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				result++;
				total.setText(result + "개");
				ImageIcon icon = new ImageIcon(imgList[2]);
				img.setIcon(icon);
				totalPrice += price[2];
				sum.setText("결제금액 : " + totalPrice + "원");
				cnt[2]++;
				f.setTitle("슬램덩크 : " + cnt[0] + "개 타이타닉 : " + cnt[1] + "개 아바타 : " + cnt[2] + "개");
			}
		});

		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(num);
		f.add(total);
		f.add(img);
		f.add(sum);

		f.setVisible(true);
	}
}
