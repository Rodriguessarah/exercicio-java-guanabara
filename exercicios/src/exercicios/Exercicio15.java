package exercicios;

import java.util.Scanner;

public class Exercicio15 { 
	
	public static void main(String[] args) {
	
		int diasTrabalhados,valorDia;
		double salario;
		
		try (Scanner read = new Scanner (System.in)) {
			System.out.println("Infome a quantidade de dias trabalhados");
			diasTrabalhados = read.nextInt();
		}
		
		
		
		
		/* 8 horas por dia e  25 por hora trabalhada.*/
		
		valorDia = (8*25);
		salario = diasTrabalhados * valorDia ;
		
		System.out.println("Seu salário será: R$" + salario);
		
				
}

}
