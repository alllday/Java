package 인터페이스;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class 문자판독기 {

	public static void main(String[] args) {
		JFrame f = new JFrame("문자판독기");
		f.setSize(300, 500);
		f.getContentPane().setBackground(Color.green);
		// flow라는 변수를 만들어두고, 아래 코드에서 flow를 계속 쓰는 경우
//		FlowLayout flow = new FlowLayout();
//		f.setLayout(flow);

		// 한 번쓰고 아래 코드에서 쓸 일이 없는 경우
		f.setLayout(new FlowLayout());

		Font font = new Font("궁서", Font.BOLD, 30);

		JLabel label = new JLabel("문장을 넣으세요.");
		JTextArea area = new JTextArea(7, 10);
		area.setBackground(Color.pink);
		JButton b1 = new JButton("글자수카운트");
		JButton b2 = new JButton("배경색바꾸기");
		b2.setForeground(Color.cyan);
		JButton b3 = new JButton("글자색바꾸기");

		// 1. 글자수 카운트
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String text = area.getText();
				JOptionPane.showMessageDialog(f, "글자수는 : " + text.length());
				area.setText("");
			}
		});
		// 2. 배경색 바꾸기
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				area.setBackground(Color.white);
			}
		});
		// 3. 글자색 바꾸기
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				area.setForeground(Color.red);
			}
		});
		
		label.setFont(font);
		area.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);

		f.add(label);
		f.add(area);
		f.add(b1);
		f.add(b2);
		f.add(b3);

		f.setVisible(true);
	}

}
