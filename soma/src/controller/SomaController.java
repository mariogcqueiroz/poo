package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.SomaModel;
import view.SomaView;

public class SomaController implements ActionListener{
	private SomaView view;
	private SomaModel model;
	public SomaController(SomaView view, SomaModel model) {
		setView(view);
		setModel(model);
		view.setListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()== "=") {
			model.soma(Integer.parseInt(view.getNum1().getText()), Integer.parseInt(view.getNum2().getText()));
			view.update1(model.toString());
		}
		
	}

	public SomaView getView() {
		return view;
	}

	public void setView(SomaView view) {
		this.view = view;
	}

	public SomaModel getModel() {
		return model;
	}

	public void setModel(SomaModel model) {
		this.model = model;
	}

}
