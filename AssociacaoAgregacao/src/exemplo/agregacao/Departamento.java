package exemplo.agregacao;

import java.util.List;

class Departamento
{
     
    String nome;
    private List<Estudante> estudantes;
    Departamento(String name, List<Estudante> estudantes)
    {
         
        this.nome = name;
        this.estudantes = estudantes;
         
    }
     
    public List<Estudante> getStudents()
    {
        return estudantes;
    }

	@Override
	public String toString() {
		return "Departamento [nome=" + nome + ", estudantes=" + estudantes + "]";
	}
}
