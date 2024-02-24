package interfaces;

import classes.Item;

public interface Bolso {
	void colocarItemNoBolso(Item item, int slot);
	public void removerItemDoBolso(Item item, int slot);
	public void mostrarBolso();
}
