package app;

import controller.SomaController;
import model.SomaModel;
import view.SomaView;

public class App {

	public static void main(String[] args) {
		SomaModel v = new SomaModel();
		SomaView m =new SomaView();
		SomaController c = new SomaController(m, v);

	}

}
