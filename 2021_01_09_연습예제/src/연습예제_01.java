
public class ��������_01 {

	public static void main(String[] args) {

		//
		//
		//

		// 1 //int x �� ������ 10���� ũ�� 20���� ���� �� true�� ���ǽ�
		int x = 0;
		if (10 < x && x < 20) {

		}

		// 2 //char ch �� ������ �����̳� ���� �ƴ� �� true�� ���ǽ�
		char ch = 's';

		if (ch != ' ' || ch != '\t') {

		}

		// 3 //char ch �� ������ 'x' �Ǵ� 'X'�� ���� true ���ǽ�
		if (ch == 'x' || ch == 'X') {

		}

		// 4 //char ch �� ������ ����('1'~'9')�� �� true�� ���ǽ�
		char cha = '1';
		int i = (int) cha;

		if (i >= 49 && i <= 57) { // if ('0' <= ch && ch <= '9')

		}

		// 5 //char ch �� ������ ������(�빮�� �Ǵ� �ҹ���)�� �� true�� ���ǽ�
		char chb = 'A';

		int j = (int) chb;

		if (j >= 65 && j <= 90 || j >= 97 && j <= 122) { // if (('a' <= ch && ch <= 'z')||('A' <= ch && ch <= 'Z'))

		}
		System.out.println(j);

		// 6 //

		// 7 //

		String str = "yes";

		if (str == "yes") {

		}

		if (str.equals("yes")) {

		}

		// �Ѵٰ���

		int a = 100;
		int b = 200;
		int max;

		max = (a > b) ? a : b; // ���� ������  (�񱳱���) ? a : b   //���� �񱳱���()�� ���̸� a�� ��ȯ���ְ� �����̸� b�� ��ȯ���ش�.  
		
		System.out.println(max);
	}

}
