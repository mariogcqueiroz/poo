package application;

import controller.MainViewController;
import model.Veiculo;
import view.MainView;

public class App {

	public static void main(String[] args) {
		
		MainView mainView = new MainView();
		Veiculo veiculo = new Veiculo();
		MainViewController controller = new MainViewController(veiculo, mainView);	
		
		
		mainView.setListener(controller);
		

	}

}
