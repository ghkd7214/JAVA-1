package 자동차;

public class test {

	public static void main(String[] args) {

		승용차 카니발 =new 승용차();
		
		자동차 포니 = new 승용차();  //	업캐스팅 // 승용차를 통해만든 자동차 타입 //승용차의 메소드(좌석수알아보기)는 사용 할 수 없음   
		
		카니발.좌석수알아보기();		//가능
		포니.좌석수알아보기();		//불가능
		
		
		카니발.감속(); 			//private인 속도에 접근하기위해선 메소드로 접근
		
	}

}
