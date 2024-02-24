package model;

public class VotacaoModel {
	private static int vt1=0;
	private static int vt2=0;
	private static int vt3=0;
	private static int vt4=0;
	public VotacaoModel() {
		
	}
	
	public static int getVt1() {
		return vt1;
	}

	public static void setVt1(int vt1) {
		VotacaoModel.vt1 = vt1;
	}

	public static int getVt2() {
		return vt2;
	}

	public static void setVt2(int vt2) {
		VotacaoModel.vt2 = vt2;
	}

	public static int getVt3() {
		return vt3;
	}

	public static void setVt3(int vt3) {
		VotacaoModel.vt3 = vt3;
	}

	public static int getVt4() {
		return vt4;
	}

	public static void setVt4(int vt4) {
		VotacaoModel.vt4 = vt4;
	}

	public void voto1() {
		vt1++;
	}
	public void voto2() {
		vt2++;
	}
	public void voto3() {
		vt3++;
	}
	public void voto4() {
		vt4++;
	}
}
