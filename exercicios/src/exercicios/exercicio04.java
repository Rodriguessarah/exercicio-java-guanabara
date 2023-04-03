package exercicios;
import java.util.Scanner;

public class exercicio04 {
	public static void main(String[] args) {
		
		try (Scanner read = new Scanner(System.in)) {
			System.out.println(" informe o primeiro numero inteiro");
			int num1 = read.nextInt();
			System.out.println(" infome o segundo numero inteiro");
			int num2 = read.nextInt();
			
			int soma = num1 + num2;
			 
			System.out.println(" A soma é " + soma );
		}
	}

}
