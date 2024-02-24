package entidades;

public class Usuario {
	private String usuario;
    private String senha;
    private String email;
    private String nome;
    private String cnpj;
    private String endereco;
    private String telefone;

	
	/**
	 * Construtor Default de Usuario
	 */
	public Usuario() {
		
	}
	
	/**
	 * @param usuario
	 * @param senha
	 * @param email
	 * Construtor de Usuário, que cria o objeto com os campos do objeto usuário.
	 */
	public Usuario(String usuario, String senha, String email) {
		super();
		this.setUsuario(usuario);
		this.setSenha(senha);
		this.setEmail(email);
		
	}
	
	
    
    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getUsuario() {
        return usuario;
    }
    
    public String getSenha() {
        return senha;
    }

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Usuario [getUsuario()=" + getUsuario() + ", getSenha()=" + getSenha() + ", getEmail()=" + getEmail()
				+ ", getNvl_acesso()=" + "]";
	}
	
	
}
