
public class �ڵ��� {

	int ����;
	double ����;
	String ����;
	String ������;
	String ����;
	String �����̸�;
	int �ӵ�;
	private int prise; 				// ���� //�ʵ�� �����̺� �޼ҵ�� �ۺ�

	
	public void set����(int ����) { 	// Ŭ�����ȿ��� ������ ������Ʈ = �ν��Ͻ��� �θ�
		this.prise = ����;	
	}
	
	public int get����() {
		return prise;
	}

	public void ����() {					//
		�ӵ� = �ӵ� + 10;
	}

	public void ����(int value) {			//�����ε� �Ķ���ͷ� ���� 
		�ӵ� = �ӵ� + 10;
	}

	public void ����() {
		if (�ӵ� <= 0) {
			�ӵ� = 0;
		}
		�ӵ� = �ӵ� - 10;
	}

	public String get����() { 		// ���α׷��� ���̿��� get�� �޼ҵ� �տ� �پ������� �ʵ忡 ������ �����͸� �д°����� ����
		return ����; 					// �Ϲ�������
	}

	public void set����(String ����) { // ���α׷��� ���̿��� set�� �޼ҵ� �տ� ������ �ʵ忡 �����Ͽ� �����͸� ���°����� ����
		this.���� = "����";
	}

	
}
