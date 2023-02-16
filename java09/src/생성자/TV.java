package 생성자;

public class TV {
	//멤버변수, 선언이 클래스 바로 아래에 되었기 떄문에 클랴스 전체 영역에서 이 변수를 사용할 수 있음
	//전역변수(global변수)
	//멤버변수는 자동초기화, 전역변수는 자동초기화
	public int ch;
	public int vol;
	public boolean onOff;
	
	// 다른 생성자 메서드가 없으면 부품만들 때(객체생성) 자동으로 생성됨.
	// 기본 생성자(default constructor)
//	public TV() {
//		// 자동으로 만들어지는 메서드(함수)
//		System.out.println("TV");
//	}
	// 객체생성할 때마다 꼭 실행시키고 싶은 내용이 있으면 기본 생성자를 눈에 보이게 다시 만들어주세요. (명시적으로!)
	// 상단 바 Source -> Generate Constructors from super....
//	public TV() {
//		System.out.println("TV");
//	}
	
	// 파라미터 있는 생성자
//	public TV(int ch, int vol, boolean ofOff) { //매개변수(파라미터)
//		// 무더기영역(힙영역)에 저장된 멤버변수에 값을 넣어주는 역할
//		this.ch = ch;
//		this.vol = vol;
//		this.onOff = onOff;
//	}
	
	// 파라미터가 있는 생성자 자동생성 : 상단 바 Source -> Generate Constructors using Fields....
	// 파라미터 있는 생성자가 있을 때는 기본생성자는 자동생성되지 않음!
	public TV(int ch, int vol, boolean onOff) {
		this.ch = ch;
		this.vol = vol;
		this.onOff = onOff;
	}
	
	public void 채널을바꾸다() {
		int change = 1; // 지역변수, local변수 -> 자동초기화x
		System.out.println(ch + "에서 " + change + "로 바꾸다.");
	}

	public void 유튜브보다() { // 메서드를 만드는 것 ==> 메서드를 정의한다
		System.out.println(vol + "을 키워서 동영상을 보다");
	}
}
