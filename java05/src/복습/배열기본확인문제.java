package 복습;

public class 배열기본확인문제 {

	public static void main(String[] args) {
		// 
		String[] trip = {"as", "Sd", "df", "qw", "er"};
		String[] color = {"red", "qqq", "aaaa", "vvv", "sss"};
		
		for (int i = 0; i < trip.length; i++) {
			System.out.println(trip[i]);
		}
		for (String string : color) {
			System.out.println(string);
		}

	}

}
