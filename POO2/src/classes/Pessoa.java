package classes;

import exception.IdadeException;

public abstract class Pessoa {
	private int idade;
	private String nome;
	private static int quantidade = 0;
	
	public Pessoa(int idade, String nome) {
		try {
			setIdade(idade);
		} catch (IdadeException e) {
			System.out.println(e);
		}
		setNome(nome);
		setQuantidade(getQuantidade() + 1);
	}
	
	public void setIdade(int idade) throws IdadeException {
		if(idade < 18) {
			throw new IdadeException("Deve ser maior de idade!");
		} else {
			this.idade = idade;
		}
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public static void setQuantidade(int quantidade) {
		Pessoa.quantidade = quantidade;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public static int getQuantidade() {
		return quantidade;
	}

	@Override
	public String toString() {
		return "Pessoa [idade=" + idade + ", nome=" + nome + "]";
	}
	
	
}
