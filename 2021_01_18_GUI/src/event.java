import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class event {

	static class MYGUI extends JFrame{
		MYGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("�̺�Ʈ ó��");
			
			this.setLayout(new FlowLayout());
			
			
			JButton btn1 = new JButton("��ư1");
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					btn1.setBackground(Color.red);
					
				}
			});
			
			this.add(btn1);
			
			setSize(200,200);
			setVisible(true);
			
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		new MYGUI();
		
	}

}
