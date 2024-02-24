package principal;

import fabricas.FactoryPessoa;
import fabricas.Homem;
import fabricas.Mulher;





public class AplicativoHomensMulheres {

	public static void main(String[] args) {
		FactoryPessoa fabricaDePessoas = new FactoryPessoa();
		//Pessoa people = new Pessoa();
		
		//Homem jose = new Homem("Jose");
		
		String nome = "Alexandre";
		String sexo = "M";
		
		String nomeMulher = "Ana";
		String sexoMulher = "F";
		
		Mulher m = (Mulher)fabricaDePessoas.getPessoa(nomeMulher, sexoMulher);
		
		Homem h = (Homem)fabricaDePessoas.getPessoa(nome, sexo);
		
		System.out.println(h.getSexo());
		System.out.println("Mulher criado no principal "+ m.getNome());

	}

}
