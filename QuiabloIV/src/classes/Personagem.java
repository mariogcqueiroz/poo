package classes;

import java.util.Arrays;
import interfaces.Bolso;

public class Personagem implements Bolso {
	private Item[] bolso = new Item[3];
	public static int qtd = 0;	
	
	public Personagem() { }
	
	public void colocarItemNoBolso(Item item, int slot) {
		if(qtd < 3) {
			bolso[slot] = item;
			qtd++;
		} else
		{
			System.out.println("Bolso cheio!");
			return;
		}
	}
	
	public void removerItemDoBolso(Item item, int slot) {
		bolso[slot] = null;
		qtd--;
	}
	
	public void mostrarBolso() {
		System.out.println(bolso[0]);
		System.out.println(bolso[1]);
		System.out.println(bolso[2]);
	}

	public Item[] getBolso() {
		return bolso;
	}

	public void setBolso(Item[] bolso) {
		this.bolso = bolso;
	}

	@Override
	public String toString() {
		return "Personagem [bolso=" + Arrays.toString(bolso) + "]";
	}
	
}
