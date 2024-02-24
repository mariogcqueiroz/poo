package classes;

public abstract class Item {
	private static int quantidade = 0;
	private int num_id;
	private String descricao;
	
	public Item () { }
	
	public Item(int num_id, String descricao) {
		quantidade++;
		setNum_Id(num_id);
		setDescricao(descricao);
	}
	
	public void setNum_Id(int num_id) {
		this.num_id = num_id;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public static int getQuantidade() {
		return quantidade;
	}
	
	public int getNum_Id() {
		return this.num_id;
	}
	
	public String getDescricao() {
		return this.descricao;
	}

	@Override
	public String toString() {
		return "Item [num_id=" + num_id + ", descricao=" + descricao + "]";
	}
}
