package exercicios;
import java.util.Scanner;

public class exercicio05 {
	public static void main(String[] args) {
		
		try (Scanner read = new Scanner (System.in)) {
			double nota1, nota2;
			double media; 
			
			System.out.println("Informe a primeira nota");
			nota1 = read.nextDouble();
			
			System.out.println(" Informe a segunda nota");
			nota2 = read.nextDouble();
			
			media = (nota1 + nota2)/2;
			System.out.println(" a media entre "+ nota1 + "e " + nota2 + " é igual a " + media);
		}
			
			
		
	}

}
