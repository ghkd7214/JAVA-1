import java.util.Scanner;

public class �ǽ� {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a;
		
		
		while(true) {
			
			System.out.println("���밪�� ã�� ���α׷��Դϴ�.");
			System.out.println("�Ǻ��� ������ �Է��ϼ���.(���Ḧ ���Ͻø� 0�� �Է��ϼ���) : ");
			a = s.nextInt();
			
			if (a == 0) {
				break;
			}
			
			if(a > 0 ) {
					System.out.printf("%d�����밪�� %d�Դϴ�.\n", a, a );
			}
			else {
				System.out.printf("%d�����밪�� %d�Դϴ�.\n", a, -a );
			}
		}
	
		s.close();
	
	}
}