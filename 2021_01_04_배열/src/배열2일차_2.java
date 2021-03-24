
public class 배열2일차_2 {

	public static void main(String[] args) {
		/*
		 * int aa[] = new int[100]; int bb[] = new int[100];
		 * 
		 * int i = 0;
		 * 
		 * for (; i < aa.length; i++) { aa[i] = i * 2; System.out.println("\t"+aa[i]);
		 * 
		 * }
		 * 
		 * System.out.println();
		 * 
		 * for (i = 0; i < bb.length; i++) { bb[i] = 198 - i * 2;
		 * System.out.println("\t"+bb[i]);
		 * 
		 * }
		 * 
		 * int aa[] = { 10, 20, 30, 40, 50 };
		 * 
		 * int count, size;
		 * 
		 * count = aa.length; size = count * Integer.BYTES;
		 * 
		 * System.out.println("배열 aa[]의 요소의 개수는"+count+"개입니다.");
		 * System.out.println("배열 aa[]의 요소의 전체 크기는"+size+"바이트입니다.");
		 */

		int aa[][] = new int[3][4];
		int i, k;
		int val = 1;

		
		for (i = 0; i < aa.length; i++) { for (k = 0; k < 4; k++) { aa[i][k] = val;
		val++; } }
		 
		val = 0;

		for (int x[] : aa) {
			for (int y : x) {
				System.out.println(y);
			}
		}

		for (int x[] : aa) { // 첫바퀴의 x : {1,2,3,4} 2차원 배열에서 foreach는 배열을 가져옴
			for (int y : x) { // 그래서 foreach로 x를 한번 더부름 : {1,2,3,4}니까 최초론 1이옴
				System.out.println(y);
			}
		}

	}

}
