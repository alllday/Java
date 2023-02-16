package 상속확인문제;

public class 내차들 {

	public static void main(String[] args) {
		CoffeeTruck cof = new CoffeeTruck();
		
		cof.size = "big";
		cof.brand = "KIA";
		cof.coffee = 1;
		
		cof.run();
		cof.store();
		cof.sell();
	}

}
