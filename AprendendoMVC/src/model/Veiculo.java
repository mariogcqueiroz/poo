package model;

import java.util.ArrayList;

public class Veiculo {
	private String modelo;
	private String placa;
	private String nome;
	private ArrayList<String> veiculo = new ArrayList<>();
	
	public Veiculo() {
		
	}
	
	public void setVeiculo(String modelo, String placa, String nome) {
		setModelo(modelo);
		setPlaca(placa);
		setNome(nome);
	}
	
	public ArrayList<String> salvar() {
		veiculo.add(this.modelo);
		veiculo.add(this.placa);
		veiculo.add(this.nome);
		return veiculo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Veiculo [modelo=" + modelo + ", placa=" + placa + ", nome=" + nome + "]";
	}
	
	
}
