package 상속;

public class 원더우먼 extends 우먼{
	boolean beauty;
	
	public void attack() {
		eat();
		System.out.println(age);
		System.out.println("attack");
	}
	
	public void jump() {
		System.out.println("jump more");
	}

	@Override
	public String toString() {
		return "원더우먼 [beauty=" + beauty + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
