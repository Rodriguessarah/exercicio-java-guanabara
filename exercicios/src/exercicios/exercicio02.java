package exercicios;

import java.util.Scanner;
public class exercicio02 {
	public static void main(String[] args) {
		
		try (Scanner read = new Scanner(System.in)) {
			System.out.println("Qual o seu nome? ");
			
			String nome = read.nextLine();
			System.out.println(" ola "  + nome + " seja bem vindo");
		} 
		
	}

}
