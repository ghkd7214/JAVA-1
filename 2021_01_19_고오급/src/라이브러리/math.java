package 라이브러리;

public class math {

	public static void main(String[] args) {

		Integer s[] = { 9, 3, 7, 2, 5 };

		Integer max, min;
		int i, j;

		System.out.print("정렬 전 ==> ");
		for (i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}

		for (i = 0; i < 4; i++) {
			for (j = i; j < s.length; j++) {
				max = Math.max(s[i], s[j]);
				min = Math.min(s[i], s[j]);
				s[i] = min;
				s[j] = max;
				
			}
		}
		System.out.print("\n정렬 후 ==> ");
		for (i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}

	}

}
