import java.util.Scanner;

public class aaaa {

	public static void main(String[] args) {

		int a;

		while (true) {

			Scanner s = new Scanner(System.in);

			System.out.println("������ �Է��ϼ��� :");

			try {
				a = s.nextInt();

				if (a == (int) a) {

					if (a == 0) {
						System.out.println("0�Դϴ�.");

					} else if (a > 0) {
						System.out.println("����Դϴ�.");

					} else {
						System.out.println("�����Դϴ�.");

					}

				}

			} catch (Exception e) {
				System.out.println("������ �Է����ּ���");

				s.next();
				s.close();

			}

		}

	}

}
