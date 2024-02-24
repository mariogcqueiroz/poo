package view;

import javax.swing.*;
import java.awt.*;

import controler.LoginController;

@SuppressWarnings("serial")
public class LoginView extends JFrame {
	
	// Elementos da tela.
	private Container container;
	
	// Textos
	private JLabel cadastroText;
	private JLabel senhaText;
	
	// Caixas de Texto
	
	private JTextField cadastroField;
	private JPasswordField senhaField;
	
	// Botoes
	private JButton confirmarButton;	
	
	public LoginView()
	{
		setTitle("Tela de Log-in");
		setBounds(600, 240, 350, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		container = getContentPane();
		container.setLayout(null);
		
		cadastroText = new JLabel("Cadastro");
		cadastroText.setFont(new Font("Arial", Font.PLAIN, 25));
		cadastroText.setSize(300, 30);
		cadastroText.setLocation(14, 14);
		container.add(cadastroText);
		
		cadastroField = new JTextField();
		cadastroField.setFont(new Font("Arial", Font.PLAIN, 25));
		cadastroField.setSize(300, 30);
		cadastroField.setLocation(14, 44);
		container.add(cadastroField);
		
		senhaText = new JLabel("Senha");
		senhaText.setFont(new  Font("Arial", Font.PLAIN, 25));
		senhaText.setSize(300, 30);
		senhaText.setLocation(14, 90);
		container.add(senhaText);
		
		senhaField = new JPasswordField();
		senhaField.setFont(new Font("Arial", Font.PLAIN, 25));
		senhaField.setSize(300, 30);
		senhaField.setLocation(14, 120);
		container.add(senhaField);
		
		confirmarButton = new JButton("Confirmar");
		confirmarButton.setFont(new Font("Arial", Font.PLAIN, 25));
		confirmarButton.setSize(300, 30);
		confirmarButton.setLocation(18, 170);
		container.add(confirmarButton);
		
		
		setVisible(true);
	}
	
	public void setListeners(LoginController listener) {
		this.confirmarButton.addActionListener(listener);
	}
	
	public String getCadastro() {
		return this.cadastroField.getText();
	}
	
	public char[] getSenha() {
		return this.senhaField.getPassword();
	}
	
}
