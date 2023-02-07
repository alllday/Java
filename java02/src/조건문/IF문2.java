package 조건문;

public class IF문2 {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		//x와 y가 같은지 비교, 같으면 '동일'프린트 , 같지 않으면 '동일x'프린트
		
		if (x==y) {
			System.out.println("동일o");
		}else {
			System.out.println("동일x");
		}
		
		int id = 1111;
		int id2 = 2222;
		
		if (id==id2) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
	}

}
