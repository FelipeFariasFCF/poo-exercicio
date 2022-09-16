package main;

import model.Gerente;
import model.Supervisor;
import model.Vendedor;

public class Main {

	public static void main(String[] args) {
	
		Gerente gerente = new Gerente("Michael Scott", 50, 1000.0);
		System.out.println("Salario : " + gerente.getSalario());
		System.out.println("Salario + bonificacao : " + gerente.bonificacao());

		System.out.println();
		
		Supervisor supervisor = new Supervisor("Dwight S. ", 40, 1000.0);
		System.out.println("Salario : " + supervisor.getSalario());
		System.out.println("Salario + bonificacao : " + supervisor.bonificacao());
		
		System.out.println();
		
		Vendedor vendedor = new Vendedor("Jim Hawpert", 30, 1000.0);
		System.out.println("Salario : " + vendedor.getSalario());
		System.out.println("Salario + bonificacao : " + vendedor.bonificacao());
	}
}