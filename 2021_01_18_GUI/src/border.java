import java.awt.*;
import javax.swing.*;


public class border {
	class GUI extends JFrame{
		GUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("BorderLayout ����");
			
			this.setLayout(new BorderLayout(10,10));
			
			JButton b1 = new JButton("��ư1");
			JButton b2 = new JButton("��ư2");
			JButton b3 = new JButton("��ư3");
			JButton b4 = new JButton("��ư4");
			JButton b5 = new JButton("��ư5");
			
			this.add(b1,BorderLayout.NORTH);
			this.add(b2,BorderLayout.WEST);
			this.add(b3,BorderLayout.CENTER);
			this.add(b4,BorderLayout.EAST);
			this.add(b5,BorderLayout.SOUTH);
			
			setSize(256,256);
			setVisible(true);
			
		}
	}
	
	public void main(String[] args) {

		new GUI();
	
	}

}
	
	

