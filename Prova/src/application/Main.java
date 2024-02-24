package application;

import controller.CadastroAutomoveisController;
import view.CadastroAutomoveis;

public class Main {

	public static void main(String[] args) {
		CadastroAutomoveis view = new CadastroAutomoveis();
		new CadastroAutomoveisController(view);

	}

}
