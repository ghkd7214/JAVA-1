package ���̺귯��;
import java.util.Scanner;

public class ����4 {

	public static void asd() {
		Scanner s = new Scanner(System.in);

		try {
			int row, col;

			System.out.println("���� �迭�� �ళ���� �Է� :");
			row = s.nextInt();

			System.out.println("���� �迭�� �������� �Է� :");
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
			System.out.println("���ڸ� �Է����ּ���.");

		}

	}

	public static void main(String[] args) {

		asd();
		System.out.println();
		System.out.print("�����");
	}

}
