import java.util.Scanner;

public class ��������_12 {

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
				System.out.println("������ ������ ���纸���� : ");
				ss = s.nextLine();

				char sss[] = ss.toCharArray();

				for (int t = 0; t < que.length; t++) {
					if (que[t] == sss[t]) {
						System.out.println("����");
						break;
					}
		
				}
				
			}
		
		}
		
	}

}
