package 조건문;

public class IF문5_문자열 {

	public static void main(String[] args) {
		String ssn = "1234567";
		
		//String은 기본형 데이터가 아니여서 명령어(함수)를 사용해야함.
		if (ssn.equals("1234567")) {
			System.out.println("일치o");
		}else {
			System.out.println("일치x");
		}
	
		char gender = ssn.charAt(0); // 첫번째 자리에 있는 문자 하나 추출
		
		switch (gender) {
		case '1': case '3':
			System.out.println('남');
			break;
		default:
			System.out.println('여');
			break;
		}
	}
}
