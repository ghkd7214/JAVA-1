class myChar {
	char x;
	char y;
}

public class 메소드3일차_1 {

	static void fun1(char x, char y) {	// call by val 그냥 값인 A 와 Z 가 넘어옴
		char imsi;
		imsi = x;
		x = y;
		y = imsi;						// 끝나면 그대로 휘발됨
	}

	static void fun1(myChar ch) { 		// call by ref ()안이 오브젝트면 주소를 넘겨줌
		char imsi;
		imsi = ch.x;
		ch.x = ch.y;
		ch.y = imsi;

	}

	public static void main(String[] args) {
		char x = 'A', y = 'Z';
		System.out.println("원래값   : x = " + x + " y = " + y);
		fun1(x, y);
		System.out.println("값을 전달한후	: x = " + x + " y = " + y);

		myChar ch = new myChar();		//호출방법 //클래스명 오브젝트명 =  new 클래스명();
		ch.x = 'A';						//1번줄의 
		ch.y = 'Z';
		System.out.println("원래값   : x = " + x + " y = " + y);
		fun1(ch);
		System.out.println("주소을 전달한후	: x = " + ch.x + " y = " + ch.y);

	}

}
