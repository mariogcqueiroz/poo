package controller;

import view.screen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Modeltest;

public class controller implements ActionListener {

	private Modeltest model;
	private screen view;
	/**
	 * @param model
	 * @param view
	 */
	public controller(Modeltest model, screen view) {
		super();
		setModel(model);
		setView(view);
	}
	
	public Modeltest getModel() {
		return model;
	}
	public void setModel(Modeltest model) {
		this.model = model;
	}
	public screen getView() {
		return view;
	}
	public void setView(screen view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
