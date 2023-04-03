package exercicios;
import java.util.Scanner;

public class exercicio06 {
	public static void main(String[] args) {
		
		try (Scanner read = new Scanner (System.in)) {
			int num, antec, suces; 
			
			System.out.println("informe um numero inteiro");
			num = read.nextInt();
			
			antec = num-1;
			System.out.println(" o antecessor de " + num + "é " + antec);
			
			
			suces = num +1;
			System.out.println(" o sucessor de " + num + "é " + suces);
		}
		
	
	}

}
