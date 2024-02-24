package view;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class screen extends JFrame{
	private JLabel lbtitulo;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JLabel lbvt1;
	private JLabel lbvt2;
	private JLabel lbvt3;
	private JLabel lbvt4;
	private JLabel lbvttotal;
	private Container container;
	
	public screen() {
		super("votação");
		
		setBounds(500, 200, 900, 500);
		
		container = getContentPane();
		container.setLayout(null);
		
		lbtitulo = new JLabel("Votação");
		lbtitulo.setSize(200, 20);
		lbtitulo.setLocation(200, 10);
		container.add(lbtitulo);
		
		button1 = new JButton("M");
		button1.setSize(200, 20);
		button1.setLocation(200, 30);
		container.add(button1);
		
		button2 = new JButton("A");
		button2.setSize(200, 20);
		button2.setLocation(200, 50);
		container.add(button2);
		
		button3 = new JButton("L");
		button3.setSize(200, 20);
		button3.setLocation(200, 70);
		container.add(button3);
		
		button4 = new JButton("Z");
		button4.setSize(200, 20);
		button4.setLocation(200, 90);
		container.add(button4);
		
		lbvt1 = new JLabel();
		lbvt1.setSize(200, 50);
		lbvt1.setLocation(250, 30);
		container.add(lbvt1);
		
		lbvt2 = new JLabel();
		lbvt2.setSize(200, 50);
		lbvt2.setLocation(250, 50);
		container.add(lbvt2);
		
		lbvt3 = new JLabel();
		lbvt3.setSize(200, 50);
		lbvt3.setLocation(250, 70);
		container.add(lbvt3);
		
		lbvt4 = new JLabel();
		lbvt4.setSize(200, 70);
		lbvt4.setLocation(250, 90);
		container.add(lbvt4);
		
		lbvttotal = new JLabel();
		lbvttotal.setSize(200, 50);
		lbvttotal.setLocation(225, 100);
		container.add(lbvttotal);
		
		setVisible(true);
	}
	
}
