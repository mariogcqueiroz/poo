package view;

import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

import controller.VotacaoController;


public class VotacaoView extends JFrame {
	private Container container;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	public VotacaoView() {

		setBounds(300, 100, 300, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		container = getContentPane();
		container.setLayout(null);
		
		button1 = new JButton("Mario");
		button1.setFont(new Font("Arial", Font.PLAIN, 15));
		button1.setSize(200, 30);
		button1.setLocation(50, 250);
		container.add(button1);
		
		button2 = new JButton("Andre");
		button2.setFont(new Font("Arial", Font.PLAIN, 15));
		button2.setSize(200, 30);
		button2.setLocation(50, 200);
		container.add(button2);
		
		button3 = new JButton("Zevice");
		button3.setFont(new Font("Arial", Font.PLAIN, 15));
		button3.setSize(200, 30);
		button3.setLocation(50, 150);
		container.add(button3);
		
		button4 = new JButton("Luis");
		button4.setFont(new Font("Arial", Font.PLAIN, 15));
		button4.setSize(200, 30);
		button4.setLocation(50, 100);
		container.add(button4);
	}
	public void setListeners(VotacaoController listener) {
		this.button1.addActionListener(listener);
		this.button2.addActionListener(listener);
		this.button3.addActionListener(listener);
		this.button4.addActionListener(listener);
	}
	
}
