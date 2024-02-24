package entidades;

public class Venda {
	private int Codigo;
	private String Data_Hora;
	private float Valor_Total;
	private String Tipo_Pgto;
	private int FK_CAIXA_Codigo;
	
	/**
	 * Construtor Default de Venda
	 */
	public Venda() {
		
	}
	/**
	 * @param Codigo
	 * @param Data_Hora
	 * @param Valor_Total
	 * @param Tipo_Pgto
	 * Construtor de Venda
	 */
	public Venda(int Codigo, String Data_Hora, float Valor_Total, String Tipo_Pgto, int FK_cliente) {
		super();
		setCodigo(Codigo);
		setData_Hora(Data_Hora);
		setValor_Total(Valor_Total);
		setTipo_Pgto(Tipo_Pgto);
		setFK_CAIXA_Codigo(FK_cliente);
	}
	public int getFK_CAIXA_Codigo() {
		return FK_CAIXA_Codigo;
	}
	public void setFK_CAIXA_Codigo(int fK_CAIXA_Codigo) {
		FK_CAIXA_Codigo = fK_CAIXA_Codigo;
	}
	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
	public String getData_Hora() {
		return Data_Hora;
	}
	public void setData_Hora(String data_Hora) {
		Data_Hora = data_Hora;
	}
	public float getValor_Total() {
		return Valor_Total;
	}
	public void setValor_Total(float valor_Total) {
		Valor_Total = valor_Total;
	}
	public String getTipo_Pgto() {
		return Tipo_Pgto;
	}
	public void setTipo_Pgto(String tipo_Pgto) {
		Tipo_Pgto = tipo_Pgto;
	}
	
	
	
}

