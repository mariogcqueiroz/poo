package Model;

public class VotarModel {
	private static int r1=0;
	private static int r2=0;
	
	public VotarModel() {
		
	}
	
	public void voto1() {
		r1++;
	}
	public void voto2() {
		r2++;
	}
	public String resultado1() {
		return ""+r1;
	}
	public String resultado2() {
		return ""+r2;
	}
	public static int getR1() {
		return r1;
	}

	public static void setR1(int r1) {
		VotarModel.r1 = r1;
	}

	public static int getR2() {
		return r2;
	}

	public static void setR2(int r2) {
		VotarModel.r2 = r2;
	}
	
}
