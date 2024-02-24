package aplicativo;

import java.util.Date;

import colaboradores.Pessoa;

public class AppTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Seu aplicativo aqui...");
		
		Date dataNasc = new Date(1988,10,15);
		Date dataNasc02 = new Date(2000,10,15);
		Pessoa pessoa01 = new Pessoa("Jose", "M", "55555", dataNasc);
		
		Pessoa pessoa02;
		pessoa02 = new Pessoa("Mario", "M", dataNasc02);
		
		System.out.println("Dados da Pessoa: " + pessoa01);
		System.out.println("Dados da 2ª Pessoa: " + pessoa02);
		
		pessoa01.setNome(null);
		System.out.println("Dados da Pessoa: " + pessoa01.getNome());
		System.out.println("Nome da pessoa furando encapsulamento: "
				+ "" + pessoa02.getNome());

	}

}
