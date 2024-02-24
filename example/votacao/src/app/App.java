package app;

import controller.VotacaoController;
import model.VotacaoModel;
import view.ResultadoView;
import view.VotacaoView;

public class App {

	public static void main(String[] args) {
		VotacaoView f = new VotacaoView();
		f.setVisible(true);
		ResultadoView R = new ResultadoView();
		R.setVisible(true);
		VotacaoModel mod = new VotacaoModel();
		VotacaoController cont = new VotacaoController(mod, R, f);
	}

}
