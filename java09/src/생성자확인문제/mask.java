package 생성자확인문제;

public class mask {
	String color;
	int price;
	int num;
	
	public mask(String color, int price, int num) {
		this.color = color;
		this.price = price;
		this.num = num;
	}

	public String toString() {
		return "mask [color=" + color + ", price=" + price + ", num=" + num + "]";
	}
}
