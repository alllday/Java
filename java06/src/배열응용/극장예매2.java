package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 극장예매2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 700);
		f.getContentPane().setBackground(Color.cyan);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		Font font = new Font("궁서", Font.BOLD, 20);

		JButton[] btn = new JButton[100]; // 버튼이 들어갈 배열 틀만 만든거지 버튼하나씩은 아직 안만든 상태!
		int[] seat = new int[btn.length]; // 예매한 좌석확인 배열
		JButton check = new JButton("결제확인");
		JLabel label = new JLabel("결과");
		
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton();
			btn[i].setText(i + "");
			btn[i].setFont(font);
			btn[i].setBackground(Color.pink);
			btn[i].setForeground(Color.magenta);
			f.add(btn[i]);
			
			btn[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String text = e.getActionCommand();
					int num = Integer.parseInt(text);
					
					if (seat[num] == 1) {
						label.setText("예약완료된 좌석, 선택불가");
					}else {
						seat[num] = 1;
						btn[num].setBackground(Color.red);
						btn[num].setText("예약불가");
						btn[num].setForeground(Color.blue);
						btn[num].setEnabled(false);
						label.setText("예약완료 " + num + "번 좌석");
						//btn[num].setEnabled(false);
					}
				}
			});
		}
		
		check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int sum = 0;
				for (int i : seat) {
					if (i == 1) {
						sum++;
					}
				}
				JOptionPane.showMessageDialog(f, (sum*10000) + "원 결제하셔야 됩니다.");
			}
		});
		
		label.setFont(font);
		label.setForeground(Color.green);
		check.setFont(font);
		check.setBackground(Color.BLACK);
		f.add(check);
		f.add(label);
		f.setVisible(true);

	}

}
