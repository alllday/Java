package 복습;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class test {
	public static void main(String[] args) {
//		1. 두 수와 사칙연산자를 입력받아 두 수를 사칙연산자에 따라 처리후 출력
//		2. 두 수를 입력받아 정수로 변환하여 정수변수에  저장, 나누기 연산 수행후 소숫점 2째자리까지 출력!
		
		//1. 개행문자 확실히 이해하고 넘어가기
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		String opr = sc.next();
		
		switch (opr) {
		case "+":
			result = num1 + num2;
			System.out.println(result);
			break;
		case "-":
			result = num1 - num2;
			System.out.println(result);
			break;
		case "*":
			result = num1 * num2;
			System.out.println(result);
			break;
		case "/":
			result = num1 / num2;
			System.out.println(result);
			break;
		default:
			System.out.println("사칙연산x");
			break;
		}
		sc.close();
		//2. 두 수를 입력받아 정수로 변환하여 정수변수에  저장, 나누기 연산 수행후 소숫점 2째자리까지 출력!
		// 두 문제 같이 돌리면 왜 안되는지?
		String num11 = JOptionPane.showInputDialog("정수입력");
		String num22 = JOptionPane.showInputDialog("정수입력");
		int num111 = Integer.parseInt(num11);
		int num222 = Integer.parseInt(num22);
		
		double result2 = (double)(num111 / num222); // 나눈 값 : 정수 -> 그 값을 double로
		double result3 = (double)num111 / (double)num222; // 나누기 전부터 double -> 나눈 값도 double
		System.out.printf("%.2f\n", result2);
		System.out.printf("%.2f", result3);
	}
}