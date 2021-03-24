package 라이브러리;
import java.io.*;

public class 문제3 {
		 
		

	public static void main(String[] args) throws IOException {
		FileReader f = new FileReader("C:/users/user/Documents/temp/text.txt");
		
		BufferedReader b = new BufferedReader(f);
		
		String str = null;
		
		while((str = b.readLine()) != null) {
			System.out.println(str);
			
		}
		
		
		FileOutputStream fo = new FileOutputStream("C:/users/user/Documents/temp/text.txt");
		
		
		int ch ;
		while ((ch = System.in.read()) != 13)
			fo.write(ch);
		
		
		
		f.close();
		b.close();
		fo.close();
		
	}

}



// 상대경로 지정방법이랑 앞서 입력해두었던 데이터의 손실없이 쓰는방법을 모르겠습니다.