import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class cal2 extends JFrame {
	cal2() {
		setDefaultCloseOperation(3); // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); �� ����
		setTitle("����");

		setLayout(new FlowLayout());

		JLabel la1 = new JLabel("ù��° ��");
		JLabel la2 = new JLabel("�ι�° ��");
		JLabel la3 = new JLabel("     ���    ");

		JTextField textf1 = new JTextField(15);
		JTextField textf2 = new JTextField(15);
		JTextField textf3 = new JTextField(15);

		JButton b1 = new JButton("+");
		JButton b2 = new JButton("-");
		JButton b3 = new JButton("*");
		JButton b4 = new JButton("/");

		this.add(la1);
		this.add(textf1);

		this.add(la2);
		this.add(textf2);

		this.add(la3);
		this.add(textf3);

		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);

		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int n1 = Integer.parseInt(textf1.getText());
					int n2 = Integer.parseInt(textf2.getText());
					textf3.setText(String.valueOf(n1 + n2)); // textf3.setText((n1+n2)+""); //�̷����ص� ��
				} catch (Exception ee) {
					textf3.setText("���ڸ� �Է����ּ���");
				}

			}
		});

		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int n1 = Integer.parseInt(textf1.getText());
					int n2 = Integer.parseInt(textf2.getText());
					textf3.setText(String.valueOf(n1 - n2)); 
				} catch (Exception ee) {
					textf3.setText("���ڸ� �Է����ּ���");
				}

			}
		});

		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int n1 = Integer.parseInt(textf1.getText());
					int n2 = Integer.parseInt(textf2.getText());
					textf3.setText(String.valueOf(n1 * n2)); 
				} catch (Exception ee) {
					textf3.setText("���ڸ� �Է����ּ���");
				}

			}
		});

		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int n1 = Integer.parseInt(textf1.getText());
					int n2 = Integer.parseInt(textf2.getText());
					textf3.setText(String.valueOf(n1 / n2)); 
				} catch (Exception ee) {
					textf3.setText("���ڸ� �Է����ּ���");
				}

			}
		});

		setSize(250, 256);
		setVisible(true);

	}

	public static void main(String[] args) {
		new cal2();
	}

}