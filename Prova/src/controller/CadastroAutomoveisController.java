package controller;

import java.util.ArrayList;

import model.Automovel;
import model.AutomovelFactory;
import model.NegativeNumberException;
import model.Veiculo;
import view.CadastroAutomoveis;

public class CadastroAutomoveisController {
	private CadastroAutomoveis view;
	private ArrayList<Automovel> automoveis = new ArrayList<Automovel>();
	
	public CadastroAutomoveisController(CadastroAutomoveis view) {
		this.view = view;

		Object codigoDesserializado = Serializer.desserializar("contadorCodigo.obj");
		int codigoDesserializadoValue = codigoDesserializado != null ? (int) codigoDesserializado : 0;
		Veiculo.setContadorCodigo(codigoDesserializadoValue);
	
		this.verificarOpcao();
	}
	
	private void verificarOpcao() {
		Serializer.serializar("contadorCodigo.obj", Veiculo.getContadorCodigo());
		
		switch (view.telaOpcoes()) {
			case 0: {
				this.cadastrarAutomovel();
				break;
			}
			case 1: {
				this.excluirAutomovel();
				break;
			}
			case 2: {
				this.listarAutomoveis();
				break;
			}
			case 3: {
				this.salvarAutomoveis();
				break;
			}
			case 4: {
				this.carregarAutomoveis();
				break;
			}
			default: {
				break;
			}
			
		}
	}
	
	private void cadastrarAutomovel() {
		String marca = view.telaMarca();
		String placa = view.telaPlaca();
		double valor = view.telaValorIPVA();
		
		Automovel automovel = null;
		try {
			automovel = new AutomovelFactory().getAutomovel(marca, placa, valor);
		} catch (NegativeNumberException e) {
			view.telaMensagem(e.getMessage());
			this.verificarOpcao();
		}
		
		automoveis.add(automovel);
		
		this.verificarOpcao();
	}
	
	private void excluirAutomovel() {
		int codigoChassis = view.telaCodigoChassis();
		boolean flagExiste = false;
		
		for(int i = 0; i < automoveis.size(); i++) {
			Automovel automovel = automoveis.get(i);
			if(automovel.getCodigoChassis() == codigoChassis) {
				automoveis.remove(i);
				view.telaMensagem("O automóvel de código chassis " + codigoChassis + " foi removido.");
				flagExiste = true;
				break;
			}
			flagExiste = false;
		}
		
		if(!flagExiste) {
			view.telaMensagem("O automóvel de código chassis " + codigoChassis + " não existe.");
		}
		
		this.verificarOpcao();
	}
	
	private void listarAutomoveis() {
		if(automoveis.size() == 0) {
			view.telaMensagem("Não há automóveis cadastrados.");
		}
		
		for(int i = 0; i < automoveis.size(); i++) {
			view.telaMensagem(automoveis.get(i).toString());
		}
		
		this.verificarOpcao();
	}
	
	private void salvarAutomoveis() {
		if(automoveis == null) {
			view.telaMensagem("Não há automóveis para salvar.");
		} else {
			Serializer.serializar("automoveis.obj", automoveis);
			view.telaMensagem(automoveis.size() + " automóveis salvos.");
		}
		
		this.verificarOpcao();
	}
	
	@SuppressWarnings("unchecked")
	private void carregarAutomoveis() {
		Object o = Serializer.desserializar("automoveis.obj");
		
		if(o == null) {
			view.telaMensagem("Não há automóveis salvos.");
		} else {
			automoveis = (ArrayList<Automovel>) o;
			Veiculo.setContadorCodigo(Veiculo.getContadorCodigo() - automoveis.size());
			for(Automovel automovel : automoveis) {
				automovel.setCodigoChassis(automovel.getCodigoChassis() - automoveis.size());
			}
			view.telaMensagem(automoveis.size() + " automóveis carregados.");
		}
		
		this.verificarOpcao();
	}
	
	
}
