//import java.util.Scanner;

public class ���ڿ� {

	public static void main(String[] args) {

		// Scanner s = new Scanner(System.in);

		String str = "1 �������1 ����1���� ����..";
		String str2 = str;
		String str3[];

		/*
		 * System.out.print("���ڿ� �Է� ==>"); str = s.nextLine();
		 * 
		 * System.out.print("��� ���ڿ� ==>");
		 * 
		 * if(!str.startsWith("(")) System.out.print("(");
		 * 
		 * System.out.print(str);
		 * 
		 * if(!str.startsWith(")")) System.out.print(")");
		 */

		System.out.println(str);

		str = str.substring(5); 	// 5���ڸ� �߶�
		System.out.println(str);

		str2 = str.substring(5, 10);// 5��°���� 10��°���� ���ڸ� ������
		System.out.println(str2);

		str3 = str.split("1");		// 1�� �������� ������ �߶�	

		for (int i = 0; i < str3.length; i++) {
			System.out.println("[" + i + "]" + str3[i]);
		}

		
		
		// s.close();

	}

}
