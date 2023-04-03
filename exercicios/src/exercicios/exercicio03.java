package exercicios;
import java.util.Scanner;

public class exercicio03 {
	public static void main(String[] args) {
		
		try (Scanner read = new Scanner (System.in)) {
			System.out.println( "nome do funcionario");
			String nomeFunc = read.nextLine();
			
			System.out.println("salario");
			double salario = read.nextDouble(); 
			
			System.out.println( " O funcionario " + nomeFunc + " tem um salario de " + salario + " em junho");
		}
		
		
	}

}
