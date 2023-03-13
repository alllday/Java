package 미니프로젝트;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class test {
	public static void main(String[] args) {
		storyDAO dao = new storyDAO();

		JFrame f = new JFrame();
		f.setSize(600, 600);

		JButton b1 = new JButton("유럽");
		JButton b2 = new JButton("아시아");
		JButton b3 = new JButton("아메리카");
		JButton b4 = new JButton("아프리카");
		
		ArrayList<storyVO> list = dao.list();

		String[] header = { "번호", "제목", "내용", "아이디", "지역" };
		Object[][] all = new Object[list.size()][header.length];

		if (list.size() == 0) {
			JOptionPane.showMessageDialog(f, "데이터가 존재하지 않습니다.");
		} else { // ArrayList에 값 넣기 => 테이블 값 저장
			for (int i = 0; i < all.length; i++) {
				all[i][0] = list.get(i).getNo();
				all[i][1] = list.get(i).getTitle();
				all[i][2] = list.get(i).getContent();
				all[i][3] = list.get(i).getId();
				all[i][4] = list.get(i).getRegion();
			}
		}

		// 얘네 다 전역변수 아니야! 액션리스너가 외부 클래스여서~ : 다시정리하기
		JTable table = new JTable(all, header);
		JTable show_table = new JTable(); // 빈테이블 : select보여주기 용
		JScrollPane scroll = new JScrollPane(table);
		
		f.setLayout(new FlowLayout());

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(scroll);
		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<storyVO> list = dao.select(b1.getText());

				String[] header = { "번호", "제목", "내용", "아이디", "지역" };
				Object[][] all = new Object[list.size()][header.length];

				if (list.size() == 0) {
					JOptionPane.showMessageDialog(f, "데이터가 존재하지 않습니다.");
				} else { // ArrayList에 값 넣기 => 테이블 값 저장
					for (int i = 0; i < all.length; i++) {
						all[i][0] = list.get(i).getNo();
						all[i][1] = list.get(i).getTitle();
						all[i][2] = list.get(i).getContent();
						all[i][3] = list.get(i).getId();
						all[i][4] = list.get(i).getRegion();
					}
				}
				
				f.remove(scroll);
				JTable table_select = new JTable(all, header);
				// 이건 비교야... 대입이 아니라 : 비교 할려면 값을 일일히 다 넣던가 주소값으로? 다시 도전해보기
				show_table.equals(table_select); 
				JScrollPane scroll_select = new JScrollPane(table_select);
				scroll.equals(scroll_select);
				f.add(scroll_select);
				f.setVisible(true);
				//f.repaint();
			}
		});
		
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<storyVO> list = dao.select(b2.getText());

				String[] header = { "번호", "제목", "내용", "아이디", "지역" };
				Object[][] all = new Object[list.size()][header.length];

				if (list.size() == 0) {
					JOptionPane.showMessageDialog(f, "데이터가 존재하지 않습니다.");
				} else { // ArrayList에 값 넣기 => 테이블 값 저장
					for (int i = 0; i < all.length; i++) {
						all[i][0] = list.get(i).getNo();
						all[i][1] = list.get(i).getTitle();
						all[i][2] = list.get(i).getContent();
						all[i][3] = list.get(i).getId();
						all[i][4] = list.get(i).getRegion();
					}
				}
				
				
				JTable table_select = new JTable(all, header);
				show_table.equals(table_select);
				JScrollPane scroll_select = new JScrollPane(table_select);
				scroll.equals(scroll_select);
//				f.remove(scroll);
//				f.add(scroll_select);
				f.add(scroll);
				//f.setVisible(true);
				f.repaint();
			}
		});
		
		f.setVisible(true);
	}
}
