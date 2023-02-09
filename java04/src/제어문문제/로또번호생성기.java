package 제어문문제;

import java.util.Random;

public class 로또번호생성기 {

	public static void main(String[] args) {
		// 아무값이나 발생시키는 부품 == Random
		Random r = new Random(10); // 10 : 시드값 -> 시드값에 따라 랜덤값이 다르게 고정됨
		for (int i = 0; i < 6; i++) {
			// r.nextInt() : -21억~21억 랜덤값 생성 / r.nextInt(10) : 0~9 랜덤값 생성 
			System.out.println("로또 번호 : " + r.nextInt(10));
		} 

	}

}
