package classes;

import exceptions.AcendeException;
import interfaces.Lampada;

public class LampadaIncandescente implements Lampada {
	private String estado = "apagado";
	
	public LampadaIncandescente () { }
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void acende() throws AcendeException{
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
		return "LampadaIncandescente [estado=" + estado + "]";
	}
}
