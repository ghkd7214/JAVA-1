package 자동차;

public class 트럭 extends 자동차{

	
	int 적재량;
	
	
	
	트럭(){							//1.서브클래스 생성자 호출위치에서 skip
									//4.서브클래스 맴버들을 생성
	}
	
	
	
	@Override
	void 감속() {
		//변경가능	
	}
	
	트럭(String s){			//트럭(String){} 은 실행해도 부모클래스의 자동차(){}가 실행됨 
		super("s");  		//부모가 가지고있는 생성자를 실행하는 명령  //부모클래스의 자동차 (String s){} 가 실행되게하고싶을때 사용함
		
	}
	
	
	   
	void 적재량알아보기() {
		
	}
	
	

}
