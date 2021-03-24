import java.awt.*;
import javax.swing.*;


public class box {

	static class BOX extends JFrame{
		BOX(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("컴포넌트 연습");
			
			this.setLayout(new FlowLayout());
			
			ImageIcon img1= new ImageIcon("src/5.jpg");
			ImageIcon img2= new ImageIcon("src/6.jpg");
			JButton btn1 = new JButton("버튼1",img1);
			this.add(btn1);
			
			JLabel a1 = new JLabel("레이블입니다.");
			JLabel a2 = new JLabel(img2);
			this.add(a1);
			this.add(a2);
			
			JCheckBox ch1 =new JCheckBox("C++");
			JCheckBox ch2 =new JCheckBox("Java");
			JCheckBox ch3 =new JCheckBox("C#",true);
			this.add(ch1);
			this.add(ch2);
			this.add(ch3);
			
			
			
			
			
			
			ButtonGroup g = new ButtonGroup();

			setSize(256,256);
			setVisible(true);
			
			
		}
	
	}
	
	
	static public void main(String[] args) {

		
		new BOX();
	}

}
	

