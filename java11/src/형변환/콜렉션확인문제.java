package 형변환;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class 콜렉션확인문제 {

	public static void main(String[] args) {
		//1
//		HashSet trip = new HashSet();
//		
//		trip.add("영국");
//		trip.add("미국");
//		trip.add("일본");
//		trip.add("태국");
//		trip.add("스위스");
//		
//		System.out.println(trip);
//		
		//2
//		HashMap home = new HashMap();
//		
//		home.put("안방", "TV");
//		home.put("거실", "쇼파");
//		home.put("부엌", "냉장고");
//		home.put("현관", "신발");
//		
//		System.out.println(home);
//		System.out.println(home.get("현관"));
//		home.replace("거실", "쇼파", "책상");
//		System.out.println(home);
		//3
		ArrayList doList = new ArrayList();
		doList.add("자바공부");
		doList.add("백준");
		doList.add("자바복습");
		doList.add("저녁");
		
		System.out.println(doList);
		System.out.println(doList.get(0));
		System.out.println(doList.get(doList.size()-1));
		doList.set(1, "청소");
		System.out.println(doList);
	}

}
