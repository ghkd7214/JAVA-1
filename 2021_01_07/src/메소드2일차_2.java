import java.util.Scanner;

public class �޼ҵ�2����_2 {

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

	public static void main(String[] args) { 		// ���� �޼ҵ忡 public�� ������� ������ ����ǥ��� ������ �ڹٿ��� ������ü�� �Ұ��������� ������ �ʵ�
		Scanner s = new Scanner(System.in);
		int oper, a, b;

		System.out.println("����Է� (1:+, 2:-, 3:*, 4:/) : ");
		oper = s.nextInt();

		System.out.println("ù��° ���ڸ� �Է� :");
		a = s.nextInt();

		System.out.println("�ι�° ���ڸ� �Է� :");
		b = s.nextInt();

		System.out.println(cal(a, b, oper));

		s.close();

	}
}
