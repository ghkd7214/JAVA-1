
public class �迭2����_2 {

	public static void main(String[] args) {
		/*
		 * int aa[] = new int[100]; int bb[] = new int[100];
		 * 
		 * int i = 0;
		 * 
		 * for (; i < aa.length; i++) { aa[i] = i * 2; System.out.println("\t"+aa[i]);
		 * 
		 * }
		 * 
		 * System.out.println();
		 * 
		 * for (i = 0; i < bb.length; i++) { bb[i] = 198 - i * 2;
		 * System.out.println("\t"+bb[i]);
		 * 
		 * }
		 * 
		 * int aa[] = { 10, 20, 30, 40, 50 };
		 * 
		 * int count, size;
		 * 
		 * count = aa.length; size = count * Integer.BYTES;
		 * 
		 * System.out.println("�迭 aa[]�� ����� ������"+count+"���Դϴ�.");
		 * System.out.println("�迭 aa[]�� ����� ��ü ũ���"+size+"����Ʈ�Դϴ�.");
		 */

		int aa[][] = new int[3][4];
		int i, k;
		int val = 1;

		
		for (i = 0; i < aa.length; i++) { for (k = 0; k < 4; k++) { aa[i][k] = val;
		val++; } }
		 
		val = 0;

		for (int x[] : aa) {
			for (int y : x) {
				System.out.println(y);
			}
		}

		for (int x[] : aa) { // ù������ x : {1,2,3,4} 2���� �迭���� foreach�� �迭�� ������
			for (int y : x) { // �׷��� foreach�� x�� �ѹ� ���θ� : {1,2,3,4}�ϱ� ���ʷ� 1�̿�
				System.out.println(y);
			}
		}

	}

}
