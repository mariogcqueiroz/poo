package classes;

import exceptions.AcendeException;
import interfaces.Lampada;

public class LampadaDeNatal implements Lampada {
	private String estado = "apagado";
	private int cor;
	
	public LampadaDeNatal() { }
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getCor() {
		return cor;
	}

	public void setCor(int cor) {
		this.cor = cor;
	}

	public void acende() throws AcendeException {
		if(estado.equals("aceso")) {
			throw new AcendeException("Ja esta aceso!");
		} else {
			estado = "aceso";
		}
	}
	
	public void apaga() {
		estado = "apagado";
	}
	
	public void mostraEstado() {
		System.out.println(estado);
	}

	@Override
	public String toString() {
		return "LampadaDeNatal [estado=" + estado + ", cor=" + cor + "]";
	}	
}
