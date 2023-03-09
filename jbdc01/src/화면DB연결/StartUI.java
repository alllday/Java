package 화면DB연결;

import javax.swing.JOptionPane;

import 자바DB연결.MemberDAO3;

public class StartUI {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("아이디 입력");
		String pw = JOptionPane.showInputDialog("패스워드 입력");
		
		MemberDAO3 dao = new MemberDAO3();
		MemberVO bag = new MemberVO();
		
		bag.setId(id);
		bag.setPw(pw);
		int result = dao.login(bag);
		
		if (result == 0) {
			System.out.println("로그인실패");
			MemberUI2.main(args);
		}else {
			System.out.println("로그인성공");
			BBS_UI.main(args);
		}
	}

}
