package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

// DB연결테스트2에 있는 insert, delete, update를 함수로 만들기
public class MemberDAO2 {

	public void delete(String id) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이버로드
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");
			
			String sql = "delete from hr.MEMBER where id = ? "; // delete
			PreparedStatement ps = con.prepareStatement(sql); // con부품으로 sql스트링에 있는 것을 SQL부품으로 만들어 주세요.
			ps.setString(1, id);
			System.out.println("3. SQL문 부품(개체)으로 만들어주기");
			
			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void update(String tel, String id) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이버로드
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");
			
			String sql = "update hr.MEMBER set tel = ? where id = ? "; // update
			PreparedStatement ps = con.prepareStatement(sql); // con부품으로 sql스트링에 있는 것을 SQL부품으로 만들어 주세요.
			ps.setString(1, tel);
			ps.setString(2, id);
			System.out.println("3. SQL문 부품(개체)으로 만들어주기");
			
			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void insert(String id, String pw, String name, String tel) {
		try {
			// 1. 커넥터 설정 (오라클 11g와 연결한 부품 설정)
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이버로드
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			// 2. DB연결 (오라클 11g에 연결해보자.(java --- oracle))
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");

			// 3. SQL문 생성

			// String url = "http://www.naver.com
			// URL u = new URL(url);
			// 자바는 부품조립식이여서, String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어 주어야 한다.
			// SQL부품으로 만들어 주어야 함.
			// PreparedStatement가 SQL부품!!

			// (String id, String pw, String name, String tel)
			String sql = "insert into hr.MEMBER values (?, ?, ?, ?)";

			// con부품으로 sql스트링에 있는 것을 SQL부품으로 만들어 주세요.
			PreparedStatement ps = con.prepareStatement(sql);

			// R빼고, 인덱스 0부터 시작
			// 유일하게 db는 인덱스가 1부터 시작!
			ps.setString(1, id);
			ps.setString(2, pw);
			ps.setString(3, name);
			ps.setString(4, tel);
			System.out.println("3. SQL문 부품(개체)으로 만들어주기");

			// 4. SQL문을 DB프로그램(Oracle, mySQL ...)에 전송
			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
