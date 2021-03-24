
public class 자동차 {

	int 연식;
	double 연비;
	String 색상;
	String 제조사;
	String 차종;
	String 차량이름;
	int 속도;
	private int prise; 				// 국룰 //필드는 프라이빗 메소드는 퍼블릭

	
	public void set가격(int 가격) { 	// 클래스안에서 생성된 오브젝트 = 인스턴스라 부름
		this.prise = 가격;	
	}
	
	public int get가격() {
		return prise;
	}

	public void 가속() {					//
		속도 = 속도 + 10;
	}

	public void 가속(int value) {			//오버로딩 파라미터로 구분 
		속도 = 속도 + 10;
	}

	public void 감속() {
		if (속도 <= 0) {
			속도 = 0;
		}
		속도 = 속도 - 10;
	}

	public String get차종() { 		// 프로그래머 사이에서 get이 메소드 앞에 붙어있으면 필드에 접근해 데이터를 읽는것으로 인지
		return 차종; 					// 암묵적으로
	}

	public void set차종(String 차종) { // 프로그래머 사이에서 set이 메소드 앞에 붙으면 필드에 접근하여 데이터를 쓰는것으로 인지
		this.차종 = "르노";
	}

	
}
