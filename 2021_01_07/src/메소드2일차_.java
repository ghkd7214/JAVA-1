import java.util.Scanner;

public class �޼ҵ�2����_ {
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int c;

		System.out.println("� Ŀ�Ǹ� �帱���? (1.����, 2.����, 3.��)");
		c = s.nextInt();

		coffee_m(c);  					// ������ �ƱԸ�Ʈ

		System.out.println("Ŀ�ǿ����ֽ��ϴ�.");
		
		s.close();
	}

	static int coffee_m(int button) {  	//�������� �Ķ����
		System.out.println("1.�߰ſ� ���� �غ��Ѵ�.");
		System.out.println("2.�������� �غ��Ѵ�.");

		switch (button) {

		case 1:
			System.out.println("3.����Ŀ�Ǹ� ź��.");
			break;

		case 2:
			System.out.println("3.����Ŀ�Ǹ� ź��.");
			break;

		case 3:
			System.out.println("3.��Ŀ�Ǹ� ź��.");
			break;

		default:
			System.out.println("3.�ƹ��ų� ź��.");
			break;
		}

		System.out.println("4.���� �״´�.");
		System.out.println("5.��Ǭ���� ��� ���δ�.");
		System.out.println();
		
		return 0;

	}

}
