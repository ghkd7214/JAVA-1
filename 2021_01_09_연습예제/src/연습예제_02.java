
public class ��������_02 {

	public static void main(String[] args) {

		int i;
		int hap =0;
		
		for (i = 1; i <= 20; i++) {
			if ((i % 2 == 0) || (i % 3 == 0)) {
				hap = i+hap;
			}
		
		}
		
		System.out.println(hap);
	}

}
