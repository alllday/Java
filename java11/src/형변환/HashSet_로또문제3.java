package 형변환;

import java.util.HashSet;
import java.util.Random;

public class HashSet_로또문제3 {

	public static void main(String[] args) {
		Random r = new Random(42);
		HashSet lotto = new HashSet();
		System.out.println(lotto.size());
		for (int i = 0; lotto.size() < 6; i++) { // i<6이 아닌 lotto.size<6 !
			lotto.add(r.nextInt(45) + 1);
		}
		
		System.out.println(lotto.size()); // 중복된 값은 안들어 가기 때문에 9개 다 안들어감!
		System.out.println(lotto);
	}
}