package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mago extends Personagem {

	private List<String> magia = new ArrayList<>();
	
	public Mago(String nome, Integer vida, Integer mana, Float xp, Integer inteligencia, Integer forca,
			Integer level, String magia) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
		aprenderMagia(magia);
	}

	public List<String> getMagia() {
		return magia;
	}

	public void aprenderMagia(String magia) {
		this.magia.add(magia);
	}

	public void attack() {
		Random random = new Random();
		int numero = random.nextInt(300);
		int attack = (getInteligencia() * getLevel()) + numero;
		System.out.println("DANO ATTACK : " + attack);
	}

	@Override
	public void lvlUp() {
		level+=1;
		forca+=10;
		inteligencia+=20;
		mana+=20;
		xp+=10;
		vida+=10;
	}

	// metodo temporario para visualizar os testes
	@Override
	public String toString() {
		return "Mago: " +
				getNome() +
				", Inteligencia: " +
				getInteligencia() +
				", Forca: " + 
				getForca() + 
				", Vida: " +
				getVida() + 
				", Mana: " +
				getMana() + 
				", XP: " + 
				getXp() +
				", Level: " +
				getLevel();
	}
}