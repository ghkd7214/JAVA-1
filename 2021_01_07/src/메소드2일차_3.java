
public class 메소드2일차_3 {

	public static String fun1(String a) {
		a = a + 1;
		System.out.println("전달받은 a ==>" + a);
		return "adsa";
	}

	public static void main(String[] args) {
		int a = 10;

		fun1("asd");
		System.out.println("fun1() 실행 후의 a ==>" + a);
		System.out.println(fun1("ad")+1);
		//형식인자 자리()에 기초 또는 래퍼클래스 타입의 변수가 지정되면 call by value
		
		
	}

}
