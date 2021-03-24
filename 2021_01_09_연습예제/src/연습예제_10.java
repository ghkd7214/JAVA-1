public class 연습예제_10 {

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int hap = 0;
		int av = 0;

		for (int i = 0; i < arr.length; i++) { 			// arr.length 행의 길이
			for (int j = 0; j < arr[0].length; j++) { 	// arr.[0]length 행의 길이
				hap = hap + arr[i][j];
				av++;
			}
		
		}
		
		System.out.println();
		System.out.println(1.0*hap / av);    			//1.0을 곱해서 실수로 바꿔줌  평균이라 정수로

	}

}
