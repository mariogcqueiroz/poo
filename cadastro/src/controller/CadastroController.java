package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.CadastroModel;
import view.CadastroView;

public class CadastroController implements ActionListener{
	private CadastroView view;
	private CadastroModel model;
	public CadastroController(CadastroView view, CadastroModel model) {
		setView(view);
		setModel(model);
		view.setListeners(this);
	}
	
	public CadastroView getView() {
		return view;
	}

	public void setView(CadastroView view) {
		this.view = view;
	}

	public CadastroModel getModel() {
		return model;
	}

	public void setModel(CadastroModel model) {
		this.model = model;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()== "Confirmar") {
			model.salvar(view.getnome().getText(), view.getcpf().getText());
			view.update(model.toString());
		}
		
	}
	

}
