
public class ���� {

	int num;
	boolean ��; // �� : true

	����() {
		num = 1;
		�� = true;

		// this(1,true);

	}

	����(int n, boolean k) {
		this.num = n;
		this.�� = k;
	}

	String info() {
		String s;
		if (��) {
			s = "k";
		} else {
			s = "";
		}

		return num + (s);
	}

}
