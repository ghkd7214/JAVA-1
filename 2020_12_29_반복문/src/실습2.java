import java.util.Scanner;

public class ½Ç½À2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a;
		
		

		
		while(true) {
			
			System.out.println("Ãâ»ý¿¬µµ¸¦ ÀÔ·ÂÇÏ¼¼¿ä.(-1À» ÀÔ·Â½Ã Á¾·áµË´Ï´Ù.) :");
			a = s.nextInt();
			
			if (a == -1) {
				break;
			}
			
			//

			
			switch(a % 12) {
			
			case 0 :
				System.out.println("¿ø¼þÀÌ¶ì");
				break;
			case 1 :
				System.out.println("´ß¶ì");
				break;
			case 2 :
				System.out.println("°³¶ì");
				break;
			case 3 :
				System.out.println("µÅÁö¶ì");
				break;
			case 4 :
				System.out.println("Áã¶ì");
				break;
			case 5:
				System.out.println("¼Ò¶ì");
				break;
			case 6 :
				System.out.println("È£¶ûÀÌ¶ì");
				break;
			case 7 :
				System.out.println("Åä³¢¶ì");
				break;
			case 8 :
				System.out.println("¿ë¶ì");
				break;
			case 9 :
				System.out.println("¹ì¶ì");
				break;
			case 10 :
				System.out.println("¸»¶ì");
				break;
			case 11 :
				System.out.println("¾ç¶ì");
				break;
						
			}
		}
		
		
		s.close();
	}
}