package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.VotarModel;
import view.VotarView;

public class VotarController implements ActionListener {
	private VotarView view;
	private VotarModel model;
	
	public VotarController(VotarView view, VotarModel model) {
		setView(view);
		setModel(model);
		view.setListeners(this);
	}
	
	public VotarView getView() {
		return view;
	}

	public void setView(VotarView view) {
		this.view = view;
	}

	public VotarModel getModel() {
		return model;
	}

	public void setModel(VotarModel model) {
		this.model = model;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand()=="opção 1") {
			model.voto1();
		}else if(e.getActionCommand()=="opção 2") {
			model.voto2();
		}
		view.atualizar(model.resultado1(), model.resultado2());
	}

}
