import java.util.Scanner;

public class 연습예제_08 {

	public static void main(String[] args) {

		String x;
		boolean b = false;

		Scanner s = new Scanner(System.in);

		System.out.println("숫자판별 프로그램입니다.");
		System.out.println("판별한 문자열을 입력해주세요");
		x = s.nextLine();

		for (int i = 0; i < x.length(); i++) {

			if ('0' <= x.charAt(i) && x.charAt(i) <= '9') {
				System.out.print(i + 1 + "\t");
				b = true;
				System.out.println();
			}

		}

		if (b == true) {
			System.out.print("입력한 문자열에는 숫자가 있습니다.");

		} else {
			System.out.print("입력한 문자열에는 숫자가 없습니다.");
		}
	
	s.close();
	}

}
