package 형변환;

import java.util.LinkedList;

public class Queue_확인문제 {

	public static void main(String[] args) {
		LinkedList lst = new LinkedList();
		lst.add("국어");
		lst.add("수학");
		lst.add("영어");
		lst.add("컴퓨터");
		
		lst.remove();
		System.out.println(lst);
		lst.remove();
		System.out.println(lst);
		lst.remove();
		System.out.println(lst);
	}

}
