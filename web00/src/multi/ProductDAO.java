package multi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;

public class ProductDAO { // CRUD

	public ArrayList<ProductVO> list() {
		ResultSet rs = null; // 컬럼명 + 결과 데이터를 담고 있는 테이블

		// 가방들 넣어줄 큰 컨테이너 역할을 하는 부품이 필요! : ArrayList
		// ArrayList<MemberVO> list ==> MemberVO만 들어간 ArrayList라는 의미
		ArrayList<ProductVO> list = new ArrayList<>();

		// 검색결과용 가방(return의 반환값)
		ProductVO bag = null;
		try {
			// 1.mySQL 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");

			// 2.mySQL에 연결해보자.(java --- mySQL)
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. mySQL 연결 성공.");

			String sql = "select * from product";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery(); // select문 전송시 : executeQuery(), 나머지 : executeUpdate()
			System.out.println("4. SQL문 mySQL로 보내기 성공.");
			while (rs.next()) { // 검색결과가 있는지 여부는 rs.next() : row가 있으면 true, 없으면 false값 반환
				String id = rs.getString("id"); // = rs.getString(1);
				String name = rs.getString("name"); // = rs.getString(2);
				String content = rs.getString("content");
				int price = rs.getInt("price");
				String company = rs.getString("company");
				String img = rs.getString("img");

				// 가방을 만들자
				bag = new ProductVO();
				bag.setId(id);
				bag.setName(name);
				bag.setContent(content);
				bag.setPrice(price);
				bag.setCompany(company);
				bag.setImg(img);

				// list에 bag을 추가해주자.
				list.add(bag);
			}
			ps.close();
			rs.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public int login(MemberVO bag) {
		int result = 0;

		try {
			// 1.mySQL 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");

			// 2.mySQL에 연결해보자.(java --- mySQL)
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. mySQL 연결 성공.");

			// ipaddress ==> InetAddress
			// String url = "http://wwww.naver.com";
			// URL u = new URL(url);
			// 자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야 함.
			// PreparedStatement가 SQL부품!!

			String sql = "select * from member where id = ? and pw = ?";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			ResultSet rs = ps.executeQuery(); // select문 전송시 : executeQuery(), 나머지 : executeUpdate()
			System.out.println("4. SQL문 mySQL 보내기 성공.");
			if (rs.next()) { // 검색결과가 있는지 여부는 rs.next() : row가 있으면 true, 없으면 false값 반환
				System.out.println("검색결과 있음.");
				result = 1;
			} else {
				System.out.println("검색결과 없음.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	public ProductVO one(String id) { // select
		System.out.println(id);
		ResultSet rs = null; // 컬럼명 + 결과 데이터를 담고 있는 테이블
		// 기본형(정수,실수,문자,논리)만 값으로 초기화
		// 나머지 데이터형(참조형)은 주소가 들어가 있음.
		// 참조형 변수를 초기화할 떄는 null(주소가 없다라는 의미)

		// 검색결과용 가방(return의 반환값)
		ProductVO bag = null;
		try {
			// 1.mySQL 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");

			// 2.mySQL에 연결해보자.(java --- mySQL)
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. mySQL 연결 성공.");

			// ipaddress ==> InetAddress
			// String url = "http://wwww.naver.com";
			// URL u = new URL(url);
			// 자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야 함.
			// PreparedStatement가 SQL부품!!

			String sql = "select * from product where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery(); // select문 전송시 : executeQuery(), 나머지 : executeUpdate()
			System.out.println("4. SQL문 mySQL로 보내기 성공.");
			if (rs.next()) { // 검색결과가 있는지 여부는 rs.next() : row가 있으면 true, 없으면 false값 반환
				String id2 = rs.getString("id"); // = rs.getString(1);
				String name = rs.getString("name"); // = rs.getString(2);
				String content = rs.getString("content");
				int price = rs.getInt("price");
				String company = rs.getString("company");
				String img = rs.getString("img");

				// 가방을 만들자
				bag = new ProductVO();
				bag.setId(id2);
				bag.setName(name);
				bag.setContent(content);
				bag.setPrice(price);
				bag.setCompany(company);
				bag.setImg(img);
			} else {
				System.out.println("검색결과 없음. 성공.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return bag;
	}

	public int delete(String id) {
		int result = 0;
		try {
			// 1.mySQL 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");

			// 2.mySQL에 연결해보자.(java --- mySQL)
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. mySQL 연결 성공.");

			// ipaddress ==> InetAddress
			// String url = "http://wwww.naver.com";
			// URL u = new URL(url);
			// 자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야 함.
			// PreparedStatement가 SQL부품!!

			String sql = "delete from member where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			result = ps.executeUpdate();
			System.out.println("4. SQL문 mySQL로 보내기 성공.");
			if (result == 1) {
				System.out.println("탈퇴 성공");
			}
			// System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public int update(MemberVO bag) {
		int result = 0;
		try {
			// 1.mySQL 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");

			// 2.mySQL에 연결해보자.(java --- mySQL)
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. mySQL 연결 성공.");

			// ipaddress ==> InetAddress
			// String url = "http://wwww.naver.com";
			// URL u = new URL(url);
			// 자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야 함.
			// PreparedStatement가 SQL부품!!

			String sql = "update member set tel = ? where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, bag.getTel());
			ps.setString(2, bag.getId());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			result = ps.executeUpdate();
			// insert, update, delete문만!! sql문 실행결과가 int
			System.out.println("4. SQL문 mySQL로 보내기 성공.");
			if (result == 1) {
				System.out.println("수정 성공.");
			}
			// System.out.println(result);
			// System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public int insert(ProductVO bag) { // 1. 가방을 받을 값
		int result = 0;

		try {
			// 1.mySQL 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");

			// 2.mySQL에 연결해보자.(java --- mySQL)
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. mySQL 연결 성공.");

			// ipaddress ==> InetAddress
			// String url = "http://wwww.naver.com";
			// URL u = new URL(url);
			// 자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야 함.
			// PreparedStatement가 SQL부품!!

			// public void insert(String id, String pw, String name, String tel)
			String sql = "insert into product values (?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			// con부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
			// R빼고, 인덱스 0부터 시작!!
			// 유일하게 db은 인덱스가 1부터 시작!!
			// 2. 가방에서 값들을 하나씩 꺼내쓰세요.
			ps.setString(1, bag.getId()); // ps.setInt(1, no);
			ps.setString(2, bag.getName());
			ps.setString(3, bag.getContent());
			ps.setInt(4, bag.getPrice());
			ps.setString(5, bag.getCompany());
			ps.setString(6, bag.getImg());
			// ==> insert into hr.MEMBER values ('a','a','a','a');
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			result = ps.executeUpdate(); // 1
			System.out.println("4. SQL문 mySQL로 보내기 성공.");
			if (result == 1) {
				System.out.println("회원가입 성공!");
			}
			// System.out.println(result);
		} catch (Exception e) {
			// insert가 제대로 안된 경우, 위험한 상황이라고 판단하고
			// catch가 실행
			// 실행된 Row수가 없으므로 Result에 0을 넣어주자.!
			// result = 0;
			e.printStackTrace();
		}

		System.out.println(result);
		return result;

	}
}