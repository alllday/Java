package 형변환;

import java.util.ArrayList;

public class ArrayList_스키문제 {
	public static void main(String[] args) {
		// 많은 양의 데이터를 다루는 부품류를 콜렉션이라고 한다.
		// => 많은 양의 데이터들도 특징이 있고, 그 특징에 따라 콜렉션의 종류가 많음
		// => 배열 + 사이즈 조절
		ArrayList list = new ArrayList();
		list.add("박스키");
		list.add("송스키");
		list.add("김스키");
		list.add("정스키");

		System.out.println(list);
		
		list.remove(1);
		
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println(list.contains("김연아"));
		System.out.println(list.size());
		
		ArrayList list2 = new ArrayList();
		list2.add("이스키");
		list2.add("박스키"); 
		list2.add("양스키");
		list.addAll(list2); //파괴형함수
		System.out.println(list);
		
		System.out.println(list2.isEmpty());
		list2.clear();
		System.out.println(list2);
		
	}
}
