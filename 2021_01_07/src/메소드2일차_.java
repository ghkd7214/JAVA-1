import java.util.Scanner;

public class 메소드2일차_ {
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int c;

		System.out.println("어떤 커피를 드릴까요? (1.보통, 2.설탕, 3.블랙)");
		c = s.nextInt();

		coffee_m(c);  					// 실인자 아규먼트

		System.out.println("커피여기있습니다.");
		
		s.close();
	}

	static int coffee_m(int button) {  	//형식인자 파라미터
		System.out.println("1.뜨거운 물을 준비한다.");
		System.out.println("2.종이컵을 준비한다.");

		switch (button) {

		case 1:
			System.out.println("3.보통커피를 탄다.");
			break;

		case 2:
			System.out.println("3.설탕커피를 탄다.");
			break;

		case 3:
			System.out.println("3.블랙커피를 탄다.");
			break;

		default:
			System.out.println("3.아무거나 탄다.");
			break;
		}

		System.out.println("4.물을 붓는다.");
		System.out.println("5.스푼으로 저어서 녹인다.");
		System.out.println();
		
		return 0;

	}

}
