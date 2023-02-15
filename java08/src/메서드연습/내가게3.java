package 메서드연습;

public class 내가게3 {
	public static void main(String[] args) {
		계산기3 cal3 = new 계산기3();
		int price = 7000;
		int cnt1 = 5;
		int cnt2 = 4;
		
		//계산기3을 이용해주세요
		//1)
		int totalCnt = cal3.add(cnt1, cnt2);
		System.out.println("오늘 온 손님의 총 합은 " + totalCnt + "명입니다");
		//2) 절댓값씌워주기
		int gap = cal3.minus(cnt1, cnt2);
		System.out.println("손님 수 차이는 " + Math.abs(gap) + "명입니다. ");
//		System.out.println(Math.PI);
//		System.out.println(Math.ceil(3.334));
//		System.out.println(Math.floor(3.334));
//		System.out.println(Math.round(3.334));
//		System.out.println(Math.round(3.534));
//		System.out.println(Math.sqrt(100)); //루트
//		System.out.println(Math.max(100, 200)); 
//		System.out.println(Math.min(100, 200)); 
//		System.out.println(Math.pow(2, 3)); //2의 3승
		//3)
		int amSum = cal3.mul(price, cnt1);
		System.out.println("오전 결제금액은 " + amSum + "원입니다");
		//4)
		int pmSum = cal3.mul(price, cnt2);
		System.out.println("오후 결제금액은 " + pmSum + "원입니다");
		//5)
		int totalSum = cal3.add(amSum, pmSum);
		System.out.println("오늘 하루 총 결제금액은 " + totalSum + "원입니다");
		//6)
		int perPrice = cal3.div(totalSum, totalCnt);
		System.out.println("1인당 결제금액은 " + perPrice + "원입니다");
	}
}
