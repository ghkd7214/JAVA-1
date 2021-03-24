
public class 커피 {

	
	
		private String 원산지;			//인스턴스변수
		private String 종류;				//인스턴스변수
		private int 가격; 				//인스턴스변수
		private static int 판매수량;		//클래스변수
		
		
		
		public 커피() {					//자동으로 안만들어줘서 직접만듬
			
		}
		
		
		public 커피(String s) {			//파라미터가 있는 생성자가 있으면 디폴트 생성자를 만들어줘야함
			원산지 = s;					//원래 컴파일러가 자동으로 만들어주지만 피라미터가 있는 생성자를 만들면 자동으로 안만들어줌
		}

		static void 커피수량(){			//클래스메소드 
			
		}
		
		
		
		public void 내린다(){
			
		}
		
		
		public void 볶는다() {
			
		}
		
		public void set원산지(String s) {
			원산지 = s;
		}
		
		public String get원산지(String s) {  		
			return 원산지;
		}

		
		
}
