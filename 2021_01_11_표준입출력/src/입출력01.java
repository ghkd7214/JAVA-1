import java.io.IOException;

public class �����01 {

	public static void main(String[] args) {

		String ss = "geeo95";
		String input = "";

		int key;

		try {
			System.out.print("ID�Է� : ");
			
			while ((key = System.in.read()) != 13) {   //Cariage Return�� �ƽ�Ű�ڵ�: 13  ���� = line feed + Cariage Return
				input = input + ((char)key);
	
			}

			if (input.equals(ss)) {
				System.out.println(ss+"�� �ݰ����ϴ�.");
				
			} else {
				System.out.println("��ϵ��� ���� ���̵��Դϴ�.");
				
			}
		} catch (IOException e) {
			e.printStackTrace();
			
		}

	}

}
