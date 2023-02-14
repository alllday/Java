package 부품사용하기;

import 부품만들기.강아지;

public class 강아지사용하기 {

	public static void main(String[] args) {
		강아지 dog1 = new 강아지();
		강아지 dog2 = new 강아지();
		
		dog1.weight = 20;
		dog2.weight = 30;
		
		dog1.name = "aa";
		dog2.name = "bb";
		
		dog1.info();
		dog2.info();
		dog1.eat();
		dog2.eat();
	}

}
