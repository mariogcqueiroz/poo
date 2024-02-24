package src.aplicativo;

import src.lamp.LampadaIncandescente;
import src.lamp.LampadaNatal;
import src.lamp.Cor;
public class App {

	public static void main(String[] args) {
		LampadaIncandescente lampadaIncandescente = new LampadaIncandescente();
        lampadaIncandescente.ligar();
        lampadaIncandescente.desligar();

        
		
        LampadaNatal lampadaNatal = new LampadaNatal(Cor.AZUL);
		lampadaNatal.ligar();
        lampadaNatal.desligar();
    }
}


