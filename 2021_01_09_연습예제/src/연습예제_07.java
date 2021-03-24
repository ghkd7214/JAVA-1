import java.util.Scanner;

public class 연습예제_07 {

	public static void main(String[] args) {

		int n;
		int i;
		int num1, num2, num3, temp;

		Scanner s = new Scanner(System.in);
		System.out.println("피보나치수열의 n번째 수를 구하는 프로그램입니다.");
		System.out.println("n을 입력해주세요");

		n = s.nextInt();

		num1 = 1;
		num2 = 1;
		num3 = 0;
		temp = 0;

		System.out.print(num1 + " " + num2+" ");

		for (i = 0; i < n; i++) {
			num3 = num1 + num2;
			temp = num1;
			num1 = num2;
			num2 = num3;
			System.out.print(num3+" ");
		}
		System.out.println();
		System.out.println(temp);
		
		s.close();
	}

}
