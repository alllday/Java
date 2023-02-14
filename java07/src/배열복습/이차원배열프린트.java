package 배열복습;

public class 이차원배열프린트 {

	public static void main(String[] args) {
		// 배열을 만들 때 이미 알고 있는 경우
		int[][] n1 = {
				{1, 2, 3},
				{4, 5, 6}
		};
		// length : 배열길이 / length() : 문자열길이
		System.out.println(n1.length); // 2차원 배열의 length는 행만 찍는다.
		System.out.println(n1[0][0]);
		System.out.println(n1[1][2]);
		for (int i = 0; i < n1.length; i++) { // n1.length : 행
			for (int j = 0; j < n1[i].length; j++) { // n1[i].length : i번째 열
				System.out.print(n1[i][j]);
			}
			System.out.println();
		}
		// 배열을 만들 때 아직 모르고  있는 경우, 공간을 먼저 만든다.
		int[][] n2 = new int[2][]; // 열 개수가 다른 경우 비워놓는다. 둘 다 비워놀 순 없다.
	}

}
