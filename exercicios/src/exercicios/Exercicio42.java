package exercicios;

import java.util.Scanner;

public class Exercicio42 {

	public static void main(String[] args) {
		
		int x, cont;
		Scanner read = new Scanner (System.in);
		System.out.println("Informe um numero inteiro e positivo");
		cont = read.nextInt();
		
		for ( x=1; x <=cont; x++) {
			System.out.println( x + " ");
			
				if(x == cont) {
				
					System.out.println("Acabou!");
				}
		}

	}

}
