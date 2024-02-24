package model;

public class LoginModel {
	
	String cadastro;
	char[] senha;
	
	public LoginModel(){}
	
	public void setLogin(String cadastro, char[] senha)
	{
		this.cadastro = cadastro;
		this.senha = senha;
	}
	
	public void getLogin() {
		System.out.println("Cadastro: " + this.cadastro + "\nSenha: " + new String(this.senha));
	}

}
