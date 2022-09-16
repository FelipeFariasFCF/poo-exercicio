package model;

import interfaces.Imposto;

public class Livro extends Produto implements Imposto{

	private String autor;
	private String tema;
	private Integer qtdPag;
	
	public Livro() {
		super();
	}

	public Livro(String nome, Double preco, Integer qtd, String autor, String tema, Integer qtdPag) {
		super(nome, preco, qtd);
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public Integer getQtdPag() {
		return qtdPag;
	}

	public void setQtdPag(Integer qtdPag) {
		this.qtdPag = qtdPag;
	}

	@Override
	public double calcularImposto() {
		double total = 0;
		if(tema == "educativo") {
			System.out.println("Livro educativo nao tem imposto: " + getNome());
			return total;
		} else {
			total = getPreco() * 0.1;
			System.out.println("R$ " + String.format("%.2f", total) + " de imposto sobre o livro " + getNome());
			return total;
		}
	}	
}
