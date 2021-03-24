import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class grid {

	class GRID extends JFrame{
		GRID(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("GridLayout연습");
			this.setLayout(new GridLayout(3,3,10,10));
			
			JButton[] btn = new JButton[9];
			
			for (int i =0; i < 9 ; i++) {
				btn[i] = new JButton("버튼"+(i+1));
				this.add(btn[i]);
			}
			
			
			setSize(256,256);
			setVisible(true);
		}
	}	
			
	public void main(String[] args) {

		new GRID();
	
	}

}
