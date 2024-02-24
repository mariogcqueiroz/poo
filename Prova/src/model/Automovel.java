package model;

import java.io.Serializable;

public class Automovel extends Veiculo implements Serializable {
	private static final long serialVersionUID = 7487099239317801028L;
	
	private String marcaModelo;
	private String placa;
	private double valorIPVA;
	
	public Automovel() {
		super();
	}

	
	public String getMarcaModelo() {
		return marcaModelo;
	}
	
	public void setMarcaModelo(String marcaModelo) {
		this.marcaModelo = marcaModelo;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public double getValorIPVA() {
		return valorIPVA;
	}
	
	public void setValorIPVA(double valorIPVA) throws NegativeNumberException {
		if(valorIPVA < 0) {
			throw new NegativeNumberException();
		}
		this.valorIPVA = valorIPVA;
	}

	@Override
	public String toString() {
		return "Automovel [Código Chassis=" + this.getCodigoChassis() + ", Marca/Modelo=" + this.getMarcaModelo()
				+ ", Placa=" + this.getPlaca() + ", Valor do IPVA()=" + this.getValorIPVA() + "]";
	}
	
}
