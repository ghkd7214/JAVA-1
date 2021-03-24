import java.util.Scanner;

public class 배열2일차_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int row, col;

		System.out.println("행개수를 입력 :");
		row = s.nextInt();

		System.out.println("열개수를 입력 :");
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

	}

}