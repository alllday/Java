package com.multi.mongoDB;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //싱글톤 + 컨트롤러 등록 
public class MemoController {
    @Autowired
    MemoDAO dao;
    
    @RequestMapping("list.memo")
    public void list(Model model) {
        //dao의 list()해서 결과 받아오면 됨.
        List<MemoVO> list = dao.list();
        System.out.println(list.size());
        //결과 받아온 것을 model의 속성을 지정해서 views까지 검색결과를 보내자!
        model.addAttribute("list", list);
    }
    
    @RequestMapping("insert.memo") 
    public void insert(MemoVO vo) {
        dao.insert(vo);
    }
    
    @RequestMapping("one.memo")
	public void one(String _id, Model model) {
		System.out.println("one.memo컨트롤러 >> " + _id);
		MemoVO vo = dao.one(_id);
		model.addAttribute("vo", vo);
	}
    
    @RequestMapping("update.memo")
	public String update(String _id, String content, Model model) {
		// _id를 vo에 바로 넣으려니까 400 error --> bad request error
		MemoVO vo = new MemoVO();
		vo.set_id(_id);
		vo.setContent(content);
		dao.update(vo);
		System.out.println("update.memo 컨트롤러>> " + vo);
		return "redirect:/mongo_memo.jsp";
	}

	@RequestMapping("delete.memo")
	public String delete(String _id) {
		dao.delete(_id);
		return "redirect:/mongo_memo.jsp";
	}
}