package exercicios;

import java.util.Scanner;

public class Exercicio27 {
	
	public static void main(String[] args) {
	
	double notaA, notaB, media;
	
		try (Scanner scan = new Scanner(System.in)){
			System.out.println("Informe sua primeira nota: ");
			notaA = scan.nextDouble();
			System.out.println("Informe sua segunda nota: ");
			notaB = scan.nextDouble();
		}
		media = (notaA + notaB) / 2;
	
		if(media <= 4.9) {
			System.out.println("REPROVADO");
		}
		else if(media >= 5.0 && media <= 6.9) {
			System.out.println("RECUPERAÇÃO");
		}
		else if(media >= 7.0) {
			System.out.println("APROVADO");

			}
		}
	}
