package 라이브러리;
import java.util.Scanner;

public class 문제4 {

	public static void asd() {
		Scanner s = new Scanner(System.in);

		try {
			int row, col;

			System.out.println("만들 배열의 행개수를 입력 :");
			row = s.nextInt();

			System.out.println("만들 배열의 열개수를 입력 :");
			col = s.nextInt();

			int aa[][] = new int[row][col];

			int i, j;

			int val = 1;

			for (i = 0; i < row; i++) {
				for (j = 0; j < col; j++) {
					aa[i][j] = val;
					val++;
				}

			}

			for (i = 0; i < row; i++) {
				System.out.println();
				for (j = 0; j < col; j++) {
					System.out.print(aa[i][j] + "\t");
				}
				
			}
			
		} catch (Exception e) {
			System.out.println("숫자를 입력해주세요.");

		}

	}

	public static void main(String[] args) {

		asd();
		System.out.println();
		System.out.print("종료됨");
	}

}
