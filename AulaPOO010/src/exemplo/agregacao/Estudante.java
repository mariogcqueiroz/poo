package exemplo.agregacao;

public class Estudante
{
    private String nome;
    private int id ;
    private String dept;
     
  
    public Estudante(String nome, int id, String dept)
    {
        this.nome = nome;
        this.id = id;
        this.dept = dept;
    }


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	@Override
	public String toString() {
		return "Estudante [nome=" + nome + ", id=" + id + ", dept=" + dept + "]";
	}



}