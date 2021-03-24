
public class 연습예제_06 {

	public static void main(String[] args) {

		int i = 0, j = 0;
		int hap = 0;
		int str = 12345;
/*
		String Str = "12345";

		for (; i < Str.length(); i++) {

			System.out.println(Str.charAt(i));
			hap = hap + (Str.charAt(i) - '0'); // 문자열 1의 아스키코드값인 49 에서 문자열 0의 아스키코드값인 48을 빼는 과정
		}
*/
		while (str > 0) {
			hap = hap + str % 10;
			str = str / 10;

		}

		System.out.println(hap);

	}

}
