package com.multi.mvc01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
	@Autowired
	BookDAO dao;
	
	@RequestMapping("insert3")
	public String insert(BookVO bag) {
		dao.insert(bag);
		return "book_insert";
	}
	@RequestMapping("update3")
	public String update(BookVO bag) {
		dao.update(bag);
		return "book_update";
	}
	@RequestMapping("delete3")
	public String delete(int no) {
		dao.delete(no);
		return "book_delete";
	}
	
	@RequestMapping("book_one")
	public void one(int id, Model model) {
		BookVO bag = dao.one(id);
		model.addAttribute("bag", bag);
	}
}
