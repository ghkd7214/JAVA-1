
public class �޼ҵ�2����_3 {

	public static String fun1(String a) {
		a = a + 1;
		System.out.println("���޹��� a ==>" + a);
		return "adsa";
	}

	public static void main(String[] args) {
		int a = 10;

		fun1("asd");
		System.out.println("fun1() ���� ���� a ==>" + a);
		System.out.println(fun1("ad")+1);
		//�������� �ڸ�()�� ���� �Ǵ� ����Ŭ���� Ÿ���� ������ �����Ǹ� call by value
		
		
	}

}
