import java.util.Scanner;

public class control {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a;

		while (true) {

			System.out.println("자연수 크기 판별프로그랩입니다.");
			System.out.println("판별할 자연수를 입력하세요.(종료를 원하시면 -1을 입력하세요) : ");
			a = s.nextInt(); // 스캐너 s 오브젝트를 활용해서 정수를 입력받아 a변수에 넣어준다

			if (a == -1) {
				break;
			}

			if (a >= 50) {
				if (a <= 100) {
					System.out.println("입력한 자연수는 50과 100사이에 있네요");
				} else {
					System.out.println("입력한 자연수는 100보다 크네요");
				}
			} else {
				System.out.println("입력한 자연수는 50보다 작네요");
				
			}
		}
		s.close();
	}
}