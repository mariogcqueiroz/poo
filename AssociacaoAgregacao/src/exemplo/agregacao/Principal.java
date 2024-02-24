package exemplo.agregacao;

import java.util.ArrayList;
import java.util.List;

class Princiapl
{
    public static void main (String[] args)
    {
  
    	Estudante s1 = new Estudante("Mia", 1, "CSE");
        Estudante s2 = new Estudante("Priya", 2, "CSE");
        Estudante s3 = new Estudante("John", 1, "EE");
        Estudante s4 = new Estudante("Rahul", 2, "EE");
        Estudante s5 = new Estudante ("Alexandre", 1, "CMP");
        Estudante s6 = new Estudante ("Maria", 2, "CMP");
        
     
        // Fazendo a lista de
        // Estudantes CSE.
        List <Estudante> cse_Estudantes = new ArrayList<Estudante>();
        cse_Estudantes.add(s1);
        cse_Estudantes.add(s2);
        
        //Estudante de CMP - Computação0
        List <Estudante> cmp_Estudantes = new ArrayList<Estudante>();
        cmp_Estudantes.add(s5);
        cmp_Estudantes.add(s6);
        // Fazendo a lista de 
        // Estudantes EE 
        List <Estudante> ee_Estudantes = new ArrayList<Estudante>();
        ee_Estudantes.add(s3);
        ee_Estudantes.add(s4);
         
        Departamento CSE = new Departamento("CSE", cse_Estudantes);
        Departamento EE = new Departamento("EE", ee_Estudantes);
        Departamento CMP = new Departamento("CMP", cmp_Estudantes);
         
        List <Departamento> Departamentos = new ArrayList<Departamento>();
        Departamentos.add(CSE);
        Departamentos.add(EE);
        Departamentos.add(CMP);
        
         
        // Criando uma instancia de Instituto.
        Instituto Instituto = new Instituto("IFG", Departamentos);
         
        System.out.print("Total Estudantes no Instituto: ");
        System.out.print(Instituto.getTotalEstudantesNoInstituto());
        
        System.out.println("\n" + Instituto.getNomeInstituto());
        System.out.println("\n" + Instituto);
        
    }
}