package fabricas;

public class Homem extends Pessoa {
	
	public Homem (String nome) {
		this.nome = nome;
		this.sexo = "M";
		System.out.println("Sou um Homem: " + this.nome);
	}
}
