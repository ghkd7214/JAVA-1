import javax.swing.JFrame;

public class test {

	static class MyGUI extends JFrame{
		MyGUI(){	//������
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//�Ϲ������� �빮�� �ʵ�� ���

			
			setTitle("GUI ����");
			setSize(500,500);
			setVisible(true);
			
			
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {

			new MyGUI();
		
	}

}
