package view;

import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


import controller.CadastroController;

public class CadastroView extends JFrame{
	private Container container;
	private JLabel nome;
	private JTextField nomet;
	private JLabel cpf;
	private JTextField cpft;
	private JButton confirm;
	private JTextArea result;
	
	public CadastroView() {
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		container = getContentPane();
		container.setLayout(null);
		
		confirm = new JButton("Confirmar");
		confirm.setFont(new Font("Arial", Font.PLAIN, 25));
		confirm.setSize(400, 30);
		confirm.setLocation(100, 200);
		container.add(confirm);
		
		nome = new JLabel("Nome: ");
		nome.setFont(new Font("Arial", Font.PLAIN, 25));
		nome.setSize(300, 30);
		nome.setLocation(100, 100);
		container.add(nome);
		
		nomet = new JTextField();
		nomet.setFont(new Font("Arial", Font.PLAIN, 25));
		nomet.setSize(300, 30);
		nomet.setLocation(180, 100);
		container.add(nomet);
		
		cpf = new JLabel("Cpf: ");
		cpf.setFont(new Font("Arial", Font.PLAIN, 25));
		cpf.setSize(300, 30);
		cpf.setLocation(100, 150);
		container.add(cpf);
		
		cpft = new JTextField();
		cpft.setFont(new Font("Arial", Font.PLAIN, 25));
		cpft.setSize(300, 30);
		cpft.setLocation(180, 150);
		container.add(cpft);
		
		result = new JTextArea();
		result.setFont(new Font("Arial", Font.PLAIN, 15));
		result.setSize(700, 300);
		result.setLocation(50, 250);
		result.setLineWrap(true);
		container.add(result);	
	}
	public void update(String resposta) {
		result.setText(resposta);
	}
	public void setListeners(CadastroController listener) {
		this.confirm.addActionListener(listener);
	}
	public JTextField getnome(){
		return nomet;
	}
	public JTextField getcpf() {
		return cpft;
	}
}
