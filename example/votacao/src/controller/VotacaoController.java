package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.VotacaoModel;
import view.ResultadoView;
import view.VotacaoView;

public class VotacaoController implements ActionListener {
	private VotacaoModel model;
	private ResultadoView view;
	private VotacaoView viewV;
	public VotacaoController(VotacaoModel model, ResultadoView view, VotacaoView viewV) {
		setModel(model);
		setView(view);
		viewV.setListeners(this);
	}
	
	public VotacaoView getViewV() {
		return viewV;
	}

	public void setViewV(VotacaoView viewV) {
		this.viewV = viewV;
	}

	public VotacaoModel getModel() {
		return model;
	}


	public void setModel(VotacaoModel model) {
		this.model = model;
	}


	public ResultadoView getView() {
		return view;
	}


	public void setView(ResultadoView view) {
		this.view = view;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()== "Mario") {
			model.voto1();
		}else if(e.getActionCommand() == "Andre") {
			model.voto2();
		}else if(e.getActionCommand()=="Zevice") {
			model.voto3();
		}else if(e.getActionCommand() == "Luis") {
			model.voto4();
		}	
		view.update(model.getVt1(), model.getVt2(), model.getVt3(), model.getVt4());
	}	
}
