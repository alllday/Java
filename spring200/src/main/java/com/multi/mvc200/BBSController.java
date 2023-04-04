package com.multi.mvc200;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 스프링에서 제어하는 역할로 등록
public class BBSController {

	@Autowired
	BBSDAO dao;
	
	@Autowired
	ReplyDAO dao2;
	// 컨트롤 하는 기능(CRUD)
	// 회원가입, 수정, 탈퇴, 정보검색

	// 클래스 내에서 기능처리 담당
	// 멤버변수 + 멤버메서드(기능처리 담당)
	// 하나의 요청당 하나의 메서드
	// 하나의 버튼호출당 하나의 함수 연결!
	// 요청된 주소가 어떻게 될 때
	// 바로 아래에 있는 메서드가 호출이 될지
	// 써주어야 한다.
	// 클라이언트로부터 받는 form action이름과 매핑의 인자는 .multi까지 같아야 하지만, 보내주는 jsp는 . 이후 부분은 상관없음~
	@RequestMapping("insert2.multi") 
	public void insert(BBS_VO bag) {
		// 메서드의 입력변수(파라미터)로 변수를 선언해두면, 컨트롤러내의 메서드내에서는
		// 1) bag을 만들어서 
		// 2) 클라이언트로 부터 전달된 데이터도 받아줌
		// 3) bag에 데이터 다 넣어줌
		System.out.println("insert요청됨.");
		System.out.println(bag);
		System.out.println(dao);
		// dao에게 insert요청!
		dao.insert(bag);
	}

	@RequestMapping("update2.multi")
	public void update(BBS_VO bag, Model model) {
		System.out.println("update요청됨.");
		System.out.println(bag);
		System.out.println(dao);
		dao.update(bag);
		ArrayList<BBS_VO> list = dao.list();
		model.addAttribute("list", list);
	}

	@RequestMapping("delete2.multi")
	public void delete(int no, Model model) {
		System.out.println("delete요청됨.");
		System.out.println(no);
		System.out.println(dao);
		dao.delete(no);
		ArrayList<BBS_VO> list = dao.list();
		model.addAttribute("list", list);
	}

	@RequestMapping("one2.multi")
	public void one(int no, Model model) {
		System.out.println("one요청됨.");
		System.out.println(no);
		System.out.println(dao);
		BBS_VO bag = dao.one(no);
		// 검색결과 있는지 프린트!
		System.out.println(bag);
		// bbs상세페이지 만들 때, reply list도 함께 가지고 와야함.
		ArrayList<ReplyVO> list = dao2.list(no);
		model.addAttribute("list", list);
		model.addAttribute("bag", bag);
		
		
	}

	@RequestMapping("list2.multi")
	public void list(Model model) {
		ArrayList<BBS_VO> list = dao.list();
		model.addAttribute("list", list);
	}
	
	@RequestMapping("list5")
	public void list5(Model model) {
		ArrayList<BBS_VO> list = dao.list();
		model.addAttribute("list", list);
	}
	
	@RequestMapping("one6")
	public void one6(int no, Model model) {
		BBS_VO bag = dao.one(no);
		model.addAttribute("bag", bag);
	}
}
