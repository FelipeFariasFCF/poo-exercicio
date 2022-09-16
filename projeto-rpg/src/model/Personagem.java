package model;

public abstract class Personagem {

	protected String nome;
	protected Integer vida;
	protected Integer mana;
	protected Float xp;
	protected Integer inteligencia;
	protected Integer forca;
	protected Integer level;

	public Personagem(String nome, Integer vida, Integer mana, Float xp, Integer inteligencia, Integer forca,
			Integer level) {
		this.nome = nome;
		this.vida = vida;
		this.mana = mana;
		this.xp = xp;
		this.inteligencia = inteligencia;
		this.forca = forca;
		this.level = level;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getVida() {
		return vida;
	}

	public void setVida(Integer vida) {
		this.vida = vida;
	}

	public Integer getMana() {
		return mana;
	}

	public void setMana(Integer mana) {
		this.mana = mana;
	}

	public Float getXp() {
		return xp;
	}

	public void setXp(Float xp) {
		this.xp = xp;
	}

	public Integer getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(Integer inteligencia) {
		this.inteligencia = inteligencia;
	}

	public Integer getForca() {
		return forca;
	}

	public void setForca(Integer forca) {
		this.forca = forca;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}
	
	public void lvlUp() {
	}	
}