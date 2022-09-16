package model;

import java.util.List;

public class Loja {

	private String nome;
	private String cnpj;
	
	private List<Livro> livros;
	private List<VideoGame> videoGames;
	
	public Loja() {
	}

	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void listaLivros() {
		System.out.println("A loja " + nome + " possui esses livros para venda:");
		if(livros.isEmpty() == true) {
			System.out.println("A loja nao tem livros no seu estoque.");
		} else {
			for(Livro l: livros) {
				System.out.println("TITULO: " + l.getNome() + ", preco: " + l.getPreco() + ", quantidade: " + l.getQtd() + " em estoque."); 
			}
		}
	}
	
	public void listaVideoGames() {
		System.out.println("A loja " + nome + " possui esses video-games para venda:");
		if(videoGames.isEmpty() == true) {
			System.out.println("A loja nao tem video-games no seu estoque.");
		} else {
			for(VideoGame v: videoGames) {
				System.out.println("Video-game: " + v.getNome() + " " + v.getModelo() +", preco: " + v.getPreco() + ", quantidade: " + v.getQtd() + " em estoque."); 
			}
		}
	}
	
	public Double calculaPatrimonio() {
		double total = 0;
		for(Livro l: livros) {
			total += l.getPreco() * l.getQtd();
		}
		for(VideoGame v: videoGames) {
			total += v.getPreco() * v.getQtd();
		}
		System.out.println("O patrimonio da loja: " + nome + " e de R$ " + String.format("%.2f", total));
		return total;
	}
}