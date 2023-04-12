package exercicios;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		
		double distancia;
		double valor;
	
		try (Scanner read = new Scanner (System.in)){
		
		System.out.println(" informa a distancia ,em KM, da viagem");
		distancia = read.nextDouble();
		}
		
		if (distancia <= 200.00) {
			valor = distancia*0.50;
			System.out.println(" O valor da passagem é " + valor + "reais");
			 	
		} else if (distancia >200 ) {
			
			valor = distancia*0.45;
			System.out.println(" O valor da passagem é " + valor + "reais");
		}
		
	}

}
