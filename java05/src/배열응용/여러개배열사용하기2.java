package 배열응용;

public class 여러개배열사용하기2 {
	public static void main(String[] args) {
		String[] names = {"홍길동", "이순신", "뉴진스", "방탄", "블랙핑크"};
		int[] term1 = {77, 88, 99, 55, 70};
		int[] term2 = {99, 100, 88, 80, 70};
		
		int second = 0;
		int same = 0;
		int total1 = 0;
		int total2 = 0;
		
		//1,2
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				second++;
			}
			else if (term1[i] == term2[i]) {
				same++;
			}
		}
		System.out.println("2학기 성적 오른 학생 수 : " + second + "\n1,2학기 성적 동일 학생 수 : " + same);
		//3
		for (int i = 0; i < term2.length; i++) {
			if(term2[i] == 100) {
				System.out.println("이름 : " + names[i] + "\n인덱스 번호 : " + i);
			}
		}
		//4
		for (int i = 0; i < term2.length; i++) {
			total1 += term1[i];
			total2 += term2[i];
		}
		if (total1 > total2) {
			System.out.println("1학기");
		}else if(total1 < total2) {
			System.out.println("2학기");
		}else {
			System.out.println("동일");
		}
		//5
		int idx = 0;
		for (int i = 0; i < term2.length; i++) {
			if (names[i].equals("뉴진스")) {
				idx = i;
			}
		}
		System.out.println("뉴진스 1학기 성적 : " + term1[idx]);
		System.out.println("뉴진스 2학기 성적 : " + term2[idx]);
	}
}
