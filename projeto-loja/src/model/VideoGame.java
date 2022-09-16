package model;

import interfaces.Imposto;

public class VideoGame extends Produto implements Imposto{

	private String marca;
	private String modelo;
	private Boolean isUsado;
	
	public VideoGame() {
		super();
	}

	public VideoGame(String nome, Double preco, Integer qtd, String marca, String modelo, Boolean isUsado) {
		super(nome, preco, qtd);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Boolean getIsUsado() {
		return isUsado;
	}

	public void setIsUsado(Boolean isUsado) {
		this.isUsado = isUsado;
	}

	@Override
	public double calcularImposto() {
		double total = 0;
		if(isUsado == true) {
			total = getPreco() * 0.25; 
			System.out.println("Imposto " + getNome() + " " + modelo + " usado, R$ " + total);
			return total;
		} else {
			total = getPreco() * 0.45; 
			System.out.println("Imposto " + getNome() + " " + modelo + " R$ " + total);
			return total;
		}
	}
}
