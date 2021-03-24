
public class CLASS_TEST {

	public static void main(String[] args) {

		자동차 카니발 = new 자동차();
				  // new 클래스명() => 생성자
		자동차 IG = new 자동차();

		자동차 아벤타도르j = new 자동차();

		자동차 아반떼 = new 자동차();

		자동차 G80 = new 자동차();

		자동차 쏘렌토 = new 자동차();

		자동차 LEVEL3 = new 자동차();

		자동차 포터[] = new 자동차[100]; // 배열로 생성시 배열하나하나마다 new클래스 선언을 해줘야함

		for (int i = 0; i < 포터.length; i++) { // new 클래스선언
			포터[i] = new 자동차();
		}

		포터[0].색상 = "화이트";

		카니발.가속(); 		// 단순히 속도가 10올라가는 메소드 //서로다른 메소드임
		카니발.가속(30); 		// 입력한 값만큼 속도가 올라가는 메소드 //메소드 오버로딩
		카니발.차종 = "4륜";

		카니발.set가격(10000);

		가전 LEDtv = new 가전();

		가전 의류관리기 = new 가전();

		LEDtv.제조사 = "삼성";

		LEDtv.가격 = 1000000;

		
		System.out.println(카니발.prise);				//prise 는 private변수라 이런식으로 사용못함
		System.out.println(카니발.get가격()); 			//사용하고싶다면 prise를 사용해서 만든 메소드인 get가격()을 사용해야함

		커피 a = new 커피();

		커피 aa[] = new 커피[100];  						//오늘 들어온 커피가 전부 과테말라일때
		for (int i = 0; i < aa.length; i++) {
			aa[i] = new 커피("과테말라");
		}

		커피.커피수량();					//클래스 메소드는 호출시 생성자가 필요없음 //
		
		
	}

}
