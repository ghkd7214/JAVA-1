
public class ��������_06 {

	public static void main(String[] args) {

		int i = 0, j = 0;
		int hap = 0;
		int str = 12345;
/*
		String Str = "12345";

		for (; i < Str.length(); i++) {

			System.out.println(Str.charAt(i));
			hap = hap + (Str.charAt(i) - '0'); // ���ڿ� 1�� �ƽ�Ű�ڵ尪�� 49 ���� ���ڿ� 0�� �ƽ�Ű�ڵ尪�� 48�� ���� ����
		}
*/
		while (str > 0) {
			hap = hap + str % 10;
			str = str / 10;

		}

		System.out.println(hap);

	}

}
