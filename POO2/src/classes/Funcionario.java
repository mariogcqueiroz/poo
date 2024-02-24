package classes;

import exception.FuncionarioException;
import exception.SalarioException;

public class Funcionario extends Pessoa {
	private float salario;
	
	public Funcionario(int idade, String nome, float salario) throws FuncionarioException {
		super(idade, nome);
		try {			
			setSalario(salario);
		} catch (SalarioException e) {
			System.out.println(e);
			throw new FuncionarioException("Funcionario Invalido!");
		}		
	}
	
	public void setSalario(float salario) throws SalarioException {
		if(salario < 1300) {
			throw new SalarioException("O salario deve ser maior que 1300");
		} else {
			this.salario = salario;			
		}
	}
	
	public float getSalario() {
		return this.salario;
	}

	@Override
	public String toString() {
		return "Funcionario [salario=" + salario + "]";
	}
	
}
