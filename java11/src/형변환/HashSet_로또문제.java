package 형변환;

import java.util.HashSet;

public class HashSet_로또문제 {

	public static void main(String[] args) {
		HashSet bag = new HashSet();
		
		bag.add("휴대폰");
		bag.add("휴지");
		bag.add(8);
		System.out.println(bag); // 순서가 없음~
		
		// 중복되서 들어가지 않음~
		bag.add("볼펜");
		System.out.println(bag); 
		System.out.println();
	}
}