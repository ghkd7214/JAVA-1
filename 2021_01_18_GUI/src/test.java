import javax.swing.JFrame;

public class test {

	static class MyGUI extends JFrame{
		MyGUI(){	//생성자
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//일반적으로 대문자 필드는 상수

			
			setTitle("GUI 연습");
			setSize(500,500);
			setVisible(true);
			
			
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {

			new MyGUI();
		
	}

}
