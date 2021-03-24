import java.util.Scanner;

public class 연습예제_12 {

	public static void main(String[] args) {

		String q[] = { "hello" };
		String ss;

		for (int i = 0; i < q.length; i++) {
			char que[] = q[i].toCharArray();
			int idx = (int) (Math.random() * que.length);
			char tmp = que[i];
			que[i] = que[idx];
			que[idx] = tmp;

		
			for (int k = 0; k < que.length; k++) {
				System.out.print(que[k]);

			}
			System.out.println();

			Scanner s = new Scanner(System.in);

			while (true) {
				System.out.println("원래의 문장을 맞춰보세요 : ");
				ss = s.nextLine();

				char sss[] = ss.toCharArray();

				for (int t = 0; t < que.length; t++) {
					if (que[t] == sss[t]) {
						System.out.println("정답");
						break;
					}
		
				}
				
			}
		
		}
		
	}

}
