package exercicios;
import java.util.Scanner;

public class Exercicio48 {

	public static void main(String[] args) {
		int x, num, soma=0;
		
		try (Scanner read = new Scanner (System.in)) {
			for(x = 1; x <= 7; x++) {
			
			System.out.print("Digite um numero inteiro: ");
			num = read.nextInt();
			
			soma += num;
		
			}
		}
			System.out.println("A soma entre os números acima é " + soma);
	

	}

}
