package model;

public class CadastroModel {
	private String nome;
	private String cpf;
	public CadastroModel() {
		
	}
	public void salvar(String nome, String cpf) {
		setNome(nome);
		setCpf(cpf);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Override
	public String toString() {
		return "CadastroModel [nome=" + nome + ", cpf=" + cpf + "]";
	}
	
}
