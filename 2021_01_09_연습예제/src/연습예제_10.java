public class ��������_10 {

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int hap = 0;
		int av = 0;

		for (int i = 0; i < arr.length; i++) { 			// arr.length ���� ����
			for (int j = 0; j < arr[0].length; j++) { 	// arr.[0]length ���� ����
				hap = hap + arr[i][j];
				av++;
			}
		
		}
		
		System.out.println();
		System.out.println(1.0*hap / av);    			//1.0�� ���ؼ� �Ǽ��� �ٲ���  ����̶� ������

	}

}
