package 인터페이스확인문제;

public class ComputerUse {

	public static void main(String[] args) {
		AppleComputer ac = new AppleComputer();
		Computer com1 = new AppleComputer();
		BananaComputer bc = new BananaComputer();
		
		ac.on();
		ac.off();
		ac.use();
		bc.on();
		bc.off();
		bc.use();
		com1.on();
	}

}
