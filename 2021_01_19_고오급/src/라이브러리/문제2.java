package 라이브러리;
import java.util.Scanner;

public class 문제2 {

	
	static void asd() {
		
		Scanner s = new Scanner(System.in);
		
		try {
			System.out.println("저장할 단어의 수를 입력해주세요 : ");
			int e = s.nextInt();
			
			String z[] = new String[e];
			
			for(int i = 0; i<z.length ;i++) {
				
				System.out.println("저장할 단어를 입력해주세요 ("+(i+1)+"번째단어)");
				
				String q = s.next();
				z[i] = q;
				
			}
			
			System.out.print("저장된 단어는");
			
			for (int i = 0; i<z.length ;i++) {
				System.out.print("["+z[i]+"]");
				
				
			}
			System.out.println("입니다.");
			
			
		}catch (Exception e) {
			System.out.println("정수형 데이터를 입력해주세요.");

		}
		
	}
	
	
	
	public static void main(String[] args) {

		asd();
		
		
		
		
		System.out.println("종료");
		
	}

}
