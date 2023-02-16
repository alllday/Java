package 상속;

public class 슈퍼맨 extends 맨{
	boolean fly;
	
	public void space() {
		sleep();
		System.out.println(name);
		System.out.println("fly");
	}
	
	public void eat() {
		System.out.println("eat more");
	}
	
	@Override
	public String toString() {
		return "슈퍼맨 [fly=" + fly + ", power=" + power + ", name=" + name + ", age=" + age + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
