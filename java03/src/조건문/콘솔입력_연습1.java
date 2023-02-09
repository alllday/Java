package 조건문;

import java.util.Scanner;

public class 콘솔입력_연습1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나에 대한 정보");
		System.out.println("----------");
		System.out.print("이름 입력 >> ");
		String name = sc.nextLine();
		System.out.print("나이 입력 >> ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("취미 입력 >> ");
		String hobby = sc.nextLine();
		System.out.println("----------");
		System.out.println("나의 이름은 " + name + "입니다.");
		System.out.println("나의 나이는 " + age + "입니다.");
		System.out.println("나의 취미는 " + hobby + "입니다.");
		
		
		sc.close();
	}

}
