package classes;

public class caminhao extends veiculo {
	private int eixos;

	/**
	 * @param eixos
	 */
	public caminhao(String placa, String ano,int eixos) {
		super(placa,ano);
		this.eixos = eixos;
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	@Override
	public String toString() {
		return "Eixos caminhão="+getEixos()+super.toString();
		}
	
}
