package 상속확인문제;

public class CoffeeTruck extends Truck {
	int coffee;
	
	public void run() {
		System.out.println("run faster");
	}
	
	public void sell() {
		System.out.println("sell");
	}
}
