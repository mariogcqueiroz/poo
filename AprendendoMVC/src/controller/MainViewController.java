package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Veiculo;
import view.MainView;

public class MainViewController implements ActionListener {
	
	private Veiculo veiculo;
	private MainView view;
	
	public MainViewController(Veiculo veiculo, MainView view) {
		setVeiculo(veiculo);
		setView(view);
	}
	

	public Veiculo getVeiculo() {
		return veiculo;
	}



	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}



	public MainView getView() {
		return view;
	}



	public void setView(MainView view) {
		this.view = view;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "Salvar") {
			veiculo.setVeiculo(view.getTextModelo().getText(), view.getTextPlaca().getText(), view.getTextNomeDono().getText());
			view.updateList(veiculo.salvar());			
		}
		
	}	

}
