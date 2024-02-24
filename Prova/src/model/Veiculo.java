package model;

public abstract class Veiculo {
	private static int contadorCodigo = 0;
	private int codigoChassis;
	
	public Veiculo() {
		this.setCodigoChassis(Veiculo.contadorCodigo++);
	}

	public static int getContadorCodigo() {
		return contadorCodigo;
	}

	public static void setContadorCodigo(int contadorCodigo) {
		Veiculo.contadorCodigo = contadorCodigo;
	}

	public int getCodigoChassis() {
		return codigoChassis;
	}

	public void setCodigoChassis(int codigoChassis) {
		this.codigoChassis = codigoChassis;
	}


	@Override
	public String toString() {
		return "Veiculo [getCodigoChassis()=" + getCodigoChassis() + "]";
	}
	
}
