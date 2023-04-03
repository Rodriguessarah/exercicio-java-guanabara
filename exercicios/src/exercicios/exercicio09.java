package exercicios;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		
		double reais;
		float dolar;
		try (Scanner read = new Scanner (System.in)) {
			System.out.println("informe o valor em reais");
			reais = read.nextDouble();
			//US$1,00 = R$5,17 //
		}
		
		dolar =  (float) (reais/5.17);
		System.out.printf(" o valor em dolares é de US$ %.2f", dolar);
		
	}

}
