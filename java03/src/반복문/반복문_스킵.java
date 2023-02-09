package 반복문;

public class 반복문_스킵 {

	public static void main(String[] args) {
		// 1번부터 10번까지 데이터 중에서 짝수만 프린트!!
		for (int i = 1; i <= 10; i++) {
			if (i==8) {
				System.exit(0); // 0 : 정상 종료 / 0이 아닌 다른 값 : 비정상종료
			}
			if (i % 2 == 0) {
				System.out.println(i);
			}else if(i % 2 != 0) {
				continue;
			}
		}

	}

}
