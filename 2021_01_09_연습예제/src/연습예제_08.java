import java.util.Scanner;

public class ��������_08 {

	public static void main(String[] args) {

		String x;
		boolean b = false;

		Scanner s = new Scanner(System.in);

		System.out.println("�����Ǻ� ���α׷��Դϴ�.");
		System.out.println("�Ǻ��� ���ڿ��� �Է����ּ���");
		x = s.nextLine();

		for (int i = 0; i < x.length(); i++) {

			if ('0' <= x.charAt(i) && x.charAt(i) <= '9') {
				System.out.print(i + 1 + "\t");
				b = true;
				System.out.println();
			}

		}

		if (b == true) {
			System.out.print("�Է��� ���ڿ����� ���ڰ� �ֽ��ϴ�.");

		} else {
			System.out.print("�Է��� ���ڿ����� ���ڰ� �����ϴ�.");
		}
	
	s.close();
	}

}
