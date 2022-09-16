package model;

public class Pessoa {

	private String name;
	private Integer idade;
	
	public Pessoa() {
	}

	public Pessoa(String name, Integer idade) {
		super();
		this.name = name;
		this.idade = idade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
}