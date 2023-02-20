package 상속;

public class 예외처리1 {
	public static void main(String[] args) {
		
//		 1) 예외처리는 왜 하는가?
//		 => 문제가 생겼을 때 예외처리를 하지 않으면 프로그램이 더 이상 실행되지 않고 다운(=멈춤)
//		 2) 컴파일 에러vs실행에러
//				컴파일에러 :코드의 오류, 해야할 처리를 하지 않아서 생기는 오류(문법에러)
//				실행(run-time) 에러 : 컴파일 성공후, 실행할 때  원하는 결과대로 실행되지 않는 경우(논리적문제, 자원연결 문제)
//		 3) 자바에서 예외처리하는 방법
//		 => try/catch
//		 4) 반드시 예외처리를 해야하는 경우
//		 => 외부자원(파일, db, network, cpu 등)에 접근시 
		System.out.println("1. print");
		
		try {
			System.out.println("2. problem" + 10/0);
		} catch (Exception e) {
			System.out.println("error");
			System.out.println(e.getMessage());
		}
		System.out.println("3. print");
	}
}
