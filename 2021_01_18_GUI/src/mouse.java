import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class mouse {

	static class MOUSE extends JFrame{
		
		MOUSE(){
			setDefaultCloseOperation(3);
			setTitle("이벤트처리");
			this.setLayout(new FlowLayout());
			
			JTextField txtx = new JTextField(10);
			JTextField txty = new JTextField(10);
			this.add(txtx);
			this.add(txty);
			
			this.addMouseListener(new MouseListener() {

				@Override
				public void mouseClicked(MouseEvent e) {		//마우스를 클릭했을때
					txtx.setText(Integer.toString(e.getX()));
					txty.setText(Integer.toString(e.getY()));
				}

				@Override
				public void mousePressed(MouseEvent e) {		//마우스를 눌렀을때
					
				}

				@Override
				public void mouseReleased(MouseEvent e) {		//마우스를 땠을때
					
				}

				@Override
				public void mouseEntered(MouseEvent e) { 		//마우스가 컴포넌트 창위로 올라갔을때 (들어갔을때)
					
				}

				@Override
				public void mouseExited(MouseEvent e) {			//마우스가 컴포넌트 창밖으로 나갔을때
					
				}
				
			});
			
			setSize(500,200);
			setVisible(true);
			
		}
		
	}
	
	
	public static void main(String[] args) {
		new MOUSE();
	}

}
