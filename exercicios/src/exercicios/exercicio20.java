package exercicios;

import java.util.Scanner;

public class exercicio20 {
	public static void main(String[] args) {
		
		int numero;
		
		try (Scanner read = new Scanner (System.in)) {
			System.out.println("Infome um numero");
			numero = read.nextInt();
		}
		if( numero % 2 == 0) {
			System.out.println(" Este numero é par");
			
		} else {
			System.out.println("Este numero é impar");
		}
	}

}
