import java.io.FileInputStream;

public class �����02 {

	public static void main(String[] args) throws Exception {

		String path = �����02.class.getResource("").getPath();
		
		System.out.println(path);
		
		FileInputStream fis = new FileInputStream("C:/Users/user/Documents/temp/data1.txt");

		int ch;

		while ((ch = fis.read()) != -1) {   //EOF ������ ��
			System.out.print((char) ch);

		}

		fis.close();
	}

}

