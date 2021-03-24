//import java.util.Scanner;

public class 배열연습 {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40 };

		/*
		 * for (i = 0; i < a.length; i++) {
		 * 
		 * System.out.println(i+1+"번째 숫자를 입력하세요 :"); a[i] = s.nextInt();
		 * 
		 * hap = hap + a[i]; }
		 */

		for (int x : a) { // foreach 반복 // 배열 a가 가지고있는 모든 원소를 순서대로 하나씩 사용함

			System.out.println(x);
		}

	}

}
