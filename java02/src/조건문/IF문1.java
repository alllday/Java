package 조건문;

public class IF문1 {

	public static void main(String[] args) {
		int x = 0;
		
		// 조건을 쓸 때는 비교하는 것으로 쓰고, 결과는 무조건 true/false
		if (x == 0) { // true
			System.out.println("내가 실행되겠지?");
		}else {
			System.out.println("나는 조건이 맞지 않을 떄 실행");
		}
		
		if (x == 1) { // false
			System.out.println("나는 실행될까요??");
		}

	}

}
