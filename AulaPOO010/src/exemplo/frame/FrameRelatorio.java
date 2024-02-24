package exemplo.frame;

/*Programa Java para implementar um formulário simples de cadastro.*/

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

import exemplo.agregacao.*;

public class FrameRelatorio extends JFrame implements ActionListener {

	// Elementos do formulario
	private Container container;
	private JLabel titulo;
	private JButton fechar;
	private JTextArea relatorio;
	private Instituto Instituto;
	
	public FrameRelatorio(Instituto Instituto)
	{
		this.Instituto = Instituto;
				
		setTitle("Relatorio de Registro");
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		container = getContentPane();
		container.setLayout(null);

		titulo = new JLabel("Formulario de Registro");
		titulo.setFont(new Font("Arial", Font.PLAIN, 25));
		titulo.setSize(300, 30);
		titulo.setLocation(300, 30);
		container.add(titulo);


		relatorio = new JTextArea();
		relatorio.setFont(new Font("Arial", Font.PLAIN, 15));
		relatorio.setSize(700, 400);
		relatorio.setLocation(100, 100);
		relatorio.setLineWrap(true);
		relatorio.setEditable(false);
		container.add(relatorio);
		
		fechar = new JButton("Fechar");
		fechar.setFont(new Font("Arial", Font.PLAIN, 15));
		fechar.setSize(100, 20);
		fechar.setLocation(150, 500);
		fechar.addActionListener(this);
		container.add(fechar);

		setVisible(true);
		
		String relatorioText = "";
		for (Departamento depart : this.Instituto.getDepartments()) {
			relatorioText += depart.getNome() + ":\n";
			for (Estudante estud : depart.getStudents()) {
				relatorioText += estud.getNome() + ", " + estud.getId() + "\n";
			}
			relatorioText += "\n";
		}
		
		relatorio.setText(relatorioText);
		
		setVisible(true);
	}

	//Metodo para capturar uma ação de usuário e fazer o necessário
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == fechar) {
			
			this.dispose();
			
			}
		}
	}