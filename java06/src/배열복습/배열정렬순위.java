package 배열복습;

import java.util.Arrays;
import java.util.Random;

public class 배열정렬순위 {

	public static void main(String[] args) {
		// 정렬을 할 때에는 Arrays
		Random r = new Random(42);
		
		int[] jumsu = new int[10000];
		
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(1000) + 1;
		}
		
		//for-each : 알아서 위치값을 옮겨주면서 하나씩 꺼내옵니다.
		for (int i : jumsu) {
			System.out.println(i);
		}
		// 정렬 : 오름차순, 내림차순
		Arrays.parallelSort(jumsu);
		
		System.out.println("--------------");
		
		//정렬 후, 확인
		for (int i : jumsu) {
			System.out.println(i);
		}

		//정렬 후, 최대값, 최소값을 프린트
		System.out.println("최소값 : " + jumsu[0]);
		System.out.println("최대값 : " + jumsu[jumsu.length - 1]);
	
		//상위 30%, 인원3000명, 높은 점수부터 3000개 추출
		int sum30 = 0;
		for (int i = 7000; i < jumsu.length; i++) {
			sum30 += jumsu[i];
		}
		System.out.println("상위 30%평균 : " + sum30 / 3000.0);
		//하위 30%
		int sum30_under = 0;
		for (int i = 0; i < 3000; i++) {
			sum30_under += jumsu[i];
		}
		System.out.println("하위 30%평균 : " + sum30_under / 3000.0);
	}
}
