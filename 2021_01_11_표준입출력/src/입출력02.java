import java.io.FileInputStream;

public class 입출력02 {

	public static void main(String[] args) throws Exception {

		String path = 입출력02.class.getResource("").getPath();
		
		System.out.println(path);
		
		FileInputStream fis = new FileInputStream("C:/Users/user/Documents/temp/data1.txt");

		int ch;

		while ((ch = fis.read()) != -1) {   //EOF 파일의 끝
			System.out.print((char) ch);

		}

		fis.close();
	}

}

