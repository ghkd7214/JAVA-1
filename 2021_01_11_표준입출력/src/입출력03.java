import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ¿‘√‚∑¬03 {

	public static void main(String[] args) throws IOException {
		FileReader f = new FileReader("C:/users/user/Documents/temp/data1.txt");
		
		BufferedReader b = new BufferedReader(f);
		
		String str = null;
		
		while((str = b.readLine()) != null) {
			System.out.println(str);
			
		}
		
		System.out.println(str);
		
		f.close();
		b.close();
		
	}

}
