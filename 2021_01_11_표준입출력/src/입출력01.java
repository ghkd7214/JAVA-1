import java.io.IOException;

public class 입출력01 {

	public static void main(String[] args) {

		String ss = "geeo95";
		String input = "";

		int key;

		try {
			System.out.print("ID입력 : ");
			
			while ((key = System.in.read()) != 13) {   //Cariage Return의 아스키코드: 13  엔터 = line feed + Cariage Return
				input = input + ((char)key);
	
			}

			if (input.equals(ss)) {
				System.out.println(ss+"님 반갑습니다.");
				
			} else {
				System.out.println("등록되지 않은 아이디입니다.");
				
			}
		} catch (IOException e) {
			e.printStackTrace();
			
		}

	}

}
