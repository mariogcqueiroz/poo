package entidades;

public class Cliente {
	private String CPF_CNPJ;
	private String Nome;
	private String Endereco;
	private String Telefone;
	
	/**
	 * @param cPF_CNPJ
	 * @param nome
	 * @param endereco
	 * @param telefone
	 * Construtor de cliente.
	 */
	public Cliente(String cPF_CNPJ, String nome, String endereco, String telefone) {
		super();
		this.setCPF_CNPJ(cPF_CNPJ); 
		this.setNome(nome); 
		this.setEndereco(endereco);
		this.setTelefone(telefone); 
	}

	/**
	 * Construtor padrão.
	 */
	public Cliente() {
	}
	
	public String getCPF_CNPJ() {
		return CPF_CNPJ;
	}
	public void setCPF_CNPJ(String cPF_CNPJ) {
		CPF_CNPJ = cPF_CNPJ;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	@Override
	public String toString() {
		return "Cliente [getCPF_CNPJ()=" + getCPF_CNPJ() + ", getNome()=" + getNome() + ", getEndereco()="
				+ getEndereco() + ", getTelefone()=" + getTelefone() + "]";
	}
	
	
}
