
public class 연습예제_05 {

	public static void main(String[] args) {

		int i = 1;
		

		for (; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i + j == 6) {
					System.out.println(i + " " + j);
					break;
					
				}
				
			}
			
		}

	}

}
