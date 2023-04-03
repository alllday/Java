package com.multi.mvc200;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

// 테이블 하나당 DAO 하나!
@Component
public class ReplyDAO {
	
	public ArrayList<ReplyVO> list(int bbsno) {
		ResultSet rs = null; // 컬럼명 + 결과 데이터를 담고 있는 테이블

		// 가방들 넣어줄 큰 컨테이너 역할을 하는 부품이 필요! : ArrayList
		// ArrayList<MemberVO> list ==> MemberVO만 들어간 ArrayList라는 의미
		ArrayList<ReplyVO> list = new ArrayList<>();

		// 검색결과용 가방(return의 반환값)
		ReplyVO bag = null;
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

			// 댓글은 특정 하나의 게시물에 대한 리스트이므로 특정 게시물을 가지고 댓글리스트를 가지고 와야 함.
			String sql = "select * from reply where bbsno = ?";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setInt(1, bbsno);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery(); // select문 전송시 : executeQuery(), 나머지 : executeUpdate()
			System.out.println("4. SQL문 mySQL로 보내기 성공.");
			while (rs.next()) { // 검색결과가 있는지 여부는 rs.next() : row가 있으면 true, 없으면 false값 반환
				// 1. 검색결과가 있으면,
				// System.out.println("검색결과 있음. 성공.");
				// 2. 각 컬럼에서 값들을 가져오자
				int no = Integer.parseInt(rs.getString(1));
				int bbsno2 = rs.getInt(2);
				String content = rs.getString(3);
				String writer = rs.getString(4);
				System.out.println(no + " " + bbsno2 + " " + content + " " + writer);

				// 3. 가방을 만들자
				bag = new ReplyVO();
				bag.setNo(no);
				bag.setBbsno(bbsno2);;
				bag.setContent(content);
				bag.setWriter(writer);

				// 4. list에 bag을 추가해주자.
				list.add(bag);
			}
			ps.close();
			rs.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// return id, pw, name, tel -> X
		// return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야 함
		// 검색결과가 있을 때는 bag에는 데이터가 들어있음.
		// 검색결과가 없을 때는 bag에 무엇이 들어가 있나? -> null
		return list;
	}

	public void insert(ReplyVO bag) {
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

			// 3. SQL문 생성

			// String url = "http://www.naver.com
			// URL u = new URL(url);
			// 자바는 부품조립식이여서, String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어 주어야 한다.
			// SQL부품으로 만들어 주어야 함.
			// PreparedStatement가 SQL부품!!

			// (String id, String pw, String name, String tel)
			String sql = "insert into reply(bbsno, content, writer) values (?, ?, ?)";

			// con부품으로 sql스트링에 있는 것을 SQL부품으로 만들어 주세요.
			PreparedStatement ps = con.prepareStatement(sql);

			// R빼고, 인덱스 0부터 시작
			// 유일하게 db는 인덱스가 1부터 시작!
			ps.setInt(1, bag.getBbsno());
			ps.setString(2, bag.getContent());
			ps.setString(3, bag.getWriter());
			System.out.println("3. SQL문 부품(개체)으로 만들어주기");

			// 4. SQL문을 DB프로그램(Oracle, mySQL ...)에 전송
			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
