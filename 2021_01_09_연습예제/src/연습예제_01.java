
public class 연습예제_01 {

	public static void main(String[] args) {

		//
		//
		//

		// 1 //int x 형 변수가 10보다 크고 20보다 작을 때 true인 조건식
		int x = 0;
		if (10 < x && x < 20) {

		}

		// 2 //char ch 형 변수가 공백이나 탭이 아닐 때 true인 조건식
		char ch = 's';

		if (ch != ' ' || ch != '\t') {

		}

		// 3 //char ch 형 변수가 'x' 또는 'X'일 때인 true 조건식
		if (ch == 'x' || ch == 'X') {

		}

		// 4 //char ch 형 변수가 숫자('1'~'9')일 때 true인 조건식
		char cha = '1';
		int i = (int) cha;

		if (i >= 49 && i <= 57) { // if ('0' <= ch && ch <= '9')

		}

		// 5 //char ch 형 변수가 영문자(대문자 또는 소문자)일 때 true인 조건식
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

		// 둘다같음

		int a = 100;
		int b = 200;
		int max;

		max = (a > b) ? a : b; // 삼항 연산자  (비교구문) ? a : b   //앞의 비교구문()이 참이면 a를 반환해주고 거짓이면 b를 반환해준다.  
		
		System.out.println(max);
	}

}
