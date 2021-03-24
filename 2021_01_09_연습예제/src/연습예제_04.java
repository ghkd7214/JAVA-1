
public class 연습예제_04 {

	public static void main(String[] args) {

		int i = 0;
		int hap = 0;

		for (i = 1; hap < 100; i++) {
			if (i % 2 == 1) {
				hap = hap + i;
			} else {
				hap = hap - i;

			}

		}

		System.out.println(i-1 + " " + hap);

		
		System.out.println();

		
		int num = 0;
		int s = 1;
		int sum = 0;

		for (int j = 1; true; j++, s = s * -1) {
			num = s * j;
			sum = sum + num;
			if (sum >= 100) {
				break;

			}

		}
		System.out.println(num + " " + sum);

	}

}