package ���̺귯��;
import java.io.*;

public class ����3 {
		 
		

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



// ����� ��������̶� �ռ� �Է��صξ��� �������� �սǾ��� ���¹���� �𸣰ڽ��ϴ�.