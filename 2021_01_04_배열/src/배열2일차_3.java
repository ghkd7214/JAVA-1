import java.util.Scanner;

public class �迭2����_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int row, col;

		System.out.println("�ళ���� �Է� :");
		row = s.nextInt();

		System.out.println("�������� �Է� :");
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