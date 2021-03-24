
public class 스포츠카 extends 자동차{

	
	boolean turbo;
	
	
	
								
	@Override				//이곳에서 오버라이드를 하겠다고 컴파일러에게 알림 //@Override를 써놓고 하지않으면 컴파일러가 오버라이딩을 안했다고 알려줌	
	void speedup() {		//자동차클래스의 speedup에 final이 붙어 오버라이딩이 불가해짐
		speed = speed + 30;
		
	}
	
	
	
	
	
	
}
