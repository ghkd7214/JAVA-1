import java.util.Scanner;

public class �ݺ���_���� {

	public static void main(String[] args) {

		int hap = 0;
		int i;
		int a, b, c;

		Scanner s = new Scanner(System.in);

		System.out.print("���۰� �Է� :");
		a = s.nextInt();

		System.out.print("���� �Է� :");
		b = s.nextInt();

		System.out.print("������ �Է� :");
		c = s.nextInt();

		for (i = a; i <= b; i = (i + c)) {
			hap = hap + i;
		}

		System.out.printf("\n%d���� %d������ %d�� ������ ���� �� : %d \n", a, b, c, hap);

		s.close();
	}
}