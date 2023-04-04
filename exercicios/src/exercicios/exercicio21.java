package exercicios;

import java.util.Scanner;

public class exercicio21 {
	public static void main(String[] args) {
		
		int ano;
		
		try ( Scanner read = new Scanner (System.in)){
			
			System.out.println(" informe o ano");
			ano = read.nextInt();
			
			if (  ano % 4 ==0 && ano % 100 !=0 ) {
				System.out.println("O ano de " + ano + " é bissexto");
			} else { 
				if (ano % 4 ==0 && ano % 100 ==0 && ano %400 ==0 ) {
					System.out.println(" O ano de " + ano + " é bissexto");
				} else { 
					System.out.println("O ano de " + ano + "nao é bissexto");
				}
				
					
				
			
		}
		
		
		}
		
		
		
	}

}
