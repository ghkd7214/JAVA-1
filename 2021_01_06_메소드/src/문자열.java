//import java.util.Scanner;

public class 문자열 {

	public static void main(String[] args) {

		// Scanner s = new Scanner(System.in);

		String str = "1 배고프다1 ㅇㅇ1ㅇㄴ ㄴㄴ..";
		String str2 = str;
		String str3[];

		/*
		 * System.out.print("문자열 입력 ==>"); str = s.nextLine();
		 * 
		 * System.out.print("출력 문자열 ==>");
		 * 
		 * if(!str.startsWith("(")) System.out.print("(");
		 * 
		 * System.out.print(str);
		 * 
		 * if(!str.startsWith(")")) System.out.print(")");
		 */

		System.out.println(str);

		str = str.substring(5); 	// 5글자를 잘라냄
		System.out.println(str);

		str2 = str.substring(5, 10);// 5번째부터 10번째까지 글자를 추출함
		System.out.println(str2);

		str3 = str.split("1");		// 1을 기준으로 문장을 잘라냄	

		for (int i = 0; i < str3.length; i++) {
			System.out.println("[" + i + "]" + str3[i]);
		}

		
		
		// s.close();

	}

}
