package classes;

public class veiculo {
private String placa;
private String ano;
public veiculo() {
	
}
/**
 * @param placa
 * @param ano
 */
public veiculo(String placa, String ano) {
	this.placa = placa;
	this.ano = ano;
}
public String getPlaca() {
	return placa;
}
public void setPlaca(String placa) {
	this.placa = placa;
}
public String getAno() {
	return ano;
}
public void setAno(String ano) {
	this.ano = ano;
}
@Override
public String toString() {
	return "veiculo [placa=" + placa + ", ano=" + ano + "]";
}

}
