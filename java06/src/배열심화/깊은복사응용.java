package 배열심화;

public class 깊은복사응용 {

	public static void main(String[] args) {
		String[] 과목명 = {"국어", "영어", "수학", "컴퓨터", "회화"};
		int[] 학기1성적 = {44, 66 ,22 ,99 ,100};
		int[] 학기2성적 = 학기1성적.clone();
		System.out.println(학기1성적 == 학기2성적);
		학기2성적[0] = 22;
		학기2성적[2] = 88;
		
		for (int i = 0; i < 학기1성적.length; i++) {
			System.out.print(학기1성적[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < 학기2성적.length; i++) {
			System.out.print(학기2성적[i] + " ");
		}
		System.out.println();
		int cnt = 0;
		int cnt2 = 0;
		System.out.print("오른 성적 과목 명 : ");
		for (int i = 0; i < 학기2성적.length; i++) {
			if (학기1성적[i] == 학기2성적[i]) {
				cnt++;
			}
			else if(학기1성적[i] < 학기2성적[i]) {
				cnt2++;
				System.out.print(과목명[i] + " ");
			}
		}
		System.out.println();
		System.out.println("동일 성적과목 수 : " + cnt);
		System.out.println("오른 성적과목 수 : " + cnt2);
		
	}

}
