package 미니프로젝트;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class storyUI {
	public static JTable table;
	public static JTable show_table; // 빈테이블 : select보여주기 용
	public static JScrollPane scroll;

	public static void main(String[] args) {
		storyDAO dao = new storyDAO();

		JFrame f = new JFrame();
		f.setSize(500, 600);

		JButton b1 = new JButton("유럽");
		JButton b2 = new JButton("아시아");
		JButton b3 = new JButton("아메리카");
		JButton b4 = new JButton("아프리카");
		JButton b5 = new JButton("전체글");
		JLabel l = new JLabel("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		JLabel l2 = new JLabel("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");		
		JTextField t1 = new JTextField(7);
		JTextField t2 = new JTextField(7);
		JTextField t3 = new JTextField(7);
		JTextField t4 = new JTextField(7);
		JTextField t5 = new JTextField(7);
		JButton b6 = new JButton("등록");
		JButton b7 = new JButton("수정");
		JButton b8 = new JButton("삭제");

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

		table = new JTable(all, header);
		scroll = new JScrollPane(table);

		f.setLayout(new FlowLayout());

		f.add(b5); f.add(b1); f.add(b2); f.add(b3); f.add(b4);
		f.add(l);
		f.add(t1); f.add(t2); f.add(t3); f.add(t4); f.add(t5);
		f.add(b6); f.add(b7); f.add(b8);
		f.add(l2);
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
				show_table = new JTable(all, header);
				scroll = new JScrollPane(show_table);
				f.add(scroll);
				f.setVisible(true);
				// f.repaint();
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

				f.remove(scroll);
				show_table = new JTable(all, header);
				scroll = new JScrollPane(show_table);
				f.add(scroll);
				f.setVisible(true);
				// f.repaint();
			}
		});
		
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<storyVO> list = dao.select(b3.getText());

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
				show_table = new JTable(all, header);
				scroll = new JScrollPane(show_table);
				f.add(scroll);
				f.setVisible(true);
				// f.repaint();
			}
		});
		
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<storyVO> list = dao.select(b4.getText());

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
				show_table = new JTable(all, header);
				scroll = new JScrollPane(show_table);
				f.add(scroll);
				f.setVisible(true);
				// f.repaint();
			}
		});

		b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
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

				f.remove(scroll);
				show_table = new JTable(all, header);
				scroll = new JScrollPane(show_table);
				f.add(scroll);
				f.setVisible(true);
				// f.repaint();
			}
		});

		b6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int no = Integer.parseInt(t1.getText());
				String title = t2.getText();
				String content = t3.getText();
				String id = t4.getText();
				String region = t5.getText();

				storyDAO dao = new storyDAO();
				storyVO bag = new storyVO();

				bag.setNo(no);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setId(id);
				bag.setRegion(region);

				int result = dao.insert(bag);
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");

				// 상단(지역) 버튼누르면 테이블이랑 입력창 위치
				// 바뀌는거 수정하고,(setbound)
				if (result == 1) {
					System.out.println("등록성공");
				} else {
					System.out.println("등록실패");
				}
			}
		});

		b7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int no = Integer.parseInt(t1.getText());
				String title = t2.getText();
				String content = t3.getText();
				String id = t4.getText();
				String region = t5.getText();

				storyDAO dao = new storyDAO();
				storyVO bag = new storyVO();

				bag.setNo(no);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setId(id);
				bag.setRegion(region);

				int result = dao.update(bag);
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");

				// 상단(지역) 버튼누르면 테이블이랑 입력창 위치
				// 바뀌는거 수정하고,(setbound)
				if (result == 1) {
					System.out.println("수정성공");
				} else {
					System.out.println("수정실패");
				}
			}
		});

		b8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int no = Integer.parseInt(t1.getText());
			
				storyDAO dao = new storyDAO();

				int result = dao.delete(no);
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");

				// 상단(지역) 버튼누르면 테이블이랑 입력창 위치
				// 바뀌는거 수정하고,(setbound)
				if (result == 1) {
					System.out.println("삭제성공");
				} else {
					System.out.println("삭제실패");
				}
			}
		});

		// 1. 등록,수정,삭제 버튼이 바로 업데이트 되게
		// 2. 위치
		f.setVisible(true);
	}
}
