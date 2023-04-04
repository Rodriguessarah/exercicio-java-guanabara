package exercicios;

import java.util.Scanner;

public class Exercicio22 {
	public static void main(String[] args) {
		
		int anoNascimento, idade, anosRestantes, anosPassados;
		final int ANO_VIGENTE = 2023;
		
		try ( Scanner read = new Scanner( System.in)) {
			
			System.out.println("Informe o ano de nascimento");
			anoNascimento = read.nextInt();	
		}
		
		idade = ANO_VIGENTE - anoNascimento;
		
		if (idade >= 18) { 
			anosPassados = idade - 18;
			System.out.println("Já se passaram " + anosPassados + " anos desde o seu alistamento militar.");
						
		} else {
			if  (idade < 18) {
		
			anosRestantes = 18 - idade;
			System.out.println("Faltam " + anosRestantes + "anos restantes para o seu alistamento militar.");
			
			}
		}

	}
}