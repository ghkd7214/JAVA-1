import java.util.Scanner;

public class control {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a;

		while (true) {

			System.out.println("�ڿ��� ũ�� �Ǻ����α׷��Դϴ�.");
			System.out.println("�Ǻ��� �ڿ����� �Է��ϼ���.(���Ḧ ���Ͻø� -1�� �Է��ϼ���) : ");
			a = s.nextInt(); // ��ĳ�� s ������Ʈ�� Ȱ���ؼ� ������ �Է¹޾� a������ �־��ش�

			if (a == -1) {
				break;
			}

			if (a >= 50) {
				if (a <= 100) {
					System.out.println("�Է��� �ڿ����� 50�� 100���̿� �ֳ׿�");
				} else {
					System.out.println("�Է��� �ڿ����� 100���� ũ�׿�");
				}
			} else {
				System.out.println("�Է��� �ڿ����� 50���� �۳׿�");
				
			}
		}
		s.close();
	}
}