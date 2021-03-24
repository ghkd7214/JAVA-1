package 자동차;

public class 버스 extends 자동차 {
	
	String 노선[];
	
	int 버스번호 ;
	
	
	
	
	void 노선알아보기(){
		
		for (int i=0; i<노선.length;i++) {
			System.out.print(노선[i]+"->	");
		}
	}
	

}
