import java.util.Scanner;

public class ��������_09 {

	public static void main(String[] args) {

		int x;
		int y;
		int hap=0;
		
		
		int arry[];						// �迭�� �����ȰԾƴ� ������ ������ ����
		Scanner s = new Scanner(System.in);

		System.out.println("�Է��� ������ ������ �Է����ּ��� : ");

		y = s.nextInt();
		arry = new int[y];				// yũ���� �迭����
		

		for (int i = 0; i < y; i++) {
			System.out.println("���ڸ� �Է����ּ���");
			x = s.nextInt();
			arry[i] = x;
			hap = hap + arry[i];
			
		}
		
		System.out.println(hap);
		
		
		/*
		int hap = 0;
		int arr[] = { 10, 20, 30, 40, 51 };

		for (int i = 0; i < arr.length; i++) {   				// for (int x : arr ) // for each ���� //����
			hap = hap + arr[i];
		}

		System.out.println(hap);
		*/
		
		s.close();
		
	}

}
