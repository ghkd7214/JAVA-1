import java.util.Scanner;

public class 연습예제_09 {

	public static void main(String[] args) {

		int x;
		int y;
		int hap=0;
		
		
		int arry[];						// 배열이 생성된게아닌 공간만 생성된 상태
		Scanner s = new Scanner(System.in);

		System.out.println("입력할 숫자의 개수를 입력해주세요 : ");

		y = s.nextInt();
		arry = new int[y];				// y크기의 배열생성
		

		for (int i = 0; i < y; i++) {
			System.out.println("숫자를 입력해주세요");
			x = s.nextInt();
			arry[i] = x;
			hap = hap + arry[i];
			
		}
		
		System.out.println(hap);
		
		
		/*
		int hap = 0;
		int arr[] = { 10, 20, 30, 40, 51 };

		for (int i = 0; i < arr.length; i++) {   				// for (int x : arr ) // for each 구문 //같음
			hap = hap + arr[i];
		}

		System.out.println(hap);
		*/
		
		s.close();
		
	}

}
