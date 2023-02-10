package 배열응용;

import java.util.Scanner;

public class 스캐너 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1
		int[] integer = new int[5];
		
		for (int i = 0; i < integer.length; i++) {
			System.out.print("정수입력 : ");
			integer[i] = sc.nextInt();		
		}
		System.out.println((integer[0] + integer[2]));
		//2
		String[] str = new String[3];
		for (int i = 0; i < str.length; i++) {
			System.out.print("문자열 입력 : ");
			str[i] = sc.next();
		}
		System.out.println(str[0] + "보다는 " + str[1]);
	}

}
