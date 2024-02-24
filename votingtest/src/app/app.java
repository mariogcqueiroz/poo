package app;
import view.VotarView;
import Model.VotarModel;
import Controller.VotarController;
public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VotarView v = new VotarView();
		VotarModel m = new VotarModel();
		VotarController c = new VotarController(v,m);
	}

}
