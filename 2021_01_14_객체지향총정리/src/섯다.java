
public class ¼¸´Ù {

	int num;
	boolean ±¤; // ±¤ : true

	¼¸´Ù() {
		num = 1;
		±¤ = true;

		// this(1,true);

	}

	¼¸´Ù(int n, boolean k) {
		this.num = n;
		this.±¤ = k;
	}

	String info() {
		String s;
		if (±¤) {
			s = "k";
		} else {
			s = "";
		}

		return num + (s);
	}

}
