import java.util.Scanner;

public class cccc {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int a, b, c=1;

		a = ((int) (Math.random() * 100));

		System.out.println("1~100������ ���� ���纸����");

		while (true) {
			b = s.nextInt();

			if (b == a) {

				System.out.println("�����Դϴ�!");
				System.out.println("������� �ɸ� Ƚ�� :"+ c );
				break;

			} else if (b < a) {
				System.out.println("���� Ů�ϴ�.");
				c++;

			} else {
				System.out.println("���� �۽��ϴ�.");
				c++;
			}
			
		}

	}

}
