package exercicios;

import java.util.Scanner;


public class Exercicio25 {
	public static void main(String[] args) {
		
		int a, b, c;
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite o tamanho do segmento A: ");
			a = scan.nextInt();
			System.out.println("Digite o tamanho do segmento B: ");
			b = scan.nextInt();
			System.out.println("Digite o tamanho do segmento C: ");
			c = scan.nextInt();
		}
		if(a+b > c && b+c > a && a+c > b) {
			System.out.println("Com os valores mencionados, dá pra fazer o triângulo.");
		} 
		else {
			System.out.println("Infelizmente, com os valores mencionados, não dá pra fazer o triângulo.");
		}
		
	}
}
