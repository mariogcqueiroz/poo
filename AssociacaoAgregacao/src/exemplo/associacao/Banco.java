package exemplo.associacao;
class Banco
{
    private String nome;
     
    // bank name
    Banco(String nome)
    {
        this.nome = nome;
    }
     
    public String getBancoNome()
    {
        return this.nome;
    }
}