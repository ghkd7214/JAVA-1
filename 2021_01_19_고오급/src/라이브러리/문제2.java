package ���̺귯��;
import java.util.Scanner;

public class ����2 {

	
	static void asd() {
		
		Scanner s = new Scanner(System.in);
		
		try {
			System.out.println("������ �ܾ��� ���� �Է����ּ��� : ");
			int e = s.nextInt();
			
			String z[] = new String[e];
			
			for(int i = 0; i<z.length ;i++) {
				
				System.out.println("������ �ܾ �Է����ּ��� ("+(i+1)+"��°�ܾ�)");
				
				String q = s.next();
				z[i] = q;
				
			}
			
			System.out.print("����� �ܾ��");
			
			for (int i = 0; i<z.length ;i++) {
				System.out.print("["+z[i]+"]");
				
				
			}
			System.out.println("�Դϴ�.");
			
			
		}catch (Exception e) {
			System.out.println("������ �����͸� �Է����ּ���.");

		}
		
	}
	
	
	
	public static void main(String[] args) {

		asd();
		
		
		
		
		System.out.println("����");
		
	}

}
