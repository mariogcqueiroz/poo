package aplicativo;

import javax.swing.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AppAluno {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		String nome = JOptionPane.showInputDialog("Insira o nome:");
		nome = String.valueOf(nome);
		
		String sexo = JOptionPane.showInputDialog("Insira o sexo da pessoa:");
		sexo = String.valueOf(sexo);
		
		String Rg = JOptionPane.showInputDialog("Insira o RG da pessoa:");
		Rg= String.valueOf(Rg);
		
		String dataNasc = JOptionPane.showInputDialog("Insira a data de nascimento:");
		Date dataformato = formato.parse(dataNasc);
		
		JOptionPane.showMessageDialog(null,"O nome é " + nome + ", o sexo é " + sexo + ", RG: " + Rg + ", data de nascimento: " + dataNasc);
		
		int meuInteiro = Integer.parseInt("MinhaStringDeInteiro");
	
	}

}