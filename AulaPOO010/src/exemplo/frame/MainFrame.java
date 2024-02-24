package exemplo.frame;

/*Programa Java para implementar um formulário simples de cadastro.*/

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

import exemplo.agregacao.Departamento;
import exemplo.agregacao.Estudante;
import exemplo.agregacao.Instituto;


public class MainFrame extends JFrame implements ActionListener {

	// Elementos do formulario
	private Container container;
	private JLabel titulo;
	private JLabel nome;
	private JTextField tnome;
	private JLabel matricula;
	private JTextField tmatricula;
	private JLabel curso;
	private JComboBox<String> cbCurso;
	private JButton bSubmeter;
	private JButton bresetar;
	private JButton brelatorio;
	private JTextPane texto;
	private JTextArea tAOutrasInformacoes;
	
	private List <Estudante> cse_Estudantes = new ArrayList<Estudante>();
    private List <Estudante> cmp_Estudantes = new ArrayList<Estudante>();
    private List <Estudante> ee_Estudantes = new ArrayList<Estudante>();
    
    Departamento CSE;
    Departamento EE;
    Departamento CMP;
    Instituto Instituto;
	
	//Por enquanto a pessoa virá aqui como atributo
	private Estudante tempEstudante;

	private String cursos[]
			= { "CSE", "EE", "CMP" };

	/*Construtor para inicializar os componentes das tela com valores padrões.*/
	
	public MainFrame(Departamento CSE, Departamento EE, Departamento CMP, Instituto Instituto)
	{
		
		this.CSE = CSE;
		this.EE = EE;
		this.CMP = CMP;
		this.Instituto = Instituto;
				
		setTitle("Formulario de RegistroE");
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

		nome = new JLabel("Nome");
		nome.setFont(new Font("Arial", Font.PLAIN, 20));
		nome.setSize(100, 20);
		nome.setLocation(100, 100);
		container.add(nome);

		tnome = new JTextField();
		tnome.setFont(new Font("Arial", Font.PLAIN, 15));
		tnome.setSize(240, 20);
		tnome.setLocation(200, 100);
		container.add(tnome);
		
		matricula = new JLabel("Matricula");
		matricula.setFont(new Font("Arial", Font.PLAIN, 20));
		matricula.setSize(100, 20);
		matricula.setLocation(100, 140);
		container.add(matricula);

		tmatricula = new JTextField();
		tmatricula.setFont(new Font("Arial", Font.PLAIN, 15));
		tmatricula.setSize(240, 20);
		tmatricula.setLocation(200, 140);
		container.add(tmatricula);

		curso = new JLabel("Curso");
		curso.setFont(new Font("Arial", Font.PLAIN, 20));
		curso.setSize(100, 20);
		curso.setLocation(100, 180);
		container.add(curso);

		cbCurso = new JComboBox(cursos);
		cbCurso.setFont(new Font("Arial", Font.PLAIN, 15));
		cbCurso.setSize(80, 20);
		cbCurso.setLocation(200, 180);
		container.add(cbCurso);

		bSubmeter = new JButton("Enviar");
		bSubmeter.setFont(new Font("Arial", Font.PLAIN, 15));
		bSubmeter.setSize(100, 20);
		bSubmeter.setLocation(150, 450);
		bSubmeter.addActionListener(this);
		container.add(bSubmeter);

		bresetar = new JButton("Resetar");
		bresetar.setFont(new Font("Arial", Font.PLAIN, 15));
		bresetar.setSize(100, 20);
		bresetar.setLocation(270, 450);
		bresetar.addActionListener(this);
		container.add(bresetar);
		
		
		brelatorio = new JButton("Finalizar e Gerar Relat�rio");
		brelatorio.setFont(new Font("Arial", Font.PLAIN, 15));
		brelatorio.setSize(220, 20);
		brelatorio.setLocation(150, 490);
		brelatorio.addActionListener(this);
		container.add(brelatorio);
		

		tAOutrasInformacoes = new JTextArea();
		tAOutrasInformacoes.setFont(new Font("Arial", Font.PLAIN, 15));
		tAOutrasInformacoes.setSize(300, 400);
		tAOutrasInformacoes.setLocation(500, 100);
		tAOutrasInformacoes.setLineWrap(true);
		tAOutrasInformacoes.setEditable(false);
		container.add(tAOutrasInformacoes);
		
		texto = new JTextPane();
		texto.setFont(new Font("Arial", Font.PLAIN, 15));
		texto.setSize(200, 20);
		texto.setLocation(200, 240);
		texto.setEditable(false);
		container.add(texto);

		setVisible(true);
	}

	//Metodo para capturar uma ação de usuário e fazer o necessário
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == bSubmeter) {
			try {
				int matriculaInt = Integer.parseInt(tmatricula.getText());
				tempEstudante = new Estudante(tnome.getText(), matriculaInt, cbCurso.getSelectedItem().toString());
				String stringtemp = "Nome:" + tnome.getText() + ", Matricula:" + tmatricula.getText() + ", Curso:" + cbCurso.getSelectedItem().toString();
				String registro = tAOutrasInformacoes.getText() + "\n" + stringtemp;
				tAOutrasInformacoes.setText(registro);
				
				if (cbCurso.getSelectedItem().toString() == "CSE") {
					this.cse_Estudantes.add(tempEstudante);
				}
				else if (cbCurso.getSelectedItem().toString() == "EE") {
					this.ee_Estudantes.add(tempEstudante);
				}
				else if (cbCurso.getSelectedItem().toString() == "CMP") {
					this.cmp_Estudantes.add(tempEstudante);
				}
				texto.setText("Registrado com sucesso.");
				
			}
			catch(NumberFormatException exc) {
				System.out.print(exc);
				System.out.println("Erro na matrícula.");
				texto.setText("Erro ao registrar.");
			}
			
		}

		else if (e.getSource() == bresetar) {
			String def = "";
			tnome.setText(def);
			tmatricula.setText(def);
			cbCurso.setSelectedIndex(0);
			tAOutrasInformacoes.setText(def);
			texto.setText(def);

		}
		
		else if (e.getSource() == brelatorio) {
			CSE = new Departamento("CSE", cse_Estudantes);
	        EE = new Departamento("EE", ee_Estudantes);
	        CMP = new Departamento("CMP", cmp_Estudantes);
	        
	        List <Departamento> Departamentos = new ArrayList<Departamento>();
	        Departamentos.add(CSE);
	        Departamentos.add(EE);
	        Departamentos.add(CMP);
	        
	        Instituto = new Instituto("IFG", Departamentos);
	        
	        this.dispose();
	        @SuppressWarnings("unused")
			FrameRelatorio relatorio = new FrameRelatorio(Instituto);

		}
	}
}