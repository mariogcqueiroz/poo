package model;

public class SomaModel {
	private int num1;
	private int num2;
	private int resposta;
	public SomaModel() {
		
	}
	public void soma(int num1, int num2) {
		setNum1(num1);
		setNum2(num2);
		setResposta(resposta);
	}
	
	public int getResposta() {
		return resposta;
	}
	public void setResposta(int resposta) {
		this.resposta = getNum1()+getNum2();
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	@Override
	public String toString() {
		return "" + resposta + "";
	}
	
}
