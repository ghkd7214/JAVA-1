class myChar {
	char x;
	char y;
}

public class �޼ҵ�3����_1 {

	static void fun1(char x, char y) {	// call by val �׳� ���� A �� Z �� �Ѿ��
		char imsi;
		imsi = x;
		x = y;
		y = imsi;						// ������ �״�� �ֹߵ�
	}

	static void fun1(myChar ch) { 		// call by ref ()���� ������Ʈ�� �ּҸ� �Ѱ���
		char imsi;
		imsi = ch.x;
		ch.x = ch.y;
		ch.y = imsi;

	}

	public static void main(String[] args) {
		char x = 'A', y = 'Z';
		System.out.println("������   : x = " + x + " y = " + y);
		fun1(x, y);
		System.out.println("���� ��������	: x = " + x + " y = " + y);

		myChar ch = new myChar();		//ȣ���� //Ŭ������ ������Ʈ�� =  new Ŭ������();
		ch.x = 'A';						//1������ 
		ch.y = 'Z';
		System.out.println("������   : x = " + x + " y = " + y);
		fun1(ch);
		System.out.println("�ּ��� ��������	: x = " + ch.x + " y = " + ch.y);

	}

}
