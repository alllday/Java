package 복습;

public class mask사용 {

	public static void main(String[] args) {
		mask mask1 = new mask("white", 1000, 3);
//		mask1.color = "white";
//		mask1.price = 1000;
//		mask1.count = 3;
		
		System.out.println(mask1.color);
		System.out.println(mask1.price);
		System.out.println(mask1.count);
		
		System.out.println(mask1);
	}

}
