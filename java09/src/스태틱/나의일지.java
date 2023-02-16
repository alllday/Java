package 스태틱;

public class 나의일지 {

	public static void main(String[] args) {
		Day day1 = new Day("자바공부", 8, "삼성역");
		System.out.println(Day.cnt); // static 변수는 객체 이름이 아닌 클래스명!
		Day day2 = new Day("주변산책", 1, "코엑스근방");
		System.out.println(Day.cnt); // 이탤릭체는 static변수
		Day day3 = new Day("시험요약정리", 2, "강의장5");
		System.out.println(Day.cnt);
		// 총12개(각4개 : why?) 다이나믹 생성, 멤버변수 ==> 객체생성할 때마다 다이나믹하게 무더기영역(heap)에 생긴 변수
		// 인스턴스 변수라고 부른다.
		 
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		System.out.println(Day.sumTime);
	}

}
