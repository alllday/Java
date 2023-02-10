package 배열응용;

import java.util.Random;

public class 수능점수 {
	static final int std_num = 10000; // 상수
	
	public static void main(String[] args) {
		int[] score = new int[10000];
		int zero_cnt = 0;
		int perfect_cnt = 0;
		int total = 0;
		double avg = 0;
		int n_avg = 0;
		
		Random r = new Random(42);
		
		// 1. 만점자가 몇 명인지 누구인지(인덱스) + 2. 0점이 몇 명인지 + 배열에 값을 넣음과 동시에 찾기(반복문횟수 줄이려고)
		System.out.print("만점자 인덱스 : ");
		for (int i = 0; i < score.length; i++) {
			score[i] = r.nextInt(451);
			total += score[i];

			if (score[i] == 0) {
				zero_cnt++;
			}
			if (score[i] == 450) {
				perfect_cnt++;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("만점 학생수 : " + perfect_cnt + "\n0점 학생수 : " + zero_cnt);
		
		// 3. 평균은 몇인지
		avg = (double)total / std_num;
		System.out.println("평균 : " + avg);
		// 4. 평균보다 +-50점 사이에 있는 학생 카운트
		for (int i : score) {
			if (i <= avg+50 && i >= avg-50) {
				n_avg++;
			}
		}
		System.out.println("평균 +-50 학생 수 : " + n_avg);
		
		// 5. 상위 30% 범위에 드는 사람
		
	}

}
