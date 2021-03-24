import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class cal extends JFrame{

	cal(){
		setDefaultCloseOperation(3);   //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 와 같다
		setTitle("계산기");
		
		setLayout(new GridLayout(5,4,10,10));
		
		
		JButton b[] = new JButton[16];
		JTextField result[] = new JTextField[4];
		
		for (int i = 0; i < 4; i++) {
			result[i] = new JTextField();
			this.add(result[i]);
		}
		
		
		for (int i = 0; i < 16; i++) {
			b[i] = new JButton();
			this.add(b[i]);
			
		}
		
		b[0].setText("7");
		b[1].setText("8");
		b[2].setText("9");
		b[4].setText("4");
		b[5].setText("5");
		b[6].setText("6");
		b[8].setText("1");
		b[9].setText("2");
		b[10].setText("3");
		b[13].setText("0");
		
		
		b[8].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(result[0] == null) {
					result[0].setText(b[8].getText()+b[8].getText());
				}
				
			}
			
		});
		
		
		
		setSize(500,500);
		setVisible(true);
	}
	
	
	
	
	
	public static void main(String[] args) {
		new cal();
	}

}
