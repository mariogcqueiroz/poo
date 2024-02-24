package exemplo.associacao;
class Principal
{
    public static void main (String[] args)
    {
        Banco bank = new Banco("Bradesco");
        Empregado emp = new Empregado("Joao");
         
        System.out.println(emp.getEmpregadoNome() +
               " e empregado do banco " + bank.getBancoNome());
    }
}