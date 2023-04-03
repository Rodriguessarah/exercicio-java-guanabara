package exercicios;

import java.util.Scanner;


public class exercicio18 {

	public static void main(String[] args) {
		
		int idade;
		
		try (Scanner read = new Scanner (System.in)) {
			System.out.println("Infome a idade da pessoa que deseja votar");
			idade = read.nextInt();
		}
		
		if ( idade < 16 ) { 
			System.out.println("não pode votar ");
		} else { 
			
			if ( idade >=16 && idade <=17) {
				
				System.out.println(" o voto é opcional");
			} else { 
				System.out.println(" o voto é obrigatorio");
				
			}
		}
	}

}
