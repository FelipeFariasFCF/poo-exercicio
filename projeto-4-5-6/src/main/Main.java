package main;

import java.util.ArrayList;
import java.util.List;

import model.Pessoa;

public class Main {

	public static void main(final String[] args) {

		List<Pessoa> list = new ArrayList<>();

		// ex 4
		int maior = 0;
		String maiorNome = "";
		list.add(new Pessoa("Joao", 15));
		list.add(new Pessoa("Leandro", 21));
		list.add(new Pessoa("Paulo", 17));
		list.add(new Pessoa("Jessica", 18));

		for (Pessoa p : list) {
			if (p.getIdade() > maior) {
				maior = p.getIdade();
				maiorNome = p.getName();
			}
		}
		System.out.println(maiorNome);

		// ex 5
		System.out.println(list.size());
	
		list = list.stream().filter(pessoa -> pessoa.getIdade() >= 18).toList();
		
		System.out.println(list.size());
		
		// ex 6
		for(Pessoa p: list) {
			if(p.getName() == "Jessica") {
				System.out.println(p.getIdade());
			}
		}
	}
}