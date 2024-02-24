package exemplo.agregacao;

class Estudante
{
    String nome;
    int id ;
    String dept;
     
  
    Estudante(String nome, int id, String dept)
    {
        this.nome = nome;
        this.id = id;
        this.dept = dept;
    }


	@Override
	public String toString() {
		return "Estudante [nome=" + nome + ", id=" + id + ", dept=" + dept + "]";
	}
}