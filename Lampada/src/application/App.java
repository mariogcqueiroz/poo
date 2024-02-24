package application;

import classes.LampadaDeNatal;
import classes.LampadaIncandescente;
import exceptions.AcendeException;

public class App {

	public static void main(String[] args) {
		LampadaIncandescente lampInc = new LampadaIncandescente();
		try {
			lampInc.acende();
		} catch (AcendeException e) {
			System.out.println(e);
		}
		
		System.out.println(lampInc.toString());
		
		LampadaDeNatal lampNatal = new LampadaDeNatal();
		try {
			lampNatal.acende();
		} catch (AcendeException e) {
			System.out.println(e);
		}
		
		lampNatal.setCor(200);
		
		System.out.println(lampNatal.toString());
		
		//lampInc.apaga();
		//lampNatal.apaga();
		
		//System.out.println(lampInc.toString());
		//System.out.println(lampNatal.toString());
		
		try {
			lampInc.acende();
		} catch (AcendeException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		try {
			lampNatal.acende();
		} catch (AcendeException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		
		
	}
}
