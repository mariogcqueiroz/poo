package fabricas;

public class Mulher extends Pessoa {
	public Mulher (String nome) {
		this.nome = nome;
		this.sexo = "F";
		System.out.println("Sou uma Mulher: " + this.nome);
	}

}
