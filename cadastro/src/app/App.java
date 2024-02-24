package app;

import controller.CadastroController;
import model.CadastroModel;
import view.CadastroView;

public class App {

	public static void main(String[] args) {
		CadastroModel m = new CadastroModel();
		CadastroView c = new CadastroView();
		c.setVisible(true);
		CadastroController con = new CadastroController(c, m);

	}

}
