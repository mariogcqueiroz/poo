package colaboradores;

import java.util.Date;

public class Pessoa {
	//nome, sexo, RG, e data de nascimento
	private String nome;
	public String sexo;
	public String RG;
	public Date dataNascimento;

	public Pessoa(String nome, String sexo, String RG, Date dataNascimento){
		this.setNome(nome);
		this.sexo = sexo;
		this.RG = RG;
		this.dataNascimento = dataNascimento;
	}
	
	public Pessoa(String nome, String sexo, Date dataNascimento){
		this.nome = nome;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getSexo() {
		return this.sexo;
	}
	public String getRG() {
		return this.RG;
	}
	public Date getDataNascimento() {
		return this.dataNascimento;
	}
	
	public void setNome(String nome) {
		if(nome != null)
			this.nome = nome;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void setRG(String RG) {
		this.RG = RG;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + this.getNome() + ", sexo=" + this.getSexo() + ", RG=" + this.getRG() + ", dataNascimento=" + this.getDataNascimento() + "]";
	}
}
