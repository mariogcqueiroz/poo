package app;
import controller.formController;
import view.viewform;
import model.modelform;
public class application {

	public static void main(String[] args) {
		viewform v = new viewform();
		modelform m = new modelform();
		formController c = new formController(v,m);

	}

}
