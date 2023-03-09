package 자바DB연결;

import 화면DB연결.ProductVO;

public class ProductDAO {
	public void insert(ProductVO bag) {
		System.out.println("전달된 id는 " + bag.getId());
		System.out.println("전달된 name는 " + bag.getName());
		System.out.println("전달된 content는 " + bag.getContent());
		
	}
}
