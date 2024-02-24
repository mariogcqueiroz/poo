package view;

import javax.swing.JOptionPane;

public class CadastroAutomoveis {
	
	public CadastroAutomoveis() {
		
	}
	
	public int telaOpcoes() {
		int opcao;
		
		opcao = JOptionPane.showConfirmDialog(null, "Você deseja cadastrar um automóvel?");
		if(opcao == 0) return 0;
		else if(opcao == 2) return -1;
		
		opcao = JOptionPane.showConfirmDialog(null, "Você deseja excluir um automóvel?");
		if(opcao == 0) return 1;
		else if(opcao == 2) return -1;
		
		opcao = JOptionPane.showConfirmDialog(null, "Você deseja listar os automóveis?");
		if(opcao == 0) return 2;
		else if(opcao == 2) return -1;
			
		opcao = JOptionPane.showConfirmDialog(null, "Você deseja salvar os automóveis?");
		if(opcao == 0) return 3;
		else if(opcao == 2) return -1;
			
		opcao = JOptionPane.showConfirmDialog(null, "Você deseja carregar os automóveis salvos?");
		if(opcao == 0) return 4;
		else if(opcao == 2) return -1;
			
		return telaOpcoes();
	}
	
	public String telaMarca() {
		return JOptionPane.showInputDialog("Digite a marca do automóvel.");
	}
	
	public String telaPlaca() {
		return JOptionPane.showInputDialog("Digite a placa do automóvel.");
	}
	
	public int telaCodigoChassis() {
		return Integer.parseInt(JOptionPane.showInputDialog("Digite o código do chassis do automóvel."));
	}
	
	public double telaValorIPVA() {
		return Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do IPVA do automóvel."));
	}
	
	public void telaMensagem(String m) {
		JOptionPane.showMessageDialog(null, m);
	}
	
}
