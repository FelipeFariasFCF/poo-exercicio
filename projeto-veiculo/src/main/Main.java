package main;

import java.util.Scanner;

import model.Veiculo;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Veiculo celta = new Veiculo("Chevrolet", "Celta", "POP-1234", "PRETO", 15000f, false, 20, 0, 15000.00);
		
		// teste 1 - ligar veiculo
		//celta.setIsLigado(false);
		//celta.setIsLigado(true);
		celta.ligar();
		
		// teste 2 - desligar veiculo
		//celta.setIsLigado(true);
		//celta.setIsLigado(false);
		//celta.setVelocidade(10);
		celta.desligar();
		
		// teste 3 - pintar veiculo
		//System.out.println(celta.getCor());
		//celta.pintar("BRANCO");
		
		// teste 4 - abastecer
		//celta.abastecer(50);
		celta.abastecer(10);
		
		// teste 5 - acelerar
		//System.out.println(celta.getVelocidade());
		celta.acelerar();
		//System.out.println(celta.getVelocidade());
		
		// teste 6 - frear
		//System.out.println(celta.getVelocidade());
		//celta.frear();
		//celta.setVelocidade(180);
		//System.out.println("Velocidade atual = " + celta.getVelocidade());
		celta.frear();
	
		sc.close();
	}
}