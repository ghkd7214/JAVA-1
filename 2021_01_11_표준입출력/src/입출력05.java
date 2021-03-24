import java.io.FileOutputStream;

public class 입출력05 {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("C:/users/user/Documents/temp/data3.txt");
		
		int ch ;
		while ((ch = System.in.read()) != 13)
			fos.write(ch);
		
		fos.close();
		
	}
	
}
//콘솔창 -> 메모장(외부)