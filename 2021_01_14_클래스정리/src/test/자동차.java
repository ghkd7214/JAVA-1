package test;


interface �ڵ��� {
	void �����Ѵ�();
	
}


interface ���� {
	void �߻��Ѵ�();
	
}


class ��ũ implements  �ڵ���, ����{			//���߻���� ���������ʴ� �ڹٿ��� ���߻���� �ޱ����� interface / implements
	
	@Override
	public void �����Ѵ�() {
		System.out.println("��ũ�� �������ϴ�.");
	}

	@Override
	public void �߻��Ѵ�() {
		System.out.println("��ũ�� ���� �߻��մϴ�.");
	}
	
	
}

