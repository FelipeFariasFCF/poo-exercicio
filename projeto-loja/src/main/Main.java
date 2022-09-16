package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Livro;
import model.Loja;
import model.VideoGame;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Livro l1 = new Livro("Harry Potter", 40.0, 50, "J. K. Rowling", "fantasia", 300);
		Livro l2 = new Livro("Senhor dos Aneis", 60.0, 30, "J. R. R. Tolkien", "fantasia", 500);
		Livro l3 = new Livro("Java POO", 20.0, 50, "GFT", "educativo", 500);
		
		VideoGame ps4 = new VideoGame("PS4", 1800.0, 100, "Sony", "Slim", false);
		VideoGame ps4Usado = new VideoGame("PS4", 1000.0, 7, "Sony", "Slim", true);
		VideoGame xbox = new VideoGame("XBOX", 1500.0, 500, "Microsoft", "One", false);
		
		List<Livro> livros = new ArrayList<>();
		livros.add(l1);
		livros.add(l2);
		livros.add(l3);
		
		List<VideoGame> games = new ArrayList<>();
		games.add(ps4);
		games.add(ps4Usado);
		games.add(xbox);
		
		Loja americanas = new Loja("Americanas", "12345678", livros, games);
		l1.calcularImposto();
		l2.calcularImposto();
		l3.calcularImposto();
		
		// OUTPUT DO PDF ESTA COM CALCULO INCORRETO DO PS4
		// 1800 / 45% = 810.00
		ps4.calcularImposto();
		ps4Usado.calcularImposto();
		xbox.calcularImposto();
		
		System.out.println("-------------------------------------");
		
		americanas.listaLivros();
		
		System.out.println("-------------------------------------");
		
		americanas.listaVideoGames();
		
		System.out.println("-------------------------------------");
		
		americanas.calculaPatrimonio();
		
		sc.close();
	}
}