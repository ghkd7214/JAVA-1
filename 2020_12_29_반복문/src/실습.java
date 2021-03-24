import java.util.Scanner;

public class 실습 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a;
		
		
		while(true) {
			
			System.out.println("절대값을 찾는 프로그램입니다.");
			System.out.println("판별할 정수를 입력하세요.(종료를 원하시면 0을 입력하세요) : ");
			a = s.nextInt();
			
			if (a == 0) {
				break;
			}
			
			if(a > 0 ) {
					System.out.printf("%d의절대값은 %d입니다.\n", a, a );
			}
			else {
				System.out.printf("%d의절대값은 %d입니다.\n", a, -a );
			}
		}
	
		s.close();
	
	}
}