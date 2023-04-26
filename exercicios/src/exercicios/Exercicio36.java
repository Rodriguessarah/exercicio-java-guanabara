package exercicios;

import java.util.Scanner;

public class Exercicio36 {
	public static void main(String[] args) {
		
		double horasDeAtividade, pontos, cashback;
		
		try (Scanner read = new Scanner (System.in)) {
			System.out.println("Informe a quantidade de horas realidade duramte o mês");
			horasDeAtividade = read.nextDouble();
		
		
		if (horasDeAtividade <10) {
			pontos = horasDeAtividade *2;
			cashback = pontos * 0.05;
			System.out.println("Voce fez " + pontos + "pontos");
			System.out.println("e irá receber " + cashback + "reais");
		} else if 
			(horasDeAtividade >=10 && horasDeAtividade <=20) {
			pontos = horasDeAtividade *5;
			cashback = pontos * 0.05;
			System.out.println("Voce fez " + pontos + "pontos");
			System.out.println("e irá receber " + cashback + "reais");
		} else if (horasDeAtividade >20) {
			pontos = horasDeAtividade *10;
			cashback = pontos * 0.05;
			System.out.println("Voce fez " + pontos + "pontos");
			System.out.println("e irá receber " + cashback + "reais");
		}
		
	
	}
	}
}
