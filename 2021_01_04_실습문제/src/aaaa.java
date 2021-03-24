import java.util.Scanner;

public class aaaa {

	public static void main(String[] args) {

		int a;

		while (true) {

			Scanner s = new Scanner(System.in);

			System.out.println("정수를 입력하세요 :");

			try {
				a = s.nextInt();

				if (a == (int) a) {

					if (a == 0) {
						System.out.println("0입니다.");

					} else if (a > 0) {
						System.out.println("양수입니다.");

					} else {
						System.out.println("음수입니다.");

					}

				}

			} catch (Exception e) {
				System.out.println("정수를 입력해주세요");

				s.next();
				s.close();

			}

		}

	}

}
