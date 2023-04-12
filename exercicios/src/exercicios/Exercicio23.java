package exercicios;

import java.util.Scanner;
public class Exercicio23 {

	public static void main(String[] args) {
		String nome;
		int op;
		double valor, valorDesconto;
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Qual seu nome? ");
			nome = scan.next();
			
			System.out.println("Qual o valor das compras? ");
			valor = scan.nextDouble();
			
			System.out.println("Qual genero você se identifica abaixo:\n\n1. Mulher\n2. Homem\n\nDigite o número escolhido: ");
			op = scan.nextInt();
		}
		switch(op) {
		
		case 1:
			valorDesconto = valor-(valor * 0.13);
			System.out.println(nome + "! Você ganhou 13% de desconto!\nDe R$ " + valor + " por R$ " + valorDesconto);
			break;
		case 2:
			valorDesconto = valor-( valor* 0.05);
			System.out.println(nome +"! Você ganhou 5% de desconto!\nDe R$ " + valor + " por R$ " + valorDesconto);
			break;
		default:
			System.out.println("Não há essa opção no menu!");
			break;
			
		
		}	

	}

}
