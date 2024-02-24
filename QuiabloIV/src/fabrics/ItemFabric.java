package fabrics;

import classes.Item;
import classes.ItemComum;
import classes.ItemRaro;

public class ItemFabric {
	public static ItemComum criarItemComum(int num_id, String descricao, String detalhe1, String detalhe2) {
		return new ItemComum(Item.getQuantidade(), descricao, detalhe1, detalhe2);
	}
	
	public static ItemRaro criarItemRaro(int num_id, String descricao, String detalhe1, String detalhe2, String detalhe3) {
		return new ItemRaro(Item.getQuantidade(), descricao, detalhe1, detalhe2, detalhe3);
	}
}
