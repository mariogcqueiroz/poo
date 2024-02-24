package fabrics;

import classes.Funcionario;
import exception.FuncionarioException;

public class PessoaFabric {
	
	public static Funcionario criarFuncionario(int idade, String nome, float salario){
		Funcionario funcionario = null;
		try {
			funcionario = new Funcionario(idade, nome, salario);
		} catch (FuncionarioException e) {
			System.out.println(e);
		}
		return funcionario;
	}

}
