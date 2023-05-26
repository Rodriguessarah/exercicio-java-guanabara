 package exercicios;

import java.util.Scanner;

public class Exercicio51 {

	public static void main(String[] args) {
		
		double maiorValor = 0;
		
		double[] valores = new double[8];
		Scanner scan = new Scanner(System.in);
		
		for(int x = 0; x <= 7; x++) {
			
			System.out.print("Digite o valor do produto: ");
			valores[x] = scan.nextDouble();
			
			if(valores[x] > maiorValor) {
				
				maiorValor = valores[x];
		
			}
		
		}
		
		double menorValor = valores[0];
		
		for(int x = 0; x <= 7; x++) {
			
			if(valores[x] < menorValor) {
				
				menorValor = valores[x];
				
			}
			
			
		}
		
		System.out.print("\nO maior valor digitado foi: " + maiorValor);
		System.out.print("\nO menor valor digitado foi: " + menorValor);
		
	}

}
