package exercicios;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		
		int num1, num2;
		
		try (Scanner read = new Scanner (System.in)){
		
		System.out.println(" Infome o primeiro numero");
		num1 = read.nextInt();
		
		System.out.println(" Infome o segundo numero");
		num2 = read.nextInt();
		}
		if(num1 > num2) { 
			System.out.println("O primeiro valor é maior");
			
		} else if ( num1 < num2) { 
		
				System.out.println(" O segundo valor é maior");
				
			} else if  ( num1 == num2) { 
				System.out.println(" Os valores sao iguais");
			
			}
		}
		
	}


