package 복습;

import java.util.ArrayList;

import javax.swing.JButton;

public class 아무거나 {

	public static void main(String[] args) {
		// 인덱스, 순서, 직접접근 ==> ArrayList
		ArrayList list = new ArrayList();
		list.add("홍길동"); // Object <- String (자동형변환)
		list.add(100); // Object(클래스) <- Inteser(랩퍼'클래스', 포장클래스) <--오토박싱-- int(기본형)
		list.add(11.22); // Object <- Double <- double(기본형)
		list.add(new JButton()); // Object <- JButton
		//Inteser <---- 오토박싱 ----- int
		//        ----- 오토언박싱 ---> 
		
		String name = (String)list.get(0); // list.get(0) : 직접접근(=랜덤엑세스) 가능, (String) : 강제형변환
		// Object -> String : 강제형변환 (언박싱이 아님!)
		
		int age = (Integer)list.get(1);
		// Object -> Inteser -> int : 강제형변환 + 언박싱
	}

}
