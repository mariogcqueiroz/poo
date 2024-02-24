package view;


import java.awt.Container;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

import controller.MainViewController;

public class MainView extends JFrame {
	
	private Container container;
	private JLabel lblTitulo;
	private JLabel lblModelo;
	private JLabel lblPlaca;
	private JLabel lblNomeDono;
	private JList<String> listView;
	private JTextField txtModelo;
	private JTextField txtPlaca;
	private JTextField txtNomeDono;
	private JButton btnSalvar;
	
	public void setListener(MainViewController controller) {
		this.btnSalvar.addActionListener(controller);
	}
	
	
	
 	public MainView() {
		super("Cadastrar Veículo");
		
		setBounds(500, 200, 900, 500);
		
		container = getContentPane();
		container.setLayout(null);
		
		lblTitulo = new JLabel("Cadastrar Veiculo");
		lblTitulo.setSize(200, 10);
		lblTitulo.setLocation(200, 10);
		container.add(lblTitulo);
		
		lblModelo = new JLabel("Modelo: ");
		lblModelo.setSize(50, 10);
		lblModelo.setLocation(100, 55);
		container.add(lblModelo);
		
		txtModelo = new JTextField();
		txtModelo.setSize(200, 20);
		txtModelo.setLocation(160, 50);
		container.add(txtModelo);
		
		lblPlaca = new JLabel("Placa: ");
		lblPlaca.setSize(50, 10);
		lblPlaca.setLocation(100, 95);
		container.add(lblPlaca);
		
		txtPlaca = new JTextField();
		txtPlaca.setSize(200, 20);
		txtPlaca.setLocation(160, 90);
		container.add(txtPlaca);
		
		lblNomeDono = new JLabel("Nome: ");
		lblNomeDono.setSize(50, 10);
		lblNomeDono.setLocation(100, 135);
		container.add(lblNomeDono);
		
		txtNomeDono = new JTextField();
		txtNomeDono.setSize(200, 20);
		txtNomeDono.setLocation(160, 130);
		container.add(txtNomeDono);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setSize(100, 20);
		btnSalvar.setLocation(200, 170);
		container.add(btnSalvar);
		
		listView = new JList<String>();
		listView.setSize(300, 200);
		listView.setLocation(500, 50);
		container.add(listView);	
		
		
		setVisible(true);
		
	}
	
	public void updateList(ArrayList<String> arr) {
		DefaultListModel<String> dados = new DefaultListModel<>();
		
		for(String item : arr) {
			dados.addElement(item);
		}
		
		listView.setModel(dados);
	}
	
	public JTextField getTextModelo() {
		return txtModelo;
	}
	
	public JTextField getTextPlaca() {
		return txtPlaca;
	}
	
	public JTextField getTextNomeDono() {
		return txtNomeDono;
	}

}
