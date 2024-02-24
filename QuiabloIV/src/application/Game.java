package application;

import classes.Item;
import classes.ItemComum;
import classes.ItemRaro;
import classes.Personagem;
import fabrics.ItemFabric;
import fabrics.PersonagemFabric;

public class Game {

	public static void main(String[] args) {
		Personagem personagem = null;
		ItemComum itemComum = null;
		ItemRaro itemRaro = null;
		ItemRaro itemRaro2 = null;
		
		personagem = PersonagemFabric.criarPersonagem();
		itemComum = ItemFabric.criarItemComum(Item.getQuantidade(), "Item de poder", "Papa capim", "Dos meus sonhos!");
		itemRaro = ItemFabric.criarItemRaro(Item.getQuantidade(), "Item de defesa", "Ze Matheus", "Torce pro flamengo", "So sofre");
		itemRaro2 = ItemFabric.criarItemRaro(Item.getQuantidade(), "Item de ataque", "Mario Glaucio", "Cobra indevidamente", "Tira 10 nas provas");
		
		personagem.colocarItemNoBolso(itemComum, 0);
		personagem.colocarItemNoBolso(itemRaro, 1);	
		personagem.colocarItemNoBolso(itemRaro, 2);
		personagem.colocarItemNoBolso(itemRaro2, 2);
		personagem.mostrarBolso();
		
		personagem.removerItemDoBolso(itemRaro, 2);
		personagem.mostrarBolso();
		
		personagem.colocarItemNoBolso(itemRaro2, 2);
		personagem.mostrarBolso();

	}

}
