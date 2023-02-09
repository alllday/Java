package 배열;

public class 배열다루기 {

	public static void main(String[] args) {
		// 
		int[] x = new int[10]; // 실제로 생기는 저장공간은 12개 -> x : 1개 / 배열 : 10개 / length : 1개
		x[0] = 10;
		x[1] = 20;
		
//		System.out.println(x[0]);
//		System.out.println(x[1]);
//		System.out.println(x[2]);
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		
		// 우리가족의 성별을 char[]로 저장, 프린트
		char[] gender = {'m', 'f', 'f', 'm', 'm'};
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i] + " ");
		}
		System.out.println();
		// 우리가족의 이름을 String[]로 저장, 프린트
		String[] name = {"su", "in", "dan", "kwan", "il"};
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println();
		// 우리가족의 시력을  double[]로 저장, 프린트
		double[] eye = {0.5, 0.4, -0.2, 0.2, 0.1};
		for (int i = 0; i < eye.length; i++) {
			System.out.print(eye[i] + " ");
		}
		System.out.println();
	}

}
