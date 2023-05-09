package exercicios;

import java.util.Scanner;

public class Exercicio45 {

	public static void main(String[] args) {
		
		int x,valorInicial, valorFinal, incremento;
		
		try (Scanner read = new Scanner(System.in)) {
			System.out.println(" Digite o valor inicial");
			valorInicial = read.nextInt();
			
			System.out.println(" Digite o valor final");
			valorFinal = read.nextInt();
			
			System.out.println("Digite o incremento");
			incremento = read.nextInt();
		}
		for ( x=valorInicial; x <= valorFinal; x = x+ incremento) {
			 
			 System.out.println(x +" ");
		 } if (valorInicial >= valorFinal) {
			 for ( x=valorInicial; x >= valorFinal; x = x- incremento) {
				 
				 System.out.println(x +" ");
			 
		 }
		
		
	}

	}
}

