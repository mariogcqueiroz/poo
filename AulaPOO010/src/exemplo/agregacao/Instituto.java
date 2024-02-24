package exemplo.agregacao;

import java.util.List;

public class Instituto
{
     
    
	
	private String nomeInstituto;
    private List<Departamento> departments;
     
    public Instituto(String nomeInstituto, List<Departamento> departamentos)
    {
        this.nomeInstituto = nomeInstituto;
        this.departments = departamentos;
    }
     
    // count total students of all departments
    // in a given institute
    public int getTotalEstudantesNoInstituto()
    {
        int numeroDeEstudantes = 0;
        List<Estudante> estudantes;
        for(Departamento dept : departments)
        {
            estudantes = dept.getStudents();
            for(@SuppressWarnings("unused") Estudante s : estudantes)
            {
                numeroDeEstudantes++;
            }
        }
        return numeroDeEstudantes;
    }

	public String getNomeInstituto() {
		return nomeInstituto;
	}

	public void setNomeInstituto(String nomeInstituto) {
		this.nomeInstituto = nomeInstituto;
	}

	public List<Departamento> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Departamento> departments) {
		this.departments = departments;
	}

	@Override
	public String toString() {
		return "Instituto [nomeInstituto=" + nomeInstituto + ", departments=" + departments + "]";
	}
     
}