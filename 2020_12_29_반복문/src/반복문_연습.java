import java.util.Scanner;

public class 반복문_연습 {

	public static void main(String[] args) {

		int hap = 0;
		int i;
		int a, b, c;

		Scanner s = new Scanner(System.in);

		System.out.print("시작값 입력 :");
		a = s.nextInt();

		System.out.print("끝값 입력 :");
		b = s.nextInt();

		System.out.print("증가값 입력 :");
		c = s.nextInt();

		for (i = a; i <= b; i = (i + c)) {
			hap = hap + i;
		}

		System.out.printf("\n%d부터 %d까지의 %d씩 증가한 값의 합 : %d \n", a, b, c, hap);

		s.close();
	}
}