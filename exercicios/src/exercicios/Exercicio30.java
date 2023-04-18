package exercicios;


import java.util.Scanner;

public class Exercicio30 {
	public static void main(String[] args) {
int a, b, c;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o tamanho do segmento A: ");
		a = scan.nextInt();
		System.out.println("Digite o tamanho do segmento B: ");
		b = scan.nextInt();
		System.out.println("Digite o tamanho do segmento C: ");
		c = scan.nextInt();
		
		if(a == b && b == c) {
			System.out.println("EQUILÁTERO");
		}
		else if(a == b || b == c) {
			System.out.println("ISÓSCELES");
		}
		else if(a != b && b != c) {
			System.out.println("ESCALENO");
		
	}

}

}