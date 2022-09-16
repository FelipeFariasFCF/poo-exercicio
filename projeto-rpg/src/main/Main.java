package main;

import java.util.ArrayList;
import java.util.List;

import model.Guerreiro;
import model.Mago;
import model.Personagem;

public class Main {

	public static void main(String[] args) {
	
		Mago mago1 = new Mago("Gandalf", 100, 100, 100f, 100, 100, 1, "Fogo");
		Guerreiro guerreiro1 = new Guerreiro("Aragorn", 100, 100, 100f, 100, 100, 1, "Golpe pesado forte");
		List<Personagem> lista = new ArrayList<>();
		lista.add(mago1);
		lista.add(guerreiro1);
	
		System.out.println(mago1);
		mago1.lvlUp();
		System.out.println(mago1);
		mago1.attack();
		
		System.out.println();
		
		System.out.println(guerreiro1);
		guerreiro1.lvlUp();
		System.out.println(guerreiro1);
		guerreiro1.attack();
		
		System.out.println();
		System.out.println("Quantidade de personagens criados: " + qtdPersonagens(lista));
	}
	
	public static int qtdPersonagens(List<Personagem> lista) {
		return lista.size();
	}
}