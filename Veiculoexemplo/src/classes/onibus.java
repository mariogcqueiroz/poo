package classes;

public class onibus extends veiculo {
	private int assentos;

	/**
	 * 
	 */
	public onibus() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param placa
	 * @param ano
	 */
	public onibus(String placa, String ano, int assentos) {
		super(placa, ano);
		this.assentos=assentos;
		// TODO Auto-generated constructor stub
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}

	@Override
	public String toString() {
		return "onibus [assentos=" + assentos + ", toString()=" + super.toString() + "]";
	}
	
	
}
