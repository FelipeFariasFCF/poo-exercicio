package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem{
	
	private List<String> habilidade = new ArrayList<>();
	
	public Guerreiro(String nome, Integer vida, Integer mana, Float xp, Integer inteligencia, Integer forca,
			Integer level, String habilidade) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
		aprenderHabilidade(habilidade);
	}

	public List<String> getHabilidade() {
		return habilidade;
	}

	public void aprenderHabilidade(String habilidade) {
		this.habilidade.add(habilidade);
	}

	public void attack() {
		Random random = new Random();
		int numero = random.nextInt(300);
		int attack = (getForca() * getLevel()) + numero;
		System.out.println("DANO ATTACK : " + attack);
	}

	@Override
	public void lvlUp() {
		level+=1;
		forca+=20;
		inteligencia+=10;
		mana+=10;
		xp+=10;
		vida+=20;
	}
	
	// metodo temporario para visualizar os testes
	@Override
	public String toString() {
		return "Guerreiro: " +
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