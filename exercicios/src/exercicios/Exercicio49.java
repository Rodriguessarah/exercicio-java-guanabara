package exercicios;
import java.util.Scanner;

public class Exercicio49 {

	public static void main(String[] args) {
		int x, num, pares = 0, impares = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for(x = 1; x <= 6; x++) {
			
			System.out.print("Digite um número inteiro: ");
			num = scan.nextInt();
			
			if(num % 2 == 0) {
				
				pares++;
				
			}
			
			else if(num % 2 != 0) {
				
				impares++;
			}
			
		}
		
		System.out.println(pares + " são pares.\n" + impares + " são ímpares.");
		
	}

}