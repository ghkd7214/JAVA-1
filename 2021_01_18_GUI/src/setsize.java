import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class setsize {

	static class MyGUI extends JFrame{
		MyGUI(){	//������
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//�Ϲ������� �빮�� �ʵ�� ���

			setTitle("FlowLayout ����");
			this.setLayout(new FlowLayout());

			
			JButton b1 = new JButton("��ư1");
			JButton b2 = new JButton("��ư2");
			JButton b3 = new JButton("��ư3");
			
			
			this.add(b1);
			this.add(b2);
			this.add(b3);
			

			setSize(500,500);
			
			
			setVisible(true);
			
			
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {

		new MyGUI();
	
	
		
	}
	
}