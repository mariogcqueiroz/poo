package application;

import view.LoginView;
import controler.LoginController;
import model.LoginModel;

public class mainApp {

	public static void main(String[] args) {
		LoginModel model = new LoginModel();
		LoginView view = new LoginView();
		@SuppressWarnings("unused")
		LoginController controller = new LoginController(model, view);
	}

}
