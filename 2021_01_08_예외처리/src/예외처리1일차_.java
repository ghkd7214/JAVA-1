
public class ����ó��1����_ {

	public static void main(String[] args) {

		int a = 100, b = 0;
		int rs;

		try {
			if (b == 0) {
				throw new Exception("0���� ����������? �ȵ˴ϴ�.");
			}
			rs = a / b;

			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("���α׷��� �����մϴ�.");
		}
	}

}
