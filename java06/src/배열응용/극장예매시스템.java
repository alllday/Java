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

public class 극장예매시스템 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("극장예매시스템");
		f.setSize(400, 400);
		f.getContentPane().setBackground(Color.red);
		//배치해주는 부품 - FlowLayout
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		//버튼 배열 많이 만들어서 집어 넣은 배열 생성
		JButton[] btn = new JButton[100];
		Font font = new Font("궁서", Font.BOLD, 20);
		
		JLabel result = new JLabel("결과 보이는 곳");
		result.setForeground(Color.blue);
		result.setFont(font);
		
		//예약 여부를 저장하는 배열
		int[] seat = new int[btn.length]; // {0,0,0,0,0,0..} 10개 배열
		//각 자리에 저장된 값이 0이면 아직 예약x 1이면 예약o
		
		
		
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i + "");
			f.add(btn[i]);
			btn[i].setFont(font);
			
			//버튼에 액션기능 추가
			//1) 액션 기능 추가
			//2) 추가 --> 클릭했을 때 어떤 부품이 담당할지 부품 생성
			//3) 클릭했을 때 어떻게 처리할지 코딩해주면 됨.
			btn[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					//e.getActionCommand(); : 클릭한 버튼의 글자를 가지고 와줌.
					String text = e.getActionCommand();
					System.out.println(text);
					int no = Integer.parseInt(text);
					btn[no].setEnabled(false);
					btn[no].setBackground(Color.red);
					//이미 해당 좌석번호가 1로 저장되어 있는지 확인하고, 1이 아니면 예약가능, 1이면 예약 불가
					if (seat[no] == 1) {
						result.setText("예약불가");
					} else {
						seat[no] = 1;
						result.setText(text + "번 예약완료.");
//						btn[no].setEnabled(false);
//						btn[no].setBackground(Color.red);
					}
				}
			});
		}
		f.add(result);
		
		JButton total = new JButton("전체 예약 내역");
		total.setBackground(Color.blue);
		total.setForeground(Color.yellow);
		total.setFont(font);
		
		f.add(total);
		
		total.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int cnt = 0;
				for (int i : seat) {
					if (i == 1) {
						cnt++;
					}
				}
				JOptionPane.showMessageDialog(f, (cnt * 10000) + "원 결제하시면 됩니다.");
			}
		});
		f.setVisible(true);
	}

}
