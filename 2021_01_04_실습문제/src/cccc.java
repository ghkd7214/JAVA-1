import java.util.Scanner;

public class cccc {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int a, b, c=1;

		a = ((int) (Math.random() * 100));

		System.out.println("1~100사이의 값을 맞춰보세요");

		while (true) {
			b = s.nextInt();

			if (b == a) {

				System.out.println("정답입니다!");
				System.out.println("정답까지 걸린 횟수 :"+ c );
				break;

			} else if (b < a) {
				System.out.println("보다 큽니다.");
				c++;

			} else {
				System.out.println("보다 작습니다.");
				c++;
			}
			
		}

	}

}
