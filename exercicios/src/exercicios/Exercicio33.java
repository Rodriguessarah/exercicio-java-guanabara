package exercicios;

import java.util.Scanner;

public class Exercicio33 {
	public static void main(String[] args) {
		
		double valorCasa, salarioComprador, prestacaoMensal;
		int tempoDePagamento;
		
		Scanner read = new Scanner (System.in);
		System.out.println("Informe o valor da casa");
		valorCasa = read.nextDouble();
		
		System.out.println(" Informe o sálario do comprador");
		salarioComprador = read.nextDouble();
		
		System.out.println(" Informe, em anos, por quanto tempo ira pagar");
		tempoDePagamento = read.nextInt();
		
		
		prestacaoMensal = valorCasa/ (tempoDePagamento *12);
		
		if (prestacaoMensal > (salarioComprador*0.30)) {
			
			System.out.println(" Emprestimo negado");
			
		} else { 
				System.out.println(" Emprestimo Concedido");
		}
		
	}
	

}
