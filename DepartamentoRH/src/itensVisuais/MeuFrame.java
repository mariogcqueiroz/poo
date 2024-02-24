package itensVisuais;

/*Programa Java para implementar um formulário simples de cadastro.*/

import javax.swing.*;

import colaboradores.Pessoa;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;

public class MeuFrame extends JFrame implements ActionListener {

	// Elementos do formulario
	private Container container;
	private JLabel titulo;
	private JLabel nome;
	private JTextField tnome;
	private JLabel numeroCelular;
	private JTextField tNumeroCelular;
	private JLabel sexo;
	private JRadioButton homem;
	private JRadioButton mulher;
	private ButtonGroup bGGeneroSexo;
	private JLabel dataNascimento;
	private JComboBox<String> dia;
	private JComboBox<String> mes;
	private JComboBox<String> ano;
	private JLabel endereco;
	private JTextArea tEndereco;
	private JCheckBox termoConcentimento;
	private JButton bSubmeter;
	private JButton bresetar;
	private JTextArea tAOutrasInformacoes;
	private JLabel mensagem;
	private JTextArea jTMensagemErro;
	
	//Por enquanto a pessoa virá aqui como atributo
	private Pessoa pessoa;

	private String dias[]
			= { "1", "2", "3", "4", "5",
					"6", "7", "8", "9", "10",
					"11", "12", "13", "14", "15",
					"16", "17", "18", "19", "20",
					"21", "22", "23", "24", "25",
					"26", "27", "28", "29", "30",
	"31" };
	private String meses[]
			= { "Jan", "Fev", "Mar", "Abr",
					"Mai", "Jun", "Jul", "Ago",
					"Set", "Out", "Nov", "Dez" };
	private String anos[]
			= { "1995", "1996", "1997", "1998",
					"1999", "2000", "2001", "2002",
					"2003", "2004", "2005", "2006",
					"2007", "2008", "2009", "2010",
					"2011", "2012", "2013", "2014",
					"2015", "2016", "2017", "2018",
					"2019", "2020", "2021", "2022",
	"2023" };

	/*Construtor para inicializar os componentes das tela com valores padrões.*/
	
	public MeuFrame()
	{
				
		setTitle("Formulario de Registro MEU TESTE");
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
		tnome.setSize(190, 20);
		tnome.setLocation(200, 100);
		container.add(tnome);

		numeroCelular = new JLabel("Celular");
		numeroCelular.setFont(new Font("Arial", Font.PLAIN, 20));
		numeroCelular.setSize(100, 20);
		numeroCelular.setLocation(100, 150);
		container.add(numeroCelular);

		tNumeroCelular = new JTextField();
		tNumeroCelular.setFont(new Font("Arial", Font.PLAIN, 15));
		tNumeroCelular.setSize(150, 20);
		tNumeroCelular.setLocation(200, 150);
		container.add(tNumeroCelular);

		sexo = new JLabel("Sexo");
		sexo.setFont(new Font("Arial", Font.PLAIN, 20));
		sexo.setSize(100, 20);
		sexo.setLocation(100, 200);
		container.add(sexo);

		homem = new JRadioButton("Homem");
		homem.setFont(new Font("Arial", Font.PLAIN, 15));
		homem.setSelected(true);
		homem.setSize(75, 20);
		homem.setLocation(200, 200);
		container.add(homem);

		mulher = new JRadioButton("Mulher");
		mulher.setFont(new Font("Arial", Font.PLAIN, 15));
		mulher.setSelected(false);
		mulher.setSize(80, 20);
		mulher.setLocation(275, 200);
		container.add(mulher);

		bGGeneroSexo = new ButtonGroup();
		bGGeneroSexo.add(homem);
		bGGeneroSexo.add(mulher);

		dataNascimento = new JLabel("Data Nascimento");
		dataNascimento.setFont(new Font("Arial", Font.PLAIN, 20));
		dataNascimento.setSize(100, 20);
		dataNascimento.setLocation(100, 250);
		container.add(dataNascimento);

		dia = new JComboBox(dias);
		dia.setFont(new Font("Arial", Font.PLAIN, 15));
		dia.setSize(50, 20);
		dia.setLocation(200, 250);
		container.add(dia);

		mes = new JComboBox(meses);
		mes.setFont(new Font("Arial", Font.PLAIN, 15));
		mes.setSize(60, 20);
		mes.setLocation(250, 250);
		container.add(mes);

		ano = new JComboBox(anos);
		ano.setFont(new Font("Arial", Font.PLAIN, 15));
		ano.setSize(60, 20);
		ano.setLocation(320, 250);
		container.add(ano);

		endereco = new JLabel("Endereco");
		endereco.setFont(new Font("Arial", Font.PLAIN, 20));
		endereco.setSize(100, 20);
		endereco.setLocation(100, 300);
		container.add(endereco);

		tEndereco = new JTextArea("Será que vai funcionar???");
		tEndereco.setFont(new Font("Arial", Font.PLAIN, 15));
		tEndereco.setSize(200, 75);
		tEndereco.setLocation(200, 300);
		tEndereco.setLineWrap(true);
		container.add(tEndereco);

		termoConcentimento = new JCheckBox("Aceitar termos e condições");
		termoConcentimento.setFont(new Font("Arial", Font.PLAIN, 15));
		termoConcentimento.setSize(250, 20);
		termoConcentimento.setLocation(150, 400);
		container.add(termoConcentimento);

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

		tAOutrasInformacoes = new JTextArea();
		tAOutrasInformacoes.setFont(new Font("Arial", Font.PLAIN, 15));
		tAOutrasInformacoes.setSize(300, 400);
		tAOutrasInformacoes.setLocation(500, 100);
		tAOutrasInformacoes.setLineWrap(true);
		tAOutrasInformacoes.setEditable(false);
		container.add(tAOutrasInformacoes);

		mensagem = new JLabel("");
		mensagem.setFont(new Font("Arial", Font.PLAIN, 20));
		mensagem.setSize(500, 25);
		mensagem.setLocation(100, 500);
		container.add(mensagem);

		jTMensagemErro = new JTextArea();
		jTMensagemErro.setFont(new Font("Arial", Font.PLAIN, 15));
		jTMensagemErro.setSize(200, 75);
		jTMensagemErro.setLocation(580, 175);
		jTMensagemErro.setLineWrap(true);
		container.add(jTMensagemErro);

		setVisible(true);
	}

	//Metodo para capturar uma ação de usuário e fazer o necessário
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == bSubmeter) {
			if (termoConcentimento.isSelected()) {
				String dados1;
				String dados
				= "Nome : "
						+ tnome.getText() + "\n"
						+ "Celular : "
						+ tNumeroCelular.getText() + "\n";
				if (homem.isSelected())
					dados1 = "Sexo : Homem"
							+ "\n";
				else
					dados1 = "Sexo : Mulher"
							+ "\n";
				String dados2
				= "Data Nascimento : "
						+ (String)dia.getSelectedItem()
						+ "/" + (String)mes.getSelectedItem()
						+ "/" + (String)ano.getSelectedItem()
						+ "\n";

				//Aqui podemos usar os dados obtidos para montar uma pessoa.
				//Achar se é homem ou mulher
				String sexo = null;
				if(homem.isSelected())
					sexo = "H";
				else
					sexo = "M";
				//Montar o objeto Date
				int d = Integer.parseInt(dia.getSelectedItem().toString());
				//Teste dos meses
				int m = -9;
				if(mes.getSelectedItem().toString().equals("Jan"))
					m = 0;
				if(mes.getSelectedItem().toString().equals("Fev"))
					m = 1;
				if(mes.getSelectedItem().toString().equals("Mar"))
					m = 2;
				if(mes.getSelectedItem().toString().equals("Abr"))
					m = 3;
				if(mes.getSelectedItem().toString().equals("Mai"))
					m = 4;
				if(mes.getSelectedItem().toString().equals("Jun"))
					m = 5;
				if(mes.getSelectedItem().toString().equals("Jul"))
					m = 6;
				if(mes.getSelectedItem().toString().equals("Ago"))
					m = 7;
				if(mes.getSelectedItem().toString().equals("Set"))
					m = 8;
				if(mes.getSelectedItem().toString().equals("Out"))
					m = 9;
				if(mes.getSelectedItem().toString().equals("Nov"))
					m = 10;
				if(mes.getSelectedItem().toString().equals("Dez"))
					m = 11;
				
				
				
				int a = Integer.parseInt(ano.getSelectedItem().toString());
				
						
				Date dataNascimentoPessoa = new Date(d, m, a);
				this.pessoa = new Pessoa(tnome.getText(), sexo, dataNascimentoPessoa);
				
				String dados3 = "Endereco : " + tEndereco.getText();
				tAOutrasInformacoes.setText(dados + dados1 + dados2 + dados3 + "\n\n"+ pessoa);
				tAOutrasInformacoes.setEditable(false);
				mensagem.setText("Registrado com Sucesso...");
			}
			else {
				tAOutrasInformacoes.setText("");
				jTMensagemErro.setText("");
				mensagem.setText("Por favor aceite os"
						+ " termos e condições");
				mensagem.setForeground(Color.RED);
			}
		}

		else if (e.getSource() == bresetar) {
			String def = "";
			tnome.setText(def);
			tEndereco.setText(def);
			tNumeroCelular.setText(def);
			mensagem.setText(def);
			tAOutrasInformacoes.setText(def);
			termoConcentimento.setSelected(false);
			dia.setSelectedIndex(0);
			mes.setSelectedIndex(0);
			ano.setSelectedIndex(0);
			jTMensagemErro.setText(def);
		}
	}
}