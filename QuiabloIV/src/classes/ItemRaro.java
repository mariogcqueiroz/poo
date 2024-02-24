package classes;

public class ItemRaro extends Item {
	private String detalhe1;
	private String detalhe2;
	private String detalhe3;
	
	public ItemRaro(int num_id, String descricao, String detalhe1, String detalhe2, String detalhe3) {
		super(num_id, descricao);
		setDetalhe1(detalhe1);
		setDetalhe2(detalhe2);
		setDetalhe3(detalhe3);
	}
	
	public void setDetalhe1(String detalhe1) {
		this.detalhe1 = detalhe1;
	}
	
	public void setDetalhe2(String detalhe2) {
		this.detalhe2 = detalhe2;
	}
	
	public void setDetalhe3(String detalhe3) {
		this.detalhe3 = detalhe3;
	}
	
	public String getDetalhe1() {
		return this.detalhe1;
	}
	
	public String getDetalhe2() {
		return this.detalhe2;
	}
	
	public String getDetalhe3() {
		return this.detalhe3;
	}

	@Override
	public String toString() {
		return "ItemRaro [detalhe1=" + detalhe1 + ", detalhe2=" + detalhe2 + ", detalhe3=" + detalhe3 + ", getNum_Id()="
				+ getNum_Id() + "]";
	}

	
}
