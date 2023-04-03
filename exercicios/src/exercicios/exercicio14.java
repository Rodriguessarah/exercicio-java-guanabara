package exercicios;

import java.util.Scanner;
public class exercicio14 {
	public static void main(String[] args) {
		
		double kmPercorrido, diasDeAluguel, precoTotal;
		
		try (Scanner read = new Scanner(System.in)) {
			System.out.println("Informe a quantidade de KM percorrido:");
			kmPercorrido = read.nextDouble();
			
			System.out.println("Informque a quantidade de dias de aluguel");
			diasDeAluguel = read.nextDouble();
		}
		precoTotal =(kmPercorrido*0.20)+ (diasDeAluguel*90);
		System.out.println(" o valor  total do aluguel é " + precoTotal + "reais");
}

}
