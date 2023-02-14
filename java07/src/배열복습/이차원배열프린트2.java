package 배열복습;

public class 이차원배열프린트2 {

	public static void main(String[] args) {
		String[][] s = {
				{"피카츄", "파이리", "꼬부기"},
				{"피존투", "버터플", "야도란"},
				{"라이츄", "또가스", "피존"}
			};
		
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				System.out.print(s[i][j] + " ");
			}
			System.out.println();
		}
		}
}
