import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class keyevent {

	static class KEY extends JFrame {
		KEY(){
			setDefaultCloseOperation(3);
			setTitle("�̺�Ʈó��");
			this.setLayout(new FlowLayout());
			
			JTextField txt = new JTextField(10);
			JTextArea area = new JTextArea(10,10);

			this.add(txt);
			this.add(area);
			
			txt.addKeyListener(new KeyAdapter() {				//ctrl +space bar ������ �ڵ��ϼ����� (�̰� �� ��Ȯ�ϴ� �̰ž���  
				@Override
				public void keyReleased(KeyEvent e) {
					// TODO Auto-generated method stub

					int key = e.getKeyCode();
					
					if(key == KeyEvent.VK_ENTER) {
						String str = txt.getText();
						area.setText(area.getText()+str+'\n');
						txt.setText("");
					}
					
					if (!(key >= KeyEvent.VK_0 && key <= KeyEvent.VK_9)) {
						String str = txt.getText();
						int strlen =str.length();
						if (strlen != 0) {
							txt.setText(str.substring(0,strlen -1));
						}
							
					}
				}
			});
			

			
			
			setSize(500,200);
			setVisible(true);
			
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		new KEY();
	}

}
