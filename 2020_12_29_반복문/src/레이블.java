public class 레이블 {

	public static void main(String[] args) {

		int hap = 0;
		int i;

		나가고싶어: for (;;) {

			for (i = 1; i <= 100; i++) {
				hap += i;
				if (hap > 2000) {
					System.out.println(hap + "\n");
					hap = 0;

					break 나가고싶어;
				}

			}

		}

	}
	
}
