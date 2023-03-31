package com.multi.mvc01;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

@Controller
public class BookController {
	@Autowired
	BookDAO dao;
	
	@RequestMapping("book_insert")
	public String insert(BookVO bag) {
		dao.insert(bag);
		return "book_insert";
	}
	@RequestMapping("book_update")
	public String update(BookVO bag) {
		dao.update(bag);
		return "book_update";
	}
	@RequestMapping("book_delete")
	public String delete(int no) {
		dao.delete(no);
		return "book_delete";
	}
	
	@RequestMapping("book_one")
	public void one(int id, Model model) {
		BookVO bag = dao.one(id);
		model.addAttribute("bag", bag);
	}
	
	@RequestMapping("book_list")
	public void list(Model model) {
		ArrayList<BookVO> list = dao.list();
		model.addAttribute("list", list);
	}
}
