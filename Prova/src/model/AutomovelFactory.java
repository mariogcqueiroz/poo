package model;

public class AutomovelFactory {
	public Automovel getAutomovel(String marcaModelo, String placa, double valorIPVA) throws NegativeNumberException {
		Automovel automovel = new Automovel();
		automovel.setMarcaModelo(marcaModelo);
		automovel.setPlaca(placa);
		automovel.setValorIPVA(valorIPVA);
		
		return automovel;
	}
}
