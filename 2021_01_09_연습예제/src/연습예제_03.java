
public class 연습예제_03 {

	public static void main(String[] args) {
		int hap = 0;
		int sum = 0; 
		int to = 0;

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				// System.out.printf("%d \t",j);
				hap = hap + j;
				
			}
			
		}
		System.out.println(hap);

		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
			to = to + sum;

		}
		System.out.println(to); 		//둘다같음
	}

}
