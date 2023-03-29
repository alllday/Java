package com.multi.mvc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Component;

@Component
public class BookDAO {
	public void delete(int id) {
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

			String sql = "delete from book where id = ? "; // delete
			PreparedStatement ps = con.prepareStatement(sql); // con부품으로 sql스트링에 있는 것을 SQL부품으로 만들어 주세요.
			ps.setInt(1, id);
			System.out.println("3. SQL문 부품(개체)으로 만들어주기");

			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void update(BookVO bag) {
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

			String sql = "update book set name = ? where id = ? "; // update
			PreparedStatement ps = con.prepareStatement(sql); // con부품으로 sql스트링에 있는 것을 SQL부품으로 만들어 주세요.
			ps.setString(1, bag.getName());
			ps.setInt(2, bag.getId());
			System.out.println("3. SQL문 부품(개체)으로 만들어주기");

			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void insert(BookVO bag) {

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
			String sql = "insert into book(name, url, img) values (?, ?, ?)";

			// con부품으로 sql스트링에 있는 것을 SQL부품으로 만들어 주세요.
			PreparedStatement ps = con.prepareStatement(sql);

			// R빼고, 인덱스 0부터 시작
			// 유일하게 db는 인덱스가 1부터 시작!
			ps.setString(1, bag.getName());
			ps.setString(2, bag.getUrl());
			ps.setString(3, bag.getImg());
			System.out.println("3. SQL문 부품(개체)으로 만들어주기");

			// 4. SQL문을 DB프로그램(Oracle, mySQL ...)에 전송
			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public BookVO one(int id) { // select
		ResultSet rs = null; // 컬럼명 + 결과 데이터를 담고 있는 테이블
		// 기본형(정수,실수,문자,논리)만 값으로 초기화
		// 나머지 데이터형(참조형)은 주소가 들어가 있음.
		// 참조형 변수를 초기화할 떄는 null(주소가 없다라는 의미)

		// 검색결과용 가방(return의 반환값)
		BookVO bag = null;
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

			String sql = "select * from book where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setInt(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery(); // select문 전송시 : executeQuery(), 나머지 : executeUpdate()
			System.out.println("4. SQL문 mySQL로 보내기 성공.");
			if (rs.next()) { // 검색결과가 있는지 여부는 rs.next() : row가 있으면 true, 없으면 false값 반환
				System.out.println("검색결과 있음. 성공.");
				int id2 = rs.getInt(1);
				String name = rs.getString(2);
				String url2 = rs.getString(3);
				String img = rs.getString(4);
				System.out.println(id2 + " " + name + " " + url2 + " " + img);

				bag = new BookVO();
				bag.setId(id2);;
				bag.setName(name);
				bag.setUrl(url2);
				bag.setImg(img);;
			} else {
				System.out.println("검색결과 없음. 성공.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// return id, pw, name, tel -> X
		// return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야 함
		// 검색결과가 있을 때는 bag에는 데이터가 들어있음.
		// 검색결과가 없을 때는 bag에 무엇이 들어가 있나? -> null
		return bag;
	}
}
