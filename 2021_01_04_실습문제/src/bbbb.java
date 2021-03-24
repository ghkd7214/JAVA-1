
public class bbbb {

	public static void main(String[] args) {

		int x, y;

		System.out.println("2X + 4Y = 10 의 해구하기");

		for (x = -100; x < 100; x++) {

			for (y = -100; y < 100; y++) {

				if ((2 * x + 4 * y) == 10) {
					System.out.println("X = " + x + " Y = " + y);

				}
			}
		}

	}

}
