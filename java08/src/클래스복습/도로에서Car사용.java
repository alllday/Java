package 클래스복습;

public class 도로에서Car사용 {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.color = "black";
		car1.run();
		
		Car car2 = new Car();
		car2.color = "red";
		car2.run();
		car2.up();
		
	}

}
