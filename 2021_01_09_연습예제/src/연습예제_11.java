
public class 연습예제_11 {

	public static void main(String[] args) {

		int an[] = { 1, 3, 5 };

		for (int x = 0; x < an.length; x ++) {
			System.out.println();
			System.out.print(an[x] + " : ");
			for (int i = 0; i < an[x]; i++) {
				System.out.print("*");
			}
			
		}

	}

}
