package exercicios;

import java.util.Scanner;
public class exercicio10 { 	
	public static void main(String[] args) { 
		
		double largura,altura, areaDePintura, quantidadeTinta;
		
		Scanner read = new Scanner (System.in);
		
		System.out.println(" informa a largura da parede que você deseja pintar");
		largura = read.nextDouble();
		
		System.out.println(" informe a altura da parede que você deseja pintar");
		altura = read.nextDouble(); 
		
		areaDePintura = largura*altura;
		System.out.println(" A area a ser pintada é de " + areaDePintura + "m²") ;
		
		// 1L = 2m²//
		quantidadeTinta = areaDePintura/2;
		System.out.println("A quantidade de tinta  necessaria será de: " + quantidadeTinta + " L");
	}

}
