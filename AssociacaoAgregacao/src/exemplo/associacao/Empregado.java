package exemplo.associacao;

class Empregado
{
    private String nome;
     
    // employee name
    Empregado(String nome)
    {
        this.nome = nome;
    }
     
    public String getEmpregadoNome()
    {
        return this.nome;
    }
}