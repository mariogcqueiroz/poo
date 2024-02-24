package exemplo.agregacao;

import java.util.List;

public class Departamento
{ 
	private String nome;
    private List<Estudante> estudantes;
    
    public Departamento(String name, List<Estudante> estudantes)
    {
         
        this.nome = name;
        this.estudantes = estudantes;
         
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Estudante> getStudents() {
		return estudantes;
	}

	public void setEstudantes(List<Estudante> estudantes) {
		this.estudantes = estudantes;
	}

	@Override
	public String toString() {
		return "Departamento [nome=" + nome + ", estudantes=" + estudantes + "]";
	}


}
