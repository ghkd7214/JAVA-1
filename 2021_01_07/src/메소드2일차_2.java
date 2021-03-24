import java.util.Scanner;

public class 메소드2일차_2 {

	static int cal(int v1, int v2, int op) {
		int rs;

		switch (op) {
		case 1:
			rs = v1 + v2;
			break;
		case 2:
			rs = v1 - v2;
			break;
		case 3:
			rs = v1 * v2;
			break;
		case 4:
			rs = v1 / v2;
			break;
		default:
			rs = 0;

		}

		return rs;
	}

	public static void main(String[] args) { 		// 메인 메소드에 public을 써두지만 않으면 오류표기는 없지만 자바에서 접근자체가 불가능해져서 실행이 않됨
		Scanner s = new Scanner(System.in);
		int oper, a, b;

		System.out.println("계산입력 (1:+, 2:-, 3:*, 4:/) : ");
		oper = s.nextInt();

		System.out.println("첫번째 숫자를 입력 :");
		a = s.nextInt();

		System.out.println("두번째 숫자를 입력 :");
		b = s.nextInt();

		System.out.println(cal(a, b, oper));

		s.close();

	}
}
