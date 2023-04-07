package com.multi.mvc300;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//스프링에 dao는 싱글톤으로 하나만 만들어서 사용할게! 라고 설정해야함.
// 1) 어노테이션방법, 2) XML방법
@Component // -> 램에 객체를 하나만 만들어 놓음 : MemberDAO d = new MemberDAO();
public class MemberDAO { // CRUD

	// mybatis 싱글톤 객체 찾아서 주소를 넣어주세요!
	@Autowired
	SqlSessionTemplate my;
//	public ArrayList<MemberVO> list() {
//		return list;
//	}
//
//	public int login(MemberVO bag) {
//		return result;
//	}
//
	public MemberVO one(String id) { // select
		MemberVO bag = my.selectOne("member.one", id);
		return bag;
	}

	public int delete(String id) {
		return my.delete("member.del", id);
	}

	public int update(MemberVO bag) {
		return my.update("member.up", bag);
	}

	public int insert(MemberVO bag) { // 1. 가방을 받을 값
		int result = my.insert("member.create", bag);
		//                   // namespace.id => memberMapper.xml파일 참조
		return result;

	}
}