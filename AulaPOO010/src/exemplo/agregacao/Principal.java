package exemplo.agregacao;

import exemplo.frame.MainFrame;

class Principal
{
	static Departamento CSE;
    static Departamento EE;
    static Departamento CMP;
	static Instituto Instituto;
    
    public static void main (String[] args)
    {
    	
        @SuppressWarnings("unused")
		MainFrame frame = new MainFrame(CSE, EE, CMP, Instituto);
        
    }
}