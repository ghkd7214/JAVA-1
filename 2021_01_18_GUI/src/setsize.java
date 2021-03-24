import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class setsize {

	static class MyGUI extends JFrame{
		MyGUI(){	//생성자
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//일반적으로 대문자 필드는 상수

			setTitle("FlowLayout 연습");
			this.setLayout(new FlowLayout());

			
			JButton b1 = new JButton("버튼1");
			JButton b2 = new JButton("버튼2");
			JButton b3 = new JButton("버튼3");
			
			
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