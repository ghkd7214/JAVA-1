import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class mouse {

	static class MOUSE extends JFrame{
		
		MOUSE(){
			setDefaultCloseOperation(3);
			setTitle("�̺�Ʈó��");
			this.setLayout(new FlowLayout());
			
			JTextField txtx = new JTextField(10);
			JTextField txty = new JTextField(10);
			this.add(txtx);
			this.add(txty);
			
			this.addMouseListener(new MouseListener() {

				@Override
				public void mouseClicked(MouseEvent e) {		//���콺�� Ŭ��������
					txtx.setText(Integer.toString(e.getX()));
					txty.setText(Integer.toString(e.getY()));
				}

				@Override
				public void mousePressed(MouseEvent e) {		//���콺�� ��������
					
				}

				@Override
				public void mouseReleased(MouseEvent e) {		//���콺�� ������
					
				}

				@Override
				public void mouseEntered(MouseEvent e) { 		//���콺�� ������Ʈ â���� �ö����� (������)
					
				}

				@Override
				public void mouseExited(MouseEvent e) {			//���콺�� ������Ʈ â������ ��������
					
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
