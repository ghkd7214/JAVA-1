
public class 예외처리1일차_ {

	public static void main(String[] args) {

		int a = 100, b = 0;
		int rs;

		try {
			if (b == 0) {
				throw new Exception("0으로 나누려구요? 안됩니다.");
			}
			rs = a / b;

			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("프로그램을 종료합니다.");
		}
	}

}
