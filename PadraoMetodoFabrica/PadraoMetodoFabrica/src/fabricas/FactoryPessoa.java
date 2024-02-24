package fabricas;

public class FactoryPessoa{
	
	public Pessoa getPessoa (String nome, String sexo) {
		Pessoa retorno = null;
		if (sexo.equals("M"))
			retorno = new Homem(nome);
		if (sexo.equals("F"))
			retorno= new Mulher(nome);
		return retorno;
	}

}
