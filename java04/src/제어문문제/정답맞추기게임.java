package 제어문문제;

import java.util.Random;
import java.util.Scanner;

public class 정답맞추기게임 {

	public static void main(String[] args) {
		int target = 0;
		// 2. 랜덤을 이용해서 프로그램 실행될 때마다 정답을 바꾸세요
		Random r = new Random();
		target = (r.nextInt(100) + 1); // 1~100
		Scanner sc = new Scanner(System.in);
		int data = 0;
		int cnt = 0;
		System.out.println(target);

		while (true) {
			System.out.print("생각한 정답은? ");
			data = sc.nextInt();
			// 3. 전체 시도 횟수 카운트
			cnt++;
			System.out.println("횟수 : " + cnt);
			if (data == target) {
				System.out.println("정답입니다~");
				System.out.println("끝");
				break;
			} else {
				System.out.println("오답");
				System.out.println("다시 시도하세요!");
				// 1. 오답인 경우 data가 target보다 크면 "커요" / 작으면 "작아요"
				if (data > target) { // 첫 번째 if에서 else if로 들어갈 조건이지만 오답을 찍기 위해 첫 번째 if의 else의 안에!
					System.out.println("정답보다 커요");
				} else {
					System.out.println("정답보다 작아요");
				}
			}
		}
		sc.close();

	}

}
