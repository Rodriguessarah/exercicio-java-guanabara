package exercicios;

import java.util.Scanner;

public class Exercicio34 {
	public static void main(String[] args) {
		
		try (Scanner read = new Scanner (System.in)) {
			System.out.println("Infome sua altura em metros:");
			double altura = read.nextDouble();
			
			System.out.println("Infome seu peso em KG:");
			int peso = read.nextInt();
			
			double imc; 
			imc= peso/ (altura*altura);
			
			if(imc <18.5) {
				System.out.println("Você está Abaixo do Peso");
			} else if (imc>= 18.5 && imc <25 ) {
					System.out.println("Você está com peso ideal");
				} else if ( imc >=25 && imc<30) {
					System.out.println(" Você está com sobrepreso");
				} else if ( imc >= 30 && imc< 40) {
					System.out.println("Você está com Obesidade");
				} else if ( imc >=40 ) {
					System.out.println(" Você está com obesidade morbida");
				}
		}
			
		}
		
		
	}

