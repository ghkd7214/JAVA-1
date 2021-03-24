
public class stack11 {

	public static void main(String[] args) {
		int[] a;// 기초변수가 아니라 참조변수(스택이 아닌 힙에 저장됨)


		a = new int[100];// a라는 이름의 100칸짜리 배열을 생성 //Scanner와 같은 참조형변수라 new를 사용해야함 //index

		a[72]= 23;
		
		
		for (int i = 0; i < a.length; i++) {  //a.length a의 길이 만큼;
			System.out.println(a[i]);
			
		}

	}
	
}
