package classes;

public class ItemComum extends Item {
	private String detalhe1;
	private String detalhe2;
	
	public ItemComum(int num_id, String descricao, String detalhe1, String detalhe2) {
		super(num_id, descricao);
		setDetalhe1(detalhe1);
		setDetalhe2(detalhe2);
	}
	
	public void setDetalhe1(String detalhe1) {
		this.detalhe1 = detalhe1;
	}
	
	public void setDetalhe2(String detalhe2) {
		this.detalhe2 = detalhe2;
	}
	
	public String getDetalhe1() {
		return this.detalhe1;
	}
	
	public String getDetalhe2() {
		return this.detalhe2;
	}

	@Override
	public String toString() {
		return "ItemComum [detalhe1=" + detalhe1 + ", detalhe2=" + detalhe2 + ", getNum_Id()=" + getNum_Id() + "]";
	}


	
	
}
