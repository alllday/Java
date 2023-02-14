package 부품응용하기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class login {

	public static void main(String[] args) {
		// jframe, imageicon, image_label, id_laber, pw_label
		// id_input, pw_input, login_btn, reset_btn
		// font, flowlayout
		// 어떤 요소들이 들어가는지 먼저 틀을 짜놓고 코드작성!
		JFrame f = new JFrame();
		f.setTitle("내 일기장");
		f.setSize(600, 800);
		f.getContentPane().setBackground(Color.pink);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("궁서", 1, 30);
		
		JLabel top = new JLabel();
		// id, pw 두 가지 방식
		JLabel id = new JLabel("아   이   디 : ");
		JLabel pw = new JLabel();
		pw.setText("패 스 워 드 : ");
	
		id.setFont(font);
		pw.setFont(font);
		
		// 이미지 절대경로, 상대경로 적용해보기
		ImageIcon icon1 = new ImageIcon("diary.png");
		ImageIcon icon2 = new ImageIcon("login_logo.png");
		ImageIcon icon3 = new ImageIcon("reset.png");
		top.setIcon(icon1);
		
		JTextField idText = new JTextField(10);
		JTextField pwText = new JTextField(10);
		idText.setFont(font);
		pwText.setFont(font);
		idText.setHorizontalAlignment(JTextField.CENTER);
		pwText.setHorizontalAlignment(JTextField.CENTER);
		JButton login = new JButton();
		JButton reset = new JButton();
		login.setIcon(icon2);
		reset.setIcon(icon3);
		login.setBackground(Color.white);
		reset.setBackground(Color.white);
		
		//1) 버튼에 액션기능을 add
		//2) 클릭했을 때 어떤 부품이 처리를 담당할 지 new로 만들어주세요.
		//3) 클릭했을 때 어떻게 처리할지를
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// reset을 눌렀을 때 idText, pwText에 공백을 넣어라
				idText.setText("");
				pwText.setText("");
				
			}
		}); // reset add end
		
		login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// idText, pwText에 getText()
				String id2 = idText.getText(); // "root"
				String pw2 = pwText.getText(); // "1234"
				// root, 1234인지 비교해서 로그인 성공,실패 JOptionpane으로 출력!
				if (id2.equals("root") && pw2.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인 성공");
					//일기장쓰기 부품의 open()기능을 쓰자!
					diary diary = new diary();
					diary.open(); // 메서드 사용 -> 메서드 호출!
					f.setVisible(false);
				}else {
					JOptionPane.showMessageDialog(f, "로그인 실패");
				}
				
			}
		}); // login add end
		
		f.add(top);
		f.add(id); f.add(idText);
		f.add(pw); f.add(pwText);
		f.add(login); f.add(reset);
		
		
		f.setVisible(true);
	}

}
