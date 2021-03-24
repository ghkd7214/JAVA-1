
public class ÇÐ»ý {

	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage1() {
		return (int) (getTotal() / 3f * 10 + 0.5f) / 10f;

	}

	float getAverage2() {
		return Math.round((getTotal()/3f*10f))/10f;
		
	}
	
}
